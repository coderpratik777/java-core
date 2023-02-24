package com.pratiti.training.inheritance.v3;


public interface Logger {
	
	
	public default void Log(String msg)
	{
		log(msg,LogLevel.INFO);
		
	}
	
	
	public void log(String msg ,LogLevel level);
	
}
