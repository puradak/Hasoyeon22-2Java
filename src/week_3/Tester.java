package week_3;

public class Tester {
	public static void main(String[] args) {
		
		Function score = new Function();
		
		int[][] randScore = score.set_grade(3, 30);
		int[] averageScore = score.get_average_grade(randScore);
		score.print_grade(randScore, averageScore);
		
	}
}
