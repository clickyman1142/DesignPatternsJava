package com.baotoan.mf;

public class Test {
	public static void main(String[] args) {
		Trace log = TraceFactory.getTrace(TraceFactory.TYPE.CONSOLE);
		log.setDebug(true);
		log.debug("This is debug message");
		log.error("This is error message");
	}
}
