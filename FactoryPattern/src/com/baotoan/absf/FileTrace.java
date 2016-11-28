package com.baotoan.absf;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileTrace extends Trace {
	private PrintWriter printWriter;

	public FileTrace(boolean debug, String path) throws IOException {
		super(debug);
		this.printWriter = new PrintWriter(new FileWriter(new File(path)));
	}

	@Override
	public void debug(String message) {
		if(debug) {
			printWriter.println("DEBUG: " + message);
			printWriter.flush();
		}
	}

	@Override
	public void error(String message) {
		printWriter.println("ERROR: " + message);
		printWriter.flush();
	}

}
