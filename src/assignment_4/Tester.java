package assignment_4;

public class Tester {

	public static void main(String[] args) {
		GetStudent gs = new GetStudent();
		
		Student[] students = new Student[30];
		
		for(int i=0; i<30; i++) {
			System.out.println((i+1)+". "+students[i].name+" ( "+students[i].number+" )");
			System.out.println("수강 과목 ( 총 "+(students[i].major_credit+students[i].ge_credit)+" 학점 )");
			System.out.print("전공 "+students[i].major_credit+"학점 : ");
			for(Subject s : students[i].major) {
				s.printInfo();
			}
		}
	}
}
