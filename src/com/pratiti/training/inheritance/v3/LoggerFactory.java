package com.pratiti.training.inheritance.v3;

public class LoggerFactory {
	public static Logger getLoggerinstance()
	{
		return new ConsoleLogger();
	}

}
