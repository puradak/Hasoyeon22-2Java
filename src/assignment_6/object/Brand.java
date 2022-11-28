package assignment_6.object;

import assignment_6.data.Brand_data;

public abstract class Brand {
	public String name;
	public Menu[] menus;
	
	public Brand(String name, Menu[] menus) {
		this.name = name;
		this.menus = menus;
	}
	
	public void print_info() {
		System.out.println(this.name+" : ");
		print_menu();
		print_event();
	}
	
	public void print_menu() {
		for(Menu m : menus) {
			m.print_menu();
		}
	}
	public abstract void print_event();
	
	
	public static void printMenu(String brand) {
		Brand[] brands = null;
		String brand_kind = null;
		switch(brand.toLowerCase()) {
		case "pizza":
		case "피자"  :
			brands = Brand_data.pizza_data;
			brand_kind = "피자";
			break;
		case "chicken":
		case "치킨"    :
			brands = Brand_data.chicken_data;
			brand_kind = "치킨";
			break;
		default :
			System.out.println("(입력 : "+brand+")검색하려는 브랜드 데이터가 존재하지 않습니다.");
			return;
		}
		
		System.out.println("\n==========<"+brand_kind+">==========");
		for(Brand b : brands) {
			b.print_info();
			System.out.println("==========================================\n");
		}
	}
}

