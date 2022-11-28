package week6_assign_2.object;

public abstract class Chicken{
	
	public String brand;
	public String name;			// 치킨 이름
	public int price;			// 치킨 가격
	public Etc[] menu;
	
	public Chicken(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public Chicken(String brand, Etc[] menu) {
		this.menu = menu;
		this.brand = brand;
	}

	public void printMenu() {
		for(Etc m : menu) {
			System.out.print(m.name + " - ");
			System.out.println(m.price+"원");
		}
	}
	
//	public void printMenu() {
//		for(int i = 0; i < menu.length; i++) {
//			menu[i].printMenu();
//		}
//	}
	
	public void printBrand() {
		System.out.println("<"+brand+">");
	}

	public abstract void printEvent();
	
	

}
