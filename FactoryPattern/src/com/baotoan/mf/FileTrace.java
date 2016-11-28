package com.baotoan.mf;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileTrace implements Trace {
	private boolean debug;
	private PrintWriter printWriter;

	public FileTrace(String path) throws IOException {
		this.printWriter = new PrintWriter(new FileWriter(new File(path)));
	}

	public void setDebug(boolean debug) {
		this.debug = debug;
	}

	public void debug(String message) {
		if (debug) {
			printWriter.println("DEBUG: " + message);
			printWriter.flush();
		}
	}

	public void error(String message) {
		printWriter.println("ERROR: " + message);
		printWriter.flush();
	}
}
