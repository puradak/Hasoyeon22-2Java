package assignment_4;

import java.util.Random;

public class GetStudent {
	
	public Data ds = new Data();
	public Random rand = new Random();
	public int number = 30;
	public Student[] students = new Student[number];
	
	public void init_students() {
		for(int i=0; i<this.students.length; i++) {
			int sNumber = rand.nextInt(99999)+2023000000;
			if(!isValidNumber(students, sNumber)) {
				i--;
				continue;
			}
			students[i] = new Student(sNumber);
		}
	}
	
	public Student[] getStudents() {
		init_students();
		return this.students;
	}
	
	public boolean isValidNumber(Student[] students, int number) {
		if(students[0] == null) return true;
		
		for(Student s : students) {
			if(s.number == number) return false;
		} // 향상된 for문
		
		return true;
	}
}
