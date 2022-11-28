package week6_assign_2;

import week6_assign_2.data.Menu;
import week6_assign_2.object.Etc;

public class Tester {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Etc[] chicken = new Etc[5];
		
		for(int i = 0; i<5; i++) {
			chicken[i] = Menu.brand[i];
			chicken[i].printInfo();
			System.out.println();
		}
		
//		for (Etc s : Menu.brand) {
//			s.printInfo();
//			System.out.println();
//		
//		}
	}
}
