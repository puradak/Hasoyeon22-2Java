package assignment_6.object;

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
}

