package com.ezen.springmvc.model;

import org.springframework.stereotype.Component;

// 자바빈 객체

public class Student {
	
	protected String name;
	protected String grade;
	
	public Student() {
		name = "기본 이름";
		grade = "기본 등급";
	}
	
	public Student(String name, String grade) {
		this.name = name;
		this.grade = grade;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return String.format("%s[%s]", name, grade);
	}
}
