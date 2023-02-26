package Com.SpringCore.AutoWire.Annotation;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
	private String nameString;
	
	@Autowired
	@Qualifier("address2")
	private Address adrAddress;
	
	private Properties properties;
	
	

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Employee(String nameString, Address adrAddress, Properties properties) {
		super();
		this.nameString = nameString;
		this.adrAddress = adrAddress;
		this.properties = properties;
	}



	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public Address getAdrAddress() {
		return adrAddress;
	}

	public void setAdrAddress(Address adrAddress) {
		this.adrAddress = adrAddress;
	}
	
	

	public Properties getProperties() {
		return properties;
	}



	public void setProperties(Properties properties) {
		this.properties = properties;
	}



	@Override
	public String toString() {
		return "Employee [nameString=" + nameString + ", adrAddress=" + adrAddress + "]";
	}
	
	

}
