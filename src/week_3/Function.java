package week_3;

import java.util.Random;

public class Function {
	Random rand = new Random();
	public int[][] set_grade (int a, int b) {
		int score[][]=new int[a][b];
		for(int i=0; i<a; i++) {
			for(int j=0; j<b; j++) {
				score[i][j] = rand.nextInt(40, 101);
			}
		}
		return score;
	}
	
	public int[] get_average_grade(int a[][]){
		int average[]= new int[3];
		for(int i = 0;i<3;i++) {
			int sum = 0;
			for(int j = 0; j<30; j++) {
				sum += a[i][j];
			}
			average[i] = sum / 30;
		}
		return average;
	}
	
	public void print_grade(int a[][], int b[]){
		System.out.println("번호\t국어\t수학\t영어");
		for(int i=0;i<30;i++) {
			System.out.println(i+1 + "\t"+a[0][i]+"\t"+a[1][i]+"\t"+a[2][i]+"\n");		
		}
		System.out.println("평균\t"+b[0]+"\t"+b[1]+"\t"+b[2]);
	}
}
	
