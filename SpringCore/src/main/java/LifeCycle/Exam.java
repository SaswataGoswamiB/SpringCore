package LifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Exam {
	
	private String subjectString;

	public Exam(String subjectString) {
		super();
		this.subjectString = subjectString;
	}

	public Exam() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getSubjectString() {
		return subjectString;
	}

	public void setSubjectString(String subjectString) {
		this.subjectString = subjectString;
	}

	@Override
	public String toString() {
		return "Exam [subjectString=" + subjectString + "]";
	}
	
	//annotation is mainly used when we want to make custom method as init method.
	@PostConstruct
	public void start() 
	{
		System.out.println("Starting method.");
	}
	
	@PreDestroy
	public void destry() 
	{
		System.out.println("Destroy method.");
	}
	

}
