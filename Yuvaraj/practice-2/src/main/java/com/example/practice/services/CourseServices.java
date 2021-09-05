package com.example.practice.services;

import java.util.List;
import java.util.Optional;

import com.example.practice.entities.Course;

public interface CourseServices {
	public List<Course> getCourses();

	public Optional<Course> getCourse(long courseId);

	public Course addCourse(Course course);

	public Course updateCourse(Course course);

	public void deleteCourse(long parseLong);

	

	
	
	
	

}
