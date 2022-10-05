package week_1;

public class function {
	public int multi_sum(int[] arr) {
		int even = 1, odd = 1;
		for (int i = 0; i < arr.length; i++) {
			if(i % 2 == 0) {
				even = even * arr[i];
			}else {
				odd = odd * arr[i];
			}
		}
		return even + odd;
	}
}
