package com.beans;

import org.springframework.stereotype.Component;

import com.service.Pizza;

@Component
public class NonVegPizza implements Pizza {

	@Override
	public void getPizza() {
		// TODO Auto-generated method stub
		System.out.println("is a non-veg pizza");

	}

}
