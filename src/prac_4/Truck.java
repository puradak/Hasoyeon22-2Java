package prac_4;

public class Truck extends Car{
	public Truck() {
		this.kind = "트럭";
		this.men_load_limit = 2;
		this.stuff_load_limit = 15000;
	}
	@Override
	public void alarm() {
		System.out.println("빵!!!!!!!!!!!!!!!!!!!!!");
	}

}
