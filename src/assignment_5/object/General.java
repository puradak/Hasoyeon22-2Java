package assignment_5.object;

public class General extends Subject{

	public General(String name, int credit, int code) {
		super(name, credit, code);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printInfo() {
		System.out.println(this.name+" \t("+this.credit+"학점, "+this.classification+")");
	}

}
