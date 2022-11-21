package assignment_5.object;

public class Major extends Subject{

	public String compulsory;
	
	public Major(String name, String compulsory, int credit, int code) {
		super(name, credit, code);
		this.compulsory = compulsory;
	}
	
	public Major(String name, boolean isCompulsory, int credit, int code) {
		super(name, credit, code);
		if(isCompulsory) this.compulsory = "필수";
		else this.compulsory = "선택";
	}

	@Override
	public void printInfo() {
		System.out.println(this.name+" \t("+this.credit+"학점, 전공"+this.compulsory+", "+this.classification+") ");
	}

}
