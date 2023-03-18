package Com.SpringCore.AutoWire.Annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Address {
	
	private String cityString;
	
	private String streeString;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Address(String cityString, String streeString) {
		super();
		this.cityString = cityString;
		this.streeString = streeString;
		System.out.println("Constructor INJECTION IS BEI8NG USED");
	}

	public String getCityString() {
		return cityString;
	}

	
	public void setCityString(String cityString) {
		System.out.println("Setter method of City is being used over here");
		this.cityString = cityString;
	}

	public String getStreeString() {
		return streeString;
	}

	public void setStreeString(String streeString) {
		this.streeString = streeString;
	}

	@Override
	public String toString() {
		return "Address [cityString=" + cityString + ", streeString=" + streeString + "]";
	}
}
