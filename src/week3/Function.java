package week3;
import java.util.Random;

public class Function {
	public void set_grade(int[][] stu){
		Random rand  = new Random();
		for(int i = 0; i<30; i++) {
			stu[i][0] = i+1;
			for(int j = 1; j<4; j++) {
				stu[i][j] = rand.nextInt(60) + 40;
			}
		}
	}
	public int[] get_average_grade(int[][] stu){
		int[] avgs = new int[3];
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<30; j++) {
			avgs[i] += stu[j][i+1];}
			avgs[i] = avgs[i] / 30;
		}
		return avgs;
	}
	public void print_grade(int[][] stu, int[] avgs) {
		System.out.println("번호\t국어\t수학\t영어");
		for(int i = 0; i<30; i++) {
			for(int j = 0; j<4; j++) {
				System.out.print(stu[i][j]+"\t");}
			System.out.println();
		}
		System.out.print("평균\t");
		for(int i = 0; i<3; i++) {
			System.out.print(avgs[i]+"\t");
		}
	}
}
