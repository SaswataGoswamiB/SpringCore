package Com.SpringCore.StereoType;

public class Teachers {
	
	String nameTecaherString;
	
	int empId;

	public Teachers() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teachers(String nameTecaherString, int empId) {
		super();
		this.nameTecaherString = nameTecaherString;
		this.empId = empId;
	}

	public String getNameTecaherString() {
		return nameTecaherString;
	}

	public void setNameTecaherString(String nameTecaherString) {
		this.nameTecaherString = nameTecaherString;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "Teachers [nameTecaherString=" + nameTecaherString + ", empId=" + empId + "]";
	}
	
	

}
