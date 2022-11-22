package assignment_6;

import assignment_6.data.Brand_data;
import assignment_6.object.Brand;

public class Tester {

	public static void main(String[] args) {
		for(Brand b : Brand_data.chicken_data) {
			b.print_info();
			System.out.println("==========================================\n");
		}

	}

}
