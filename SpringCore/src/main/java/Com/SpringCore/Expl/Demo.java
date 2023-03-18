package Com.SpringCore.Expl;

import org.springframework.beans.factory.annotation.Value;

import java.lang.Math;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	
	@Value("#{11+22}")
	private int x;
	
	@Value("#{T(java.lang.Math).sqrt(49)}")
	private int y;
	
//invoking a static method in Expression language.
	@Value("#{T(java.lang.Math).sqrt(36)}")
	private int z;
// invoking a static variable using SPEL.	
	@Value("#{T(java.lang.Math).E}")
	private double a;
//  invoking new object using SPEL.s	
	@Value("#{new java.lang.String('Saswata Goswami')}")
	private String bString;
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
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
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", a=" + a + ", bString=" + bString + "]";
	}

	
	
	

}
