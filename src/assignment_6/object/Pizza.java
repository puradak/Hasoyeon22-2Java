package assignment_6.object;

public class Pizza extends Brand{

	public Pizza(String name, Menu[] menus) {
		super(name, menus);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void print_event() {
		// TODO Auto-generated method stub
		String event = "";
		System.out.print("이벤트 정보 : ");
		switch(name) {
		case "도미노피자" :
			event = "첫 구매 시 2만원 할인!";
			break;
		case "고피자" :
			event = "신메뉴 2개 주문 시 하나 증정!";
			break;
		case "업텐브로" :
			event = "고구마피자 주문 시 치즈크러스트 무료!";
			break;
		case "피자스쿨" :
			event = "진행중인 이벤트가 존재하지 않습니다.";
			break;
		default :
			event = this.name+" 브랜드의 정보는 존재하지 않습니다.";
			break;
		}
		
		System.out.println(event);
	}
	
}
