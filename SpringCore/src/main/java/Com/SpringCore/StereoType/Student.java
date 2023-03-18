package Com.SpringCore.StereoType;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Value("Saswata")
	private String nameString;
	@Value("Bankura")
	private String cityString;
	//Using expression language
	@Value("#{subject}")
	private List<String> subjectStrings;

	public Student(String nameString, String cityString) {
		super();
		this.nameString = nameString;
		this.cityString = cityString;
		System.out.println("Constructor is being used over here.");
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<String> getSubjectStrings() {
		return subjectStrings;
	}

	public void setSubjectStrings(List<String> subjectStrings) {
		this.subjectStrings = subjectStrings;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public String getCityString() {
		return cityString;
	}

	public void setCityString(String cityString) {
		System.out.println("Used for autowiring for City value setting");
		this.cityString = cityString;
	}

	@Override
	public String toString() {
		return "Student [nameString=" + nameString + ", cityString=" + cityString + "]";
	}
	
	

}
