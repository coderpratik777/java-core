package com.pratiti.training.inheritance.v1;

public class LoggerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Logger logger=new Logger();
		logger.log("Some info message",LogLevel.INFO);
		logger.log("Some info message",LogLevel.WARNING);
		logger.log("Some info message",LogLevel.ERROR);
		

	}

}
