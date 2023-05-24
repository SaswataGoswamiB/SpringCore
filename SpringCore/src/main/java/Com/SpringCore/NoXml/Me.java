package Com.SpringCore.NoXml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Me {
	
	@Value("Saswata")
	String nameString;
	
	@Autowired
	Travel travel;

	public Me() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Me(String nameString, Travel travel) {
		super();
		this.nameString = nameString;
		this.travel = travel;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public Travel getTravel() {
		return travel;
	}

	public void setTravel(Travel travel) {
		this.travel = travel;
	}

	@Override
	public String toString() {
		return "Me [nameString=" + nameString + ", travel=" + travel + "]";
	}
	
	

}
