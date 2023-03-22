package Com.SpringCore.NoXml;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("travelling")
public class Travel {
	
	@Value("123")
	private int a;
	
	@Value("sikkim")
	private String bString;

	public Travel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Travel(int a, String bString) {
		super();
		this.a = a;
		this.bString = bString;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public String getbString() {
		return bString;
	}

	public void setbString(String bString) {
		this.bString = bString;
	}

	@Override
	public String toString() {
		return "Travel [a=" + a + ", bString=" + bString + "]";
	}

	
}
