package Com.SpringCore.AutoWire.Annotation;

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
	}

	public String getCityString() {
		return cityString;
	}

	public void setCityString(String cityString) {
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
