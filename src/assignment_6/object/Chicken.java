package assignment_6.object;

public class Chicken extends Brand {

	public Chicken(String name, Menu[] menus) {
		super(name, menus);
	}

	@Override
	public void print_event() {
		String event = "";
		System.out.print("이벤트 정보 : ");
		switch(name) {
		case "BHC" :
			event = "뿌링클 구매 시 3000원 할인!";
			break;
		case "교촌치킨" :
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
			event = this.name+" 브랜드의 정보는 존재하지 않습니다.";
			break;
		}
		
		System.out.println(event);
	}
	
}
