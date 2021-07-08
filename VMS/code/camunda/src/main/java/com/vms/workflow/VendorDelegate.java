package com.vms.workflow;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;

import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.TaskService;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.engine.impl.TaskServiceImpl;
import org.camunda.bpm.engine.ManagementService;

import org.camunda.bpm.engine.variable.value.FileValue;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

public class VendorDelegate implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {

		
		downloadFile(execution);
		
		System.out.println("done");
		
		TaskService ts = new TaskServiceImpl();
		


	}
	
	private static void downloadFile(DelegateExecution execution) throws IOException{
		
		RuntimeService runtimeService = (RuntimeService) execution.getProcessEngine().getRuntimeService();

		FileValue retrievedTypedFileValue = runtimeService.getVariableTyped(execution.getId(), "fup");
		
		if(null != retrievedTypedFileValue) {
			
			InputStream fileContent = retrievedTypedFileValue.getValue(); 
			String fileName = retrievedTypedFileValue.getFilename(); 

			if (null != fileContent) {

				ByteArrayOutputStream buffer = new ByteArrayOutputStream();
				int nRead;
				byte[] data = new byte[1024];
				while ((nRead = fileContent.read(data, 0, data.length)) != -1) {
					buffer.write(data, 0, nRead);
				}

				buffer.flush();
				byte[] byteArray = buffer.toByteArray();

				byte[] decodedBytes = Base64.getEncoder().encode(byteArray);
				decodedBytes = Base64.getDecoder().decode(decodedBytes);

				Path path = Paths.get("D:\\VMS\\DMS\\tbd\\" + fileName);
				Files.write(path, decodedBytes);

			}
			
		}

		
		
	}

	private static void uploadMultipleFile() throws IOException {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.MULTIPART_FORM_DATA);

		MultiValueMap<String, Object> body = new LinkedMultiValueMap<>();
		body.add("files", getTestFile());
		body.add("files", getTestFile());
		body.add("files", getTestFile());

		RestTemplate restTemplate = new RestTemplate();

		HttpEntity<MultiValueMap<String, Object>> requestEntity = new HttpEntity<>(body, headers);
		String serverUrl = "http://localhost:8081/uploadtbd";
		ResponseEntity<String> response = restTemplate.postForEntity(serverUrl, requestEntity, String.class);
		System.out.println("Response code: " + response.getStatusCode());
	}

	public static Resource getTestFile() throws IOException {
		Path testFile = Files.createTempFile(Paths.get("D:\\"), "my-file", ".txt");
		Files.write(testFile, "Hello World !!, This is a test file.".getBytes());
		return new FileSystemResource(testFile.toFile());
	}

}
