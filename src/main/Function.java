package main;

public class Function {
		public int multi_sum(int[] arr) {
			int result_odd=1;
			int result_even=1;
			
			for(int i=0; i<arr.length; i++)
			{
				if(arr[i]%2==0)
				{
					result_even*=arr[i];
				}
				else
				{
					result_odd*=arr[i];
				}
			}
			return result_odd+result_even;
		}
}
