	var vendorCompId = '';
	var vendorRepId = '';
	var editOperation = false;


	var stepSectionIndexMap = { 0: "Basic", 1: "Compliance", 2: "Legal", 3: "AddlAddress", 4: "Bank" }
	var fileNameDomainTypeMap = new Object();
	
	function getSectionByIndex(k){
	  return stepSectionIndexMap[k];
	}
	
	function getvendorCompId(){
		return vendorCompId;
	}
	
    function setDocDetails(input, domainType) {
		var fileName = input.files[0].name;
		console.log("domainType"+domainType);
		fileNameDomainTypeMap[domainType]=fileName;
                       
    }
	
    function displayFileUploadCapability(domainType) {
		var filedomainType = $(domainType).val();
		if(filedomainType == 'CAPABILITY')
		{
			$("#capabalityStatementDiv").show(); $("#capabalityFileUploadDiv").show();
			
		}else{
			$("#capabalityStatementDiv").hide();$("#capabalityFileUploadDiv").hide();
		}
    }
	
	function displayFileUploadLine(domainType) {
		var filedomainType = $(domainType).val();
		if(filedomainType == 'LINE')
		{
			$("#lineStatementDiv").show(); $("#lineFileUploadDiv").show();
			
		}else{
			$("#lineStatementDiv").hide();$("#lineFileUploadDiv").hide();
		}
    }
	
	function displayFileUploadRelationship(domainType) {
		var filedomainType = $(domainType).val();
		var itemVal = $("#otherEntitySelect").val();
		if(filedomainType == 'RELATIONSHIP' && itemVal == 'YES')
		{
			$("#relationshipStatementDiv").show(); $("#relationshipFileUploadDiv").show();
			
		}else{
			$("#relationshipStatementDiv").hide();$("#relationshipFileUploadDiv").hide();
		}
    }
	
	function displayFileUploadInclusion(domainType) {
		var filedomainType = $(domainType).val();
		if(filedomainType == 'INCLUSION')
		{
			$("#inclusionStatementDiv").show(); $("#inclusionFileUploadDiv").show();
			
		}else{
			$("#inclusionStatementDiv").hide();$("#inclusionFileUploadDiv").hide();
		}
    }	
	
	function displayFileUploadInsurance(domainType) {
		var filedomainType = $(domainType).val();
		if(filedomainType == 'INSURANCE')
		{
			$("#insuranceStatementDiv").show(); $("#insuranceFileUploadDiv").show();
			
		}else{
			$("#insuranceStatementDiv").hide();$("#insuranceFileUploadDiv").hide();
		}
    }	
	
	function displayFileUploadTax(domainType) {
		var filedomainType = $(domainType).val();
		if(filedomainType == 'TAX')
		{
			$("#taxStatementDiv").show(); $("#taxFileUploadDiv").show();
			
		}else{
			$("#taxStatementDiv").hide();$("#taxFileUploadDiv").hide();
		}
    }		
	
	function displayFileUploadBusinessRegistration(domainType) {
		var filedomainType = $(domainType).val();
		if(filedomainType == 'BUSINESSREGISTRATION')
		{
			$("#businessRegistrationStatementDiv").show(); $("#businessRegistrationFileUploadDiv").show();
			
		}else{
			$("#businessRegistrationStatementDiv").hide();$("#businessRegistrationFileUploadDiv").hide();
		}
    }
	
	function displayFileUploadBank(domainType) {
		var filedomainType = $(domainType).val();
		if(filedomainType == 'BANK')
		{
			$("#bankStatementDiv").show(); $("#bankFileUploadDiv").show();
			
		}else{
			$("#bankStatementDiv").hide();$("#bankFileUploadDiv").hide();
		}
    }
	
	function displayBusinessRelationDocDropdown(item) {
		var itemValue = $(item).val().toUpperCase();
		if(itemValue == 'NO'){
			$("#fileRelationDomainTypeSelect").hide();$("#relationshipStatementDiv").hide();$("#relationshipFileUploadDiv").hide();
		}else if(itemValue == 'YES'){
			$("#fileRelationDomainTypeSelect").show();
			$('#fileRelationDomainTypeSelect').val('select').attr("selected", "true");
		}
    }
	
	function displayInsuranceDocDropdown(item) {

		var itemValue = $(item).val().toUpperCase();
		if(itemValue == 'NO'){
			$("#fileInsuranceDomainTypeSelect").hide();$("#insuranceStatementDiv").hide();$("#insuranceFileUploadDiv").hide();
		}else if(itemValue == 'YES'){
			$("#fileInsuranceDomainTypeSelect").show();
			$('#fileInsuranceDomainTypeSelect').val('select').attr("selected", "true");
		}
    }
	
	function displayAddlAddressFields(selectedDiv) {
			var locSelectedDiv = "#"+selectedDiv;
			$(locSelectedDiv).show();
    }	
	function hideAddlAddressFields(selectedDiv) {
			var locSelectedDiv = "#"+selectedDiv;
			$(locSelectedDiv).hide();
    }	
	
	
	
	
		
    function saveVendorBasicData(){
		

		var requestMethod="POST";
		
		var capabilityFileName = $('input[type=file]').val().match(/[^\\/]*$/)[0];


	
		if(vendorCompId > 0){
			editOperation = true;
			 
			requestMethod="PUT";
			
		}else{
			
			//alert("New Opeartion: "+requestMethod + " vendor rep Id:" + vendorRepId);
		}        
		
		var companyName = $('#companyName').val();
        var companyName = $('#companyName').val();
        var companyWebsite = $('#companyWebsite').val();
        var companyPhone = $('#companyPhone').val();
        var companyFax = $('#companyFax').val();


        var addrFirstLineB = $('#addrFirstLineB').val();
        var addrSecondLineB = $('#addrSecondLineB').val();
        var basiccountryselect = $('#basiccountryselect').val();
        var basicstateselect = $('#basicstateselect').val();
        var basiccityselect = $('#basiccityselect').val();
        var basiczipselect = $('#basiczipselect').val();
		
        var firstName = $('#firstName').val();
        var lastName = $('#lastName').val();
        var email = $('#email').val();
        var mobileNumber = $('#mobileNumber').val();

				var address = [
            		{
                		"addrFirstLine": addrFirstLineB,
                		"addrSecondLine": addrSecondLineB,
                		"country": basiccountryselect,
                		"state": basicstateselect,
                		"city": basiccityselect,
                		"zipCode": basiczipselect,
                		"addrType":"corpaddr"
            	    }

				];
                var vendor = [
					{
						"id": vendorRepId,
						"firstName": firstName,
						"lastName": lastName,
						"email": email,
						"mobileNumber": mobileNumber
					}
				];
                /*var fileNameDomainTypeMap =
					{
                        "VMSCapability.pdf":"CAPABILITY",
                        "VMSLine.pdf":"LINE"
					};*/


				var vendorCompanyData = {
					"companyId":vendorCompId,
					"companyName": companyName,
					"companyWebsite": companyWebsite,
					"companyTurnOver":  $('#companyTurnOver').val(),
					"companyPhone": companyPhone,
					"companyFax": companyFax,
                    "taxIdNumber":  $('#taxIdNumber').val(),
					"address":address,
                    "fileNameDomainTypeMap":fileNameDomainTypeMap,
					"vendor":vendor
				};


				var jsonStr = JSON.stringify(vendorCompanyData);
				console.log(jsonStr);


                var vmsRegForm = $('#VmsRegForm')[0];
                var data = new FormData(vmsRegForm);

				data.append('action', new Blob([JSON.stringify(vendorCompanyData)],
				{
                    type: "application/json"
                }));

                var  restVendorRegBasicDataUrl = "http://localhost:8081/vendorcompanyreg/basic";

				
                $.ajax({
					url: restVendorRegBasicDataUrl ,
					type: requestMethod,
					data: data,
					enctype: 'multipart/form-data',
					processData: false,
					contentType: false,
					cache: false,
					success: function (res) {
                        console.log('SUCCESS');
						console.log(res);
						vendorCompId = res.companyId;
						vendorRepId = res['vendor'][0].id;
						fileNameDomainTypeMap = new Object();
                        //alert("Data Saved..."+vendorCompId + "Vendor Rep Id:"+vendorRepId);
                        //window.location.href='vendorcompanylist.html';
					},
					error: function (err) {
					    console.log('ERROR Please Investigate...');
						console.error(err);
						fileNameDomainTypeMap = new Object();
					}
				});


    }
	
	function saveVendorComplianceData(){

				var companyCompliance = 
					{
						"otherEntity": $('#otherEntitySelect').val(),
						"supplierIncl":  $('#supplierInclSelect').val(),
						/*"fileNameDomainTypeMap": 
							{
								"VMSRelationship.pdf":"RELATIONSHIP",
								"VMSInclusion.pdf":"INCLUSION",
								"VMSInsurance.pdf":"INSURANCE"
							},	*/
						"fileNameDomainTypeMap":fileNameDomainTypeMap,
						"insurance":  $('#insuranceSelect').val()
					};

				var jsonStr = JSON.stringify(companyCompliance);
				console.log(jsonStr);
				
				

                var vmsRegForm = $('#VmsRegForm')[0];
                var data = new FormData(vmsRegForm);

				data.append('action', new Blob([JSON.stringify(companyCompliance)],
				{
                    type: "application/json"
                }));

                var  restVendorRegComplianceDataUrl = "http://localhost:8081/vendorcompanyreg/compliance/"+vendorCompId;

                $.ajax({
					url: restVendorRegComplianceDataUrl ,
					type: "POST",
					data: data,
					enctype: 'multipart/form-data',
					processData: false,
					contentType: false,
					cache: false,
					success: function (res) {
                        console.log('SUCCESS');
						console.log(res);
						vendorCompId = res.companyId;
						fileNameDomainTypeMap = new Object();
                        //alert("Data Saved..."+vendorCompId);
                        //window.location.href='vendorcompanylist.html';
					},
					error: function (err) {
					    console.log('ERROR Please Investigate...');
						console.error(err);
						fileNameDomainTypeMap = new Object();
					}
				});


    }	
	
	function saveVendorLegalData(){

				var companyLegal = 
					{
						"legalEntity": $('#legalEntityselect').val(),
						"dunsNumber":  $('#dunsNumber').val(),
						/*"fileNameDomainTypeMap": 
							{
								"VMSW8.pdf":"TAX",
								"VMSLegal.pdf":"BUSINESSREGISTRATION"
							},*/
						"fileNameDomainTypeMap":fileNameDomainTypeMap,
						"serviceArea":  $('#serviceArea').val()
					};

				var jsonStr = JSON.stringify(companyLegal);
				console.log(jsonStr);
				
				

                var vmsRegForm = $('#VmsRegForm')[0];
                var data = new FormData(vmsRegForm);

				data.append('action', new Blob([JSON.stringify(companyLegal)],
				{
                    type: "application/json"
                }));

                var  restVendorRegLegalDataUrl = "http://localhost:8081/vendorcompanyreg/legal/"+vendorCompId;

                $.ajax({
					url: restVendorRegLegalDataUrl ,
					type: "POST",
					data: data,
					enctype: 'multipart/form-data',
					processData: false,
					contentType: false,
					cache: false,
					success: function (res) {
                        console.log('SUCCESS');
						console.log(res);
						vendorCompId = res.companyId;
						fileNameDomainTypeMap = new Object();
                        //alert("Data Saved..."+vendorCompId);
                        //window.location.href='vendorcompanylist.html';
					},
					error: function (err) {
					    console.log('ERROR Please Investigate...');
						console.error(err);
						fileNameDomainTypeMap = new Object();
					}
				});


    }
	
	function getSavedDocsForDownload(){

				

                var  restDocsDownloadUrl = "http://localhost:8081/doclist/qwer";
				console.log(restDocsDownloadUrl);
                $.ajax({
					url: restDocsDownloadUrl,
					type: "GET",
					processData: false,
					contentType: "application/json; charset=utf-8",
					cache: false,
					success: function (res) {
                        console.log('SUCCESS');
						console.log(res);
						
						var tr=[];
						//$('#docDisplaytable').empty();
						$('#docDisplaytable').find('tbody').detach();
						
						
						for (var i = 0; i < res.length; i++) {
							tr.push('<tr>');
							//tr.push('<th class=\'docId\' scope="row">'+ res[i].docId +' </th>')
							
							//tr.push('<td>' + res[i].docName + '</td>');
							tr.push('<td> <a href='+res[i].docPath+'>' + res[i].docName + '</a></td>');
							tr.push('<td>' + res[i].docDomainType + '</td>');
							tr.push('<td><button class=\'delete btn btn-danger waves-effect \' id=' + res[i].docId + ' >Delete</button></td>');
							tr.push('</tr>');
						}
						$('#docDisplaytable').append($(tr.join('')));	
						
						
                        
					},
					error: function (err) {
					    console.log('ERROR Please Investigate...');
						console.error(err);
					}
				});


    }
	
	function saveVendorCompAddlAddr(){
	
	
                var addrFirstLinePO = $('#addrFirstLinePO').val();
                var addrSecondLinePO = $('#addrSecondLinePO').val();
                var pocountryselect = $('#pocountryselect').val();
                var postateselect = $('#postateselect').val();
                var pocityselect = $('#pocityselect').val();
                var pozipselect = $('#pozipselect').val();

                var addrFirstLineCL = $('#addrFirstLineCL').val();
                var addrSecondLineCL = $('#addrSecondLineCL').val();
                var claimcountryselect = $('#claimcountryselect').val();
                var claimstateselect = $('#claimstateselect').val();
                var claimcityselect = $('#claimcityselect').val();
                var claimzipselect = $('#claimzipselect').val();

                var addrFirstLineRet = $('#addrFirstLineRet').val();
                var addrSecondLineRet = $('#addrSecondLineRet').val();
                var returncountryselect = $('#returncountryselect').val();
                var returnstateselect = $('#returnstateselect').val();
                var returncityselect = $('#returncityselect').val();
                var returnzipselect = $('#returnzipselect').val();

				
				var poaddr = {
						"addrFirstLine": addrFirstLinePO,
						"addrSecondLine": addrSecondLinePO,
						"country": pocountryselect,
						"state": postateselect,
						"city": pocityselect,
						"zipCode": pozipselect,
						"addrType":"poaddr"
					};
				
				var claimaddr = {
						"addrFirstLine": addrFirstLineCL,
						"addrSecondLine": addrSecondLineCL,
						"country": claimcountryselect,
						"state": claimstateselect,
						"city": claimcityselect,
						"zipCode": claimzipselect,
						"addrType":"claimaddr"
					};
					
				var returnaddr = {
						"addrFirstLine": addrFirstLineRet,
						"addrSecondLine": addrSecondLineRet,
						"country": returncountryselect,
						"state": returnstateselect,
						"city": returncityselect,
						"zipCode": returnzipselect,
						"addrType":"returnaddr"
					};

				var companyAddlAddr = 
					{
						"poaddr": poaddr,
						"claimaddr": claimaddr,
						"returnaddr": returnaddr
					};
				
				var addlAddr = {
					"addladdr":companyAddlAddr
				};

				var jsonStr = JSON.stringify(addlAddr);
				console.log(jsonStr);
                var data = jsonStr;
                var  restVendorRegAddlAddrUrl = "http://localhost:8081/vendorcompanyreg/addladdr/"+vendorCompId;

                $.ajax({
					url: restVendorRegAddlAddrUrl ,
					type: "POST",
					data: data,
					processData: false,
					contentType: "application/json; charset=utf-8",
					cache: false,
					success: function (res) {
                        console.log('SUCCESS');
						console.log(res);
						vendorCompId = res.companyId;
                        //alert("Data Saved..."+vendorCompId);
                        
					},
					error: function (err) {
					    console.log('ERROR Please Investigate...');
						console.error(err);
					}
				});


    }
	
	function saveVendorCompBankDetail(){
	
	
				var bankAccount = 
					{
						"accountName": $('#accountName').val(),
						"accountNumber": $('#accountNumber').val(),
						"routingNumber": $('#routingNumber').val(),
						"accountType": $('#accountType').val()
					};
				

                var addrFirstLineRemit = $('#addrFirstLineRemit').val();
                var addrSecondLineRemit = $('#addrSecondLineRemit').val();
                var remitcountryselect = $('#remitcountryselect').val();
                var remitstateselect = $('#remitstateselect').val();
                var remitcityselect = $('#remitcityselect').val();
                var remitzipselect = $('#remitzipselect').val();
				
				var remitAddr = {
						"addrFirstLine": addrFirstLineRemit,
						"addrSecondLine": addrSecondLineRemit,
						"country": remitcountryselect,
						"state": remitstateselect,
						"city": remitcityselect,
						"zipCode": remitzipselect,
						"addrType":"remitaddr"
					};

				var bankAccountData = 
					{
						"bankAccount": bankAccount,
						"address": remitAddr,

						"fileNameDomainTypeMap":fileNameDomainTypeMap
					};
				

				var jsonStr = JSON.stringify(bankAccountData);
				console.log(jsonStr);
                var vmsRegForm = $('#VmsRegForm')[0];
                var data = new FormData(vmsRegForm);

				data.append('action', new Blob([JSON.stringify(bankAccountData)],
				{
                    type: "application/json"
                }));				
  
                var  restVendorRegBankUrl = "http://localhost:8081/vendorcompanyreg/bank/"+vendorCompId;

                $.ajax({
					url: restVendorRegBankUrl ,
					type: "POST",
					data: data,
					enctype: 'multipart/form-data',
					processData: false,
					contentType: false,
					cache: false,
					success: function (res) {
                        console.log('SUCCESS');
						console.log(res);
						vendorCompId = res.companyId;
						fileNameDomainTypeMap = new Object();
                        //alert("Data Saved..."+vendorCompId);
					},
					error: function (err) {
					    console.log('ERROR Please Investigate...');
						console.error(err);
						fileNameDomainTypeMap = new Object();
					}
				});


    }	
	
