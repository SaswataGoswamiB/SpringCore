package Com.SpringCore.ci;

public class Person {
	
	private String name;
	
	private int id;
	
	private Certi cer;

	public Person(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return this.name+"::"+this.id+"::"+this.cer.nameString;
	}

}
