package week_2;

public class Assign_1 { 

	public static void main(String[] args) {
		
		long[] numbers = new long[10];
		
		long a=1, b=1;
		
	    for(int i = 0; i<10; i++) { 
	       numbers[i] = (i*9 + 34); 
			 
			if( numbers[i]%2 == 0) {
				a *= numbers[i];
			}
			
			else { 
				b *= numbers[i];
			}
		}
		long sum = a + b;
		System.out.println( "짝수 곱 + 홀수 곱 = " + sum );
	
	}
		
}
	

