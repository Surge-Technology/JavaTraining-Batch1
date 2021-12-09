package com.example.practice.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Table(name = "Practice_tab")
@Setter
//@NoArgsConstructor
//@AllArgsConstructor
@ToString
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name = "Id")
	private long id;
	
	@Column(name = "Title")
	private String title;
	
	@Column(name = "Describtion")
	private String describtion;
	

}
