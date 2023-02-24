package com.pratiti.training.inheritance.v3;

public class LoggerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		Logger logger=LoggerFactory.getLoggerinstance();
		
//		
//		Logger logger=new FileLogger();
//		ConsoleLogger logger2=new ConsoleLogger();
//		logger2.Log("some message");
		logger.Log("some message");
		logger.log("Some info message",LogLevel.INFO);
		logger.log("Some info message",LogLevel.WARNING);
		logger.log("Some info message",LogLevel.ERROR);
		//(ConsoleLogger)Logger).print() if you want to print the method of child class by the reference of the parent class
		//The above format is called is Downcasting
		//Line 8 is performing the upcasting
		

	}

}
