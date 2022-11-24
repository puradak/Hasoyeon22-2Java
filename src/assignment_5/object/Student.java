package assignment_5.object;

import assignment_5.data.Subject_data;
import assignment_5.function.Function;

public class Student {
	public String name;
	public int number;
	public int major_credit;
	public int general_credit;
	public Major[] majors;
	public General[] generals;
	
	public Student() {
		super();
		this.name = Function.initName();
		this.majors = new Major[6];
		this.generals = new General[6];
		
		initMajor();
		initGeneral();
	}
	
	public void initMajor() {
		boolean isExist = false;
		Major major;
		majors[0] = Function.getMajor(Subject_data.majors[0]);
		major_credit += majors[0].credit;
		majors[1] = Function.getMajor(Subject_data.majors[1]);
		major_credit += majors[1].credit;
		for(int i=2;  ;i++) {
			major = Function.getMajor();
			for(Major m : majors) {
				if(m == null) break;
				if(m.code == major.code) {
					isExist = true;
					break;
				}
			}
			if(isExist) {
				i--;
				isExist = false;
				continue;
			}
			if(major_credit+major.credit > 11) return;

			major_credit += major.credit;			
			if(i < 6 || majors[i+1] == null) {
				majors[i] = major;
			}
		}
	}
	public void initGeneral() {
		boolean isExist = false;
		General general;
		if(generals[0] == null) {
			generals[0] = Function.getGeneral();
			general_credit += generals[0].credit;
		}
		for(int i=1; i<6; i++) {
			general = Function.getGeneral();
			for(General g : generals) {
				if(g == null) break;
				if(g.code == general.code) {
					isExist = true;
					break;
				}
			}
			if(isExist) {
				i--;
				isExist = false;
				continue;
			}
			
			if(general_credit+general.credit > 8) return;
			
			general_credit += general.credit;
			if(i < 6 || generals[i+1] == null) {
				generals[i] = general;
			}
		}
	}
	public void printInfo() {
		System.out.println(this.name+"("+this.number+") ");
		System.out.println("----------전공 ("+this.major_credit+")----------");
		for(Major m : majors) {
			if(m==null) break;
			m.printInfo();
		}
		System.out.println("----------교양 ("+this.general_credit+")----------");
		for(General g : generals) {
			if(g==null) break;
			g.printInfo();
		}
		System.out.println("----------------------------");
	}
}