var addrdropdownhelpers =
				{
					buildDropdown: function(result, dropdown, emptyMessage, domain, selecteditem)
					{
						dropdown.html('');
						dropdown.append('<option value="">' + emptyMessage + '</option>');
						if(result != '')
						{
							var len = result.length;
						   for( var i = 0; i<len; i++){
						       if(domain == 'country'){
						            var id = result[i].countryCode;
							        var name = result[i].countryName;
							        dropdown.append("<option value='"+id+"'>"+name+"</option>");

						       }else if(domain == 'state'){
                                    var id = result[i].stateCode;
							        var name = result[i].stateName;
                                    if(id == selecteditem){
                                        dropdown.append("<option value='"+id+"' selected>"+name+"</option>");
                                    }else{
                                        dropdown.append("<option value='"+id+"'>"+name+"</option>");
                                    }

						       }else if(domain == 'city'){
                                    var id = result[i].cityCode;
							        var name = result[i].cityName;
							        if(id == selecteditem){
                                        dropdown.append("<option value='"+id+"' selected>"+name+"</option>");
                                    }else{
                                        dropdown.append("<option value='"+id+"'>"+name+"</option>");
                                    }
						       }
                               else if(domain == 'zip'){
                                    var id = result[i].zipCode;
							        var name = result[i].zipCodeName;
							        if(id == selecteditem){
                                        dropdown.append("<option value='"+id+"' selected>"+name+"</option>");
                                    }else{
                                        dropdown.append("<option value='"+id+"'>"+name+"</option>");
                                    }
						       }

							}
						}
					},

                    buildCountry: function(dropdownname)
                    {
                        console.log(dropdownname);
                        var countryValUrl = "http://localhost:8081/country";
                		$.ajax({
                					type: "GET",
                					contentType: "application/json; charset=utf-8",
                					url: countryValUrl,
                					cache: false,
                					success: function(data) {
                						addrdropdownhelpers.buildDropdown( data,   dropdownname,  'Select an option', 'country', '' );
                					},
                					error: function(err) {
                						console.log("ERROR");
                					}
                				});


                    },
                    buildState: function(countrySelect, setDDName, selectedItem)
                    {

                        //var countrySelect = changeDDName.val();
                        console.log("countrySelect:"+countrySelect);
                        setDDName.find("option:gt(0)").remove();
                        setDDName.find("option:first").text("Loading...");
                        var url = 'http://localhost:8081/state/'+countrySelect;
                        console.log("url:"+url);
                        $.getJSON(url, function(json) {
            				console.log(json);
                            addrdropdownhelpers.buildDropdown( json,   setDDName,  'Select an option', 'state', selectedItem );

            			});
                    },

                    buildCity: function(stateSelect, setDDName, selectedItem)
                    {

                        //var stateSelect = changeDDName.val();
                        console.log("stateSelect:"+stateSelect);
                        setDDName.find("option:gt(0)").remove();
                        setDDName.find("option:first").text("Loading...");
                        var url = 'http://localhost:8081/city/'+stateSelect;
                        console.log("url:"+url);
                        $.getJSON(url, function(json) {
            				console.log(json);
                            addrdropdownhelpers.buildDropdown( json,   setDDName,  'Select an option', 'city', selectedItem );

            			});
                    },

                    buildZip: function(citySelect, setDDName, selectedItem)
                    {

                        //var citySelect = changeDDName.val();
                        console.log("citySelect:"+citySelect);
                        setDDName.find("option:gt(0)").remove();
                        setDDName.find("option:first").text("Loading...");
                        var url = 'http://localhost:8081/zip/'+citySelect;
                        console.log("url:"+url);
                        $.getJSON(url, function(json) {
            				console.log(json);
                            addrdropdownhelpers.buildDropdown( json,   setDDName,  'Select an option', 'zip', selectedItem );

            			});
                    }

				}




            var populateHelpers =
				{

                    populateField: function(data)
					{

                        console.log("populateField...");
                        $('#companyName').val(data.companyName);
                        $('#companyWebsite').val(data.companyWebsite);
                        $('#companyPhone').val(data.companyPhone);
                        $('#companyFax').val(data.companyFax);
						$('#taxIdNumber').val(data.taxIdNumber);
                        $('#firstName').val(data['vendor'][0].firstName);
                        $('#lastName').val(data['vendor'][0].lastName);
                        $('#email').val(data['vendor'][0].email);
        			    $('#mobileNumber').val(data['vendor'][0].mobileNumber);
						$('#vendorRepId').val(data['vendor'][0].id);
						$('#companyTurnOver').val(data.companyTurnOver).attr("selected", "true");
						
						$('#vendorRepName').text(data['vendor'][0].firstName);

						$('#vendorRepEmail').text(data['vendor'][0].email);
						
						vendorRepId = data['vendor'][0].id;

                        var addrArray =  data['address'];

                        $.each( addrArray, function( index, addrValue ){
                            var addrtype =  addrValue.addrType;
                            if(addrtype == 'corpaddr'){
                                //alert(addrtype);

                                $('#addrFirstLineB').val(addrValue.addrFirstLine);
                                $('#addrSecondLineB').val(addrValue.addrSecondLine);
                                $('#basiccountryselect').val(addrValue.country).attr("selected", "selected");
                                //alert("corp.."+addrValue.state)
                                addrdropdownhelpers.buildState(addrValue.country,$("#basicstateselect"), addrValue.state);
                                addrdropdownhelpers.buildCity(addrValue.state,$("#basiccityselect"), addrValue.city);
                                addrdropdownhelpers.buildZip(addrValue.city,$("#basiczipselect"), addrValue.zipCode);


                            }else if(addrtype == 'poaddr'){
                                //alert(addrtype);
                                $('#addrFirstLinePO').val(addrValue.addrFirstLine);
                                $('#addrSecondLinePO').val(addrValue.addrSecondLine);
                                $('#pocountryselect').val(addrValue.country).attr("selected", "selected");
                                //alert("po.."+addrValue.state)
                                addrdropdownhelpers.buildState(addrValue.country,$("#postateselect"), addrValue.state);
                                addrdropdownhelpers.buildCity(addrValue.state,$("#pocityselect"), addrValue.city);
                                addrdropdownhelpers.buildZip(addrValue.city,$("#pozipselect"), addrValue.zipCode);

                            }else if(addrtype == 'claimaddr'){
                                //alert(addrtype);
                                $('#addrFirstLineCL').val(addrValue.addrFirstLine);
                                $('#addrSecondLineCL').val(addrValue.addrSecondLine);
                                $('#claimcountryselect').val(addrValue.country).attr("selected", "selected");
                                //alert("po.."+addrValue.state)
                                addrdropdownhelpers.buildState(addrValue.country,$("#claimstateselect"), addrValue.state);
                                addrdropdownhelpers.buildCity(addrValue.state,$("#claimcityselect"), addrValue.city);
                                addrdropdownhelpers.buildZip(addrValue.city,$("#claimzipselect"), addrValue.zipCode);

                            }else if(addrtype == 'returnaddr'){
                                $('#addrFirstLineRet').val(addrValue.addrFirstLine);
                                $('#addrSecondLineRet').val(addrValue.addrSecondLine);
                                $('#returncountryselect').val(addrValue.country).attr("selected", "selected");
                                //alert("po.."+addrValue.state)
                                addrdropdownhelpers.buildState(addrValue.country,$("#returnstateselect"), addrValue.state);
                                addrdropdownhelpers.buildCity(addrValue.state,$("#returncityselect"), addrValue.city);
                                addrdropdownhelpers.buildZip(addrValue.city,$("#returnzipselect"), addrValue.zipCode);
                                //alert(addrtype);
                            }else if(addrtype == 'remitaddr'){
                                $('#addrFirstLineRemit').val(addrValue.addrFirstLine);
                                $('#addrSecondLineRemit').val(addrValue.addrSecondLine);
                                $('#remitcountryselect').val(addrValue.country).attr("selected", "selected");
                                //alert("po.."+addrValue.state)
                                addrdropdownhelpers.buildState(addrValue.country,$("#remitstateselect"), addrValue.state);
                                addrdropdownhelpers.buildCity(addrValue.state,$("#remitcityselect"), addrValue.city);
                                addrdropdownhelpers.buildZip(addrValue.city,$("#remitzipselect"), addrValue.zipCode);
                            }

                        });

                        $('#accountName').val(data['bankAccount'][0].accountName);
                        $('#accountNumber').val(data['bankAccount'][0].accountNumber);
                        $('#routingNumber').val(data['bankAccount'][0].routingNumber);
                        $('#accountType').val(data['bankAccount'][0].accountType);
						

                        $('#otherEntitySelect').val(data['companyCompliance'][0].otherEntity).attr("selected", "true");
                        $('#supplierInclSelect').val(data['companyCompliance'][0].supplierIncl).attr("selected", "true");
                        $('#insuranceSelect').val(data['companyCompliance'][0].insurance).attr("selected", "true");


                        $('#legalEntityselect').val(data['companyLegal'][0].legalEntity).attr("selected", "true");
						$('#dunsNumber').val(data['companyLegal'][0].dunsNumber);
                        $('#serviceArea').val(data['companyLegal'][0].serviceArea);




					},
                    populateVC: function(vendorCompId)
					{

                        console.log(vendorCompId);
                        var editVCUrl = "http://localhost:8081/vendorcompany/"+vendorCompId;
                        console.log(editVCUrl);
                		$.ajax({
                					type: "GET",
                					contentType: "application/json; charset=utf-8",
                					url: editVCUrl,
                					cache: false,
                					success: function(data) {

                                        console.log("EDIT VC SUCCESS.............");
                                        console.log(data);
                                        populateHelpers.populateField(data);
                					},
                					error: function(err) {
                						console.log("ERROR");
                					}
                				});

					}

				}	