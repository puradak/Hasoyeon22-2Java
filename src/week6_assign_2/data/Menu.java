package week6_assign_2.data;

import week6_assign_2.object.Etc;

public class Menu{
	
	public static Etc[] bhc_menu = {
			new Etc("뿌링클", 16000),
			new Etc("맛초킹",17000)}; 
	
	public static Etc[] kyochon_menu = {
			new Etc("허니콤보", 18000),
			new Etc("레드콤보", 18000)};
	
	public static Etc[] jadam_menu = {
			new Etc("소보로치킨", 16000),
			new Etc("맵슐랭치킨", 17000)};
	
	public static Etc[] jokerdark_menu = {
			new Etc("2가지맛",16900),
			new Etc("3가지맛", 20900)};
	
	public static Etc[] gamachi_menu = {
			new Etc("후라이드치킨", 8000),
			new Etc("사천치킨", 17000)};
	
	public static Etc[] brand = {
			new Etc("BHC", bhc_menu),
			new Etc("교촌", kyochon_menu),
			new Etc("자담치킨", jadam_menu),
			new Etc("조커닭", jokerdark_menu),
			new Etc("가마치통닭", gamachi_menu)};
}
