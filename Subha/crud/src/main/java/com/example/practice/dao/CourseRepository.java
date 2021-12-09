package com.example.practice.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.practice.entities.Course;

public interface CourseRepository extends JpaRepository <Course,Long>{


}
