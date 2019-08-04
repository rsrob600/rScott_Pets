package com.codingdojo.web.models;

public class Cat extends Animal {

	public Cat(String name, String breed, double weight) {
		// base class of Animal becomes a super to Cat (once a child sub-class is added)
		super(name, breed, weight);
	}
	
	public String showAffection() {
		return "Your " + this.breed + " cat, " + this.name + ", looked at you with some affection. You think.";
	}
	
	

}
