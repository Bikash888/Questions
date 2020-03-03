package com.test.questions.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "test_question")
public class Test {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = true)
	private int test_id;
	
	
	 @ElementCollection
	private Set<Question> question;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public int getTest_id() {
		return test_id;
	}


	public void setTest_id(int test_id) {
		this.test_id = test_id;
	}


	public Set<Question> getQuestion() {
		return question;
	}


	public void setQuestion(Set<Question> question) {
		this.question = question;
	}
	
	
	
	
}
