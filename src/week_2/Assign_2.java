package week_2;

public class Assign_2 {

	public static void main(String[] args) {
		long[] numbers = new long[10];
		long mulOdd = 1, mulEven = 1;
		
		for(int i = 0; i < 10; i++) {
			numbers[i] = 34+i*9; //등차가 9인 등차수열
			
			if(numbers[i]%2 == 0) {
				mulEven *= numbers[i];
			}
			else {
				mulOdd *= numbers[i];
			}
		}
		long sum = mulEven + mulOdd;
		System.out.println("홀수 곱 + 짝수 곱 = " + sum);
			
	}

}
