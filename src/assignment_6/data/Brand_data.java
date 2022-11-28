package assignment_6.data;

import assignment_6.object.Brand;
import assignment_6.object.Chicken;
import assignment_6.object.Pizza;

public class Brand_data {
	public static Chicken[] chicken_data = {
			new Chicken("BHC", 		Chicken_menu_data.bhc_menu),
			new Chicken("교촌치킨",	Chicken_menu_data.gyochon_menu),
			new Chicken("자담치킨",	Chicken_menu_data.jadam_menu),
			new Chicken("조커닭",		Chicken_menu_data.jokerdark_menu),
			new Chicken("가마치통닭", Chicken_menu_data.gamachi_menu)
	};
	public static Pizza[] pizza_data = {
			new Pizza("도미노피자", 	Pizza_menu_data.domino_menu),
			new Pizza("고피자", 		Pizza_menu_data.gopizza_menu),
			new Pizza("업텐브로", 	Pizza_menu_data.uptenbro_menu),
			new Pizza("피자스쿨", 	Pizza_menu_data.pizza_school_menu),
	};

}
