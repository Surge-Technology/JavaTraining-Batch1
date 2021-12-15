package com.example.practice.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.practice.dao.CourseRepository;
import com.example.practice.entities.Course;

@Service
public class CourseServicesImp implements CourseServices {
	
	
	@Autowired
	private CourseRepository courseRepository;
//	List<Course>list;
	
	public CourseServicesImp() {
		
//		list=new ArrayList<>();
//		list.add(new Course(101,"java course","camunda course"));
//		list.add(new Course(102,"Python course","jpmn course"));

	}

	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return courseRepository.findAll();
	}

	@Override
	public Optional<Course> getCourse(long courseId) {
		// TODO Auto-generated method stub
//		Course c=null;
//		for(Course course:list) {
//			if(course.getId()==courseId) {
//				c=course;
//				break;
//			}
//		}
		
		return courseRepository.findById(courseId);
	}

	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
//		list.add(course);
		courseRepository.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		// TODO Auto-generated method stub
//		for(Course e:list) {
//			if(e.getId()==course.getId()){
//				e.setTitle(course.getTitle());
//				e.setDescribtion(course.getDescribtion());
//			}
//		}
		courseRepository.save(course);
		return course;
	}

	@Override
	public void deleteCourse(long parseLong) {
		// TODO Auto-generated method stub
	//	list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
	//list=list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		Course entity=courseRepository.getOne(parseLong);
		courseRepository.delete(entity);
		}

	
		
	}
	
	


