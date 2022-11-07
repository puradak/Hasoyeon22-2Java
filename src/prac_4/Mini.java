package prac_4;

public class Mini extends Car{
	public Mini() {
		this.kind = "소형차";
		this.men_load_limit = 4;
		this.stuff_load_limit = 30;
	}	
	
	@Override
	public void alarm() {
		System.out.println("빵");
		
	}

}
