package week3;

public class Tester {
	public static void main(String[] args) {
		Function obj = new Function();
		int student_score[][] = new int[30][4];
		obj.set_grade(student_score);
		int[] avgs = obj.get_average_grade(student_score);
		obj.print_grade(student_score, avgs);
	}
}
