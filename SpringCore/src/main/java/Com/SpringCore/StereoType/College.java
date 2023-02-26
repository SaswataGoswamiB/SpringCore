package Com.SpringCore.StereoType;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class College {
	
	@Autowired
	private Student student;


	public College() {
		super();
		// TODO Auto-generated constructor stub
	}

	public College(Student student) {
		super();
		this.student = student;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "College [student=" + student + "]";
	}
	
	

}
