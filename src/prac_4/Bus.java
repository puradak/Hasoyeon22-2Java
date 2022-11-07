package prac_4;

public class Bus extends Car{
	public Bus() {
		this.kind = "버스";
		this.men_load_limit = 20;
		this.stuff_load_limit = 2000;
	}
	@Override
	public void alarm() {
		System.out.println("빵!!!!");
	}

}
