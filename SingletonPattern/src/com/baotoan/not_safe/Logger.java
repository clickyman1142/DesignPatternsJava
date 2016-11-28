package com.baotoan.not_safe;

public class Logger {
	private static Logger INSTANCE;
	private String className;
	
	private Logger() {
		this.className = "";
	}
	
	public static Logger getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new Logger();
		}
		
		return INSTANCE;
	}
	
	public void setClassName(String className) {
		this.className = className;
	}
	
	public void debug(String message) {
		System.out.println("DEBUG: " + className + ": " + message);
	}
}
