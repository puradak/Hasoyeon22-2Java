package wekk2;

public class Function {

	public static int multi_sum(int a[]) {
		int multiOdd=1, multiEven=1;
		int sum;
		for(int i=0;i<5;i+=2) {
			multiEven=multiEven*a[i];
		}
		for(int j=1;j<5;j+=2) {
			multiOdd=multiOdd*a[j];
		}
		sum=multiEven+multiOdd;
		return sum;
	}
}
