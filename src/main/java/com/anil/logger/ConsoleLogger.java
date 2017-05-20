package com.anil.logger;

public class ConsoleLogger implements Logger {
	
	
	private static class ConsoleLoggerHolder{
		public static final ConsoleLogger instance = new ConsoleLogger();
	}
	
	
	
	public static ConsoleLogger getInstance(){
		return ConsoleLoggerHolder.instance;
	}
	
	private ConsoleLogger(){}

	public void log(String message) {
		System.out.println(message);
	}

}
