package prac_4;

public class Tester {

	public static void main(String[] args) {
		Mini mini = new Mini();
		Bus bus = new Bus();
		Truck truck = new Truck();
		
		mini.printInfo();
		mini.window();
		
		bus.printInfo();
		bus.window();
		
		truck.printInfo();
		truck.window();
	}

}
