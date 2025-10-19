package com.controller;

import org.springframework.beans.factory.annotation.Qualifier;

import com.service.Pizza;

public class PizzaController {
	private Pizza pizza;

	public Pizza getPizza() {
		return pizza;
	}

	public PizzaController(@Qualifier("NonVegPizza") Pizza pizza) {
		System.out.println("inside pizza controller constr");
		this.pizza = pizza;
	}

}
