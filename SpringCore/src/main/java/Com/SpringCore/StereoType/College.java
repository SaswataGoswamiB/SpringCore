package Com.SpringCore.StereoType;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class College {
	
	@Autowired
	private Student student;
	
	private Teachers teachers;


	public College() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public College(Student student, Teachers teachers) {
		super();
		this.student = student;
		this.teachers = teachers;
	}



	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Teachers getTeachers() {
		return teachers;
	}



	public void setTeachers(Teachers teachers) {
		this.teachers = teachers;
	}



	@Override
	public String toString() {
		return "College [student=" + student + ", teachers=" + teachers + "]";
	}

	
	
	

}
