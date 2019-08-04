package com.codingdojo.web.models;

public interface Pet {
	// standard method to force all Animals to return affection of some type (the specifics of how is located on each sub-class)
	String showAffection();
}
