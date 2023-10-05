package com.prowings.singlton;

public class EagerInitialization {

	private static EagerInitialization obj = new EagerInitialization();

	private EagerInitialization() { 
		
		super();
	}
	
	public static EagerInitialization getInstance() {
		
		return obj;
	}

}

// Drawback : object is created when jvm load the class at class loading time,
//			  if we don't use that object unneccessory object is exist