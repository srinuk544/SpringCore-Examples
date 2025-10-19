package com.spring.core;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class Student {
	private String sname;
	private int sroll;
	private String sAddress;

	public String getSname() {
		return sname;
	}

	@Value("${student.stuname}")
	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getSroll() {
		return sroll;
	}

	@Value("${student.sturoll}")
	public void setSroll(int sroll) {
		this.sroll = sroll;
	}

	public String getsAddress() {
		return sAddress;
	}

	@Value("${student.stuaddress}")
	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}

	public void show() {
		System.out.println("Student Name:" + sname);
		System.out.println("Student Roll:" + sroll);
		System.out.println("Student Address:" + sAddress);
	}

}
