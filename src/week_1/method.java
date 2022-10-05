package week_1;

public class method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (i+1) * 3;
		}
		function fun = new function();
		int multi_sum = fun.multi_sum(arr);
		System.out.println(multi_sum);
		
	}

}
