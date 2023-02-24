package com.pratiti.training.pariksha2;


public class Option {
	
	private String option;
	private boolean isRightAnswer;
	
	public Option (String option,boolean answer)
	{
		this.option=option;
		this.isRightAnswer=answer;
	}
	
	
	
	public String getOption() {
		return option;
	}
	public void setOption(String option) {
		this.option = option;
	}
	public boolean isRightAnswer() {
		return isRightAnswer;
	}
	public void setRightAnswer(boolean isRightAnswer) {
		this.isRightAnswer = isRightAnswer;
	}
	

}
