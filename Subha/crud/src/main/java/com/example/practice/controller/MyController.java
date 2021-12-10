package com.example.practice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.practice.entities.Course;
import com.example.practice.services.CourseServices;

import lombok.Getter;
import lombok.Setter;


@RestController
//@RequestMapping("/abc")
public class MyController {
	
	@Autowired
	private CourseServices courseServices;
	
	@GetMapping("/check")
	public String name() {
		return "Welcome to ..";
		
	}
	@RequestMapping(value="/courses",method=RequestMethod.GET)
	//@GetMapping("/course")
	public List<Course> getCourses() {
		return courseServices.getCourses();
		
	}

		
	@GetMapping("/course/{courseId}")
	public Optional<Course> getCourse(@PathVariable String courseId) {
		return courseServices.getCourse(Long.parseLong(courseId));
		
	}
	@PostMapping("/course")
	public Course addCourse(@RequestBody Course course) {
		return courseServices.addCourse(course);
		
	}
	
	@PutMapping("/course")
	public Course updateCourse(@RequestBody Course course) {
		return courseServices.updateCourse(course);
		
	}
	@DeleteMapping("/course/{courseId}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId){
		try {
		courseServices.deleteCourse(Long.parseLong(courseId));
		return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}

}


/*@GetMapping
@postMapping
@putMapping
@DeleteMapping*/