package com.test.questions.model;

import javax.persistence.Embeddable;

@Embeddable
public class Question {
	
	private Long question_id;

	public Long getQuestion_id() {
		return question_id;
	}

	public void setQuestion_id(Long question_id) {
		this.question_id = question_id;
	}
	

}
