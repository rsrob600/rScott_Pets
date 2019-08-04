package com.codingdojo.web.models;

public class Dog extends Animal {

	public Dog(String name, String breed, double weight) {
		// base class of Animal becomes a super to Dog (once a child sub-class is added)
		super(name, breed, weight);
	}

	public String showAffection() {
		// check to see if the dog's weight is less than or greater than 30 to perform differential behavior
		if(this.weight < 30) {
			return this.name + " hopped into your lap and cuddled you!";
		} 
		else {
			return this.name + " curled up next to you!";
		}
	}
	
	
	
	

}
