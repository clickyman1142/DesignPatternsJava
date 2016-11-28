package com.baotoan.mf;

import java.io.IOException;

public class TraceFactory {
	public static enum TYPE {
		CONSOLE, FILE
	}

	public static Trace getTrace(TYPE type) {
		if (type == TYPE.FILE) {
			try {
				return new FileTrace("log.txt");
			} catch (IOException e) {
				e.printStackTrace();
				return new ConsoleTrace();
			}
		} else {
			return new ConsoleTrace();
		}
	}
}
