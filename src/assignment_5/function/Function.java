package assignment_5.function;

import java.util.Random;

import assignment_5.data.Student_data;
import assignment_5.data.Subject_data;
import assignment_5.object.General;
import assignment_5.object.Major;
import assignment_5.object.Student;

public class Function {
	
	public Student[] students = new Student[30];
	public static Random rand = new Random();

	public static boolean classficate() {
		if(rand.nextInt(100) %2 == 0) return true;
		else return false;
	}
	
	public static Major getMajor() {
		Major temp = Subject_data.majors[rand.nextInt(6)];
		Major major = new Major(temp.name, temp.compulsory,temp.credit,temp.code);
		return major;
	}
	public static Major getMajor(Major temp) {
		Major major = new Major(temp.name, temp.compulsory,temp.credit,temp.code);
		return major;
	}
	public static General getGeneral() {
		General temp = Subject_data.generals[rand.nextInt(6)];
		General general = new General(temp.name, temp.credit,temp.code);
		return general;
	}
	
	public static String initName() {
		String name = "";
		name += Student_data.firstName[rand.nextInt(6)];
		name += Student_data.lastName[rand.nextInt(6)];
		return name;
	}
	
	
	public void initNumber() {
		boolean isExist = false;
		for(int i=0; i<30; i++) {
			int number = rand.nextInt(100000);
			
			for(Student s : students) {
				if(s.number == number) {
					isExist = true;
					break;
				}
			}
			
			if (isExist) {
				i--;
				continue;
			}
			
			if (i < 30 || students[i+1] == null) {
				students[i].number = 2023000000+number;
			}
		}
		
	}

	public void initStudents() {
		for(int i=0; i<30; i++) {
			students[i] = new Student();
		}
		initNumber();
	}

	public void printAllInfo() {
		int count = 1;
		for(Student s : students) {
			System.out.println((count++)+". ");
			s.printInfo();
			System.out.println();
		}
	}
}
