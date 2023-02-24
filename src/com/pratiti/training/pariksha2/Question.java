package com.pratiti.training.pariksha2;

import java.util.List;

public class Question {
	
	private List<Option> options;
	private String question;
	
	public Question()
	{
		
	}
	public Question(String question)
	{
		this.question=question;
	}

	public List<Option> getOptions() {
		return options;
	}

	public void setOptions(List<Option> options) {
		this.options = options;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

}
