package com.pratiti.training.lambda;


interface Sensor
{
	void on();
	void off();
}

class TvSensor implements Sensor
{
	@Override
	public void on()
	{
		
	}
	@Override
	public void off()
	{
		
	}
}



public class Prereq1 {
	
	public static void main(String[] args) {
		Sensor s=new TvSensor();
		s.on();
		s.off();
	}

}
