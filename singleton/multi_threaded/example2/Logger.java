package com.chapter2.singleton.multi_threaded.example2;

public class Logger {
	private Logger() {
		// private constructor
	}

	public static class LoggerHolder {
		public static Logger logger = new Logger();
	}

	public static Logger getInstance() {
		return LoggerHolder.logger;
	}

	public void log(String s) {
		// log implementation
		System.err.println(s);
	}
}
