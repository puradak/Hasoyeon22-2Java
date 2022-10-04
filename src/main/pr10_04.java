package main;

import java.util.Iterator;
import java.util.Scanner;

public class pr10_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner input1 = new Scanner(System.in);
		int num1 = input1.nextInt();  //Line 문자열, Int 정수
		Scanner input2 = new Scanner(System.in);
		int num2 = input2.nextInt();
		Scanner input3 = new Scanner(System.in);
		int num3 = input2.nextInt();
		if(num1 < num2) {
			num1 = num2;
		}
		if(num1 > num3) {
			num3 = num1;
		}
		System.out.println(num3);
		int number = multi(10,3,7);
		System.out.println(number);
		int[] num = new int[10];
		
		for (int i = 0; i < 10; i++) {
			num[i] = i * 10;
			System.out.println(num[i]);
		}*/
		int[] maxim = {5,2,4,23,2};
		int max = getMax(maxim);
		System.out.println(max);
		function f = new function();
		int nums = f.add(3, 1);
		System.out.println(nums);
	}
	public static int getMax(int[] maxim) {
		int max1 = maxim[0];
		for (int i = 1; i < maxim.length - 1; i++) {
			if(max1 < maxim[i]) {
				max1 = maxim[i];
			}
		}
		return max1;
	}
	public static int multi(int a, int b,int c) {
		return a * b * c;
	}
}
