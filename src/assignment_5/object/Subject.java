package assignment_5.object;

import assignment_5.function.Function;

public abstract class Subject {
	public String name;
	public int credit;
	public int code;
	public String classification ;

	
	public Subject(String name, int credit, int code ) {
		super();
		this.name = name;
		this.credit = credit;
		this.code = code;
		if(Function.classficate()) this.classification = "절대";
		else this.classification = "상대";
	}
	
	public abstract void printInfo();
}
