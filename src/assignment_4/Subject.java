package assignment_4;

import java.util.Random;

public class Subject {
	public String name;				// 과목명
	public boolean isMajor;			// 전공(T)/교양(F)
	public boolean isCompulsory;	// 필수(T)/선택(F)
	public boolean isAbsolute;		// 절대(T)/상대(F)
	public int credit;				// 학점
	public int code;
	
	public Subject(String name, boolean isMajor, boolean isCompulsory, boolean isAbsolute, int credit, int code) {
		super();
		this.name = name;
		this.isMajor = isMajor;
		this.isCompulsory = isCompulsory;
		this.isAbsolute = isAbsolute;
		this.credit = credit;
		this.code = code;
	}
	
	public void printInfo() {
		String compulsory = isCompulsory ? "필수" : "선택";
		String absolute = isAbsolute ? "절대" : "상대";

		System.out.print(this.name + "("+this.credit+", ");
		if(isMajor) System.out.print(compulsory+", ");
		System.out.println(absolute+")");
	}
	
	public static boolean isExistSubject(Subject[] subjects, Subject subject) {
		for(Subject s : subjects) {
			if(s.code == subject.code) return true;
		}
		for(Subject s : subjects) {
			if(s.code == subject.code) return true;
		}
		return false;
	}
	public static boolean setValuationStd() {
		Random rand = new Random();
		if(rand.nextInt()%2 == 0) return true;
		else return false;
	}
}
