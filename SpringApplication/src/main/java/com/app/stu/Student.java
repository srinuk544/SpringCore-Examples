package com.app.stu;

import org.springframework.stereotype.Component;

@Component
public class Student {
	String name;
	int roll;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	

}
