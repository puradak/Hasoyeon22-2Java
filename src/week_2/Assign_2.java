package week_2;

public class Assign_2 {

	public static void main(String[] args) {
		int[] numbers = new int[10];
		long oddN = 1, evenN = 1;
		for(int i = 0; i<10; i++){
			numbers[i] = ((i*9)+34);
				if((i%2) == 0) {
					evenN *= numbers[i];
					}
				else oddN *= numbers[i];
			}
		System.out.println(evenN+oddN);
	}
}
