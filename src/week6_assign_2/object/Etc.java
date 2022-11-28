package week6_assign_2.object;

public class Etc extends Chicken{
	
	public Etc(String name, int price) {
		// TODO Auto-generated constructor stub
		super(name, price);
		
	}
	
	public Etc(String Brand, Etc[] menu) {
		// TODO Auto-generated constructor stub
		super(Brand, menu);
	}

	public void printInfo() {
		printBrand();
		printMenu();
		printEvent();
	}
	
	
	@Override
	public void printEvent() {
		// TODO Auto-generated method stub
	
		String event = "";
		System.out.print("이벤트 : ");
		switch(brand) {
		case "BHC" :
			event = "뿌링클 구매 시 3000원 할인!";
			break;
		case "교촌" :
			event = "허니콤보 구매 시 치즈스틱 2개 증정!";
			break;
		case "자담치킨" :
			event = "16000원 이상 구매 시 배달비 무료!";
			break;
		case "조커닭" :
			event = "30000원 이상 구매 시 머그컵 증정!";
			break;
		case "가마치통닭" :
			event = "진행 중인 이벤트가 없습니다.";
			break;
		default :
			event = this.brand+" 브랜드의 정보는 존재하지 않습니다.";
			break;
		}
		
		System.out.println(event);
	}
}
