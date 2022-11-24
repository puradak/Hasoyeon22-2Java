package assignment_6.object;

public class Menu {
	public String name;
	public int price;
	
	public Menu(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public void print_menu() {
		System.out.println(this.name+"("+this.price+"원)");
	}
}
