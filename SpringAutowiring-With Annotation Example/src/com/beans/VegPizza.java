package com.beans;

import org.springframework.stereotype.Component;

import com.service.Pizza;

@Component
public class VegPizza implements Pizza {

	@Override
	public void getPizza() {
		// TODO Auto-generated method stub

		System.out.println("is a veg-pizza");
	}

}
