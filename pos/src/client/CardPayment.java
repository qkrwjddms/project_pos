package client;

public class CardPayment implements Payment{
	Asset_Management am = new Asset_Management();
	@Override
	public boolean pay(int price) {
		CardReader cr = new CardReader();
		int card_num = cr.read_card();
		System.out.println("<class CardPayment>카드 서버와 통신중...");
		System.out.println("카드번호 : "+card_num);
		int limit = 10000000;
		if(limit >= price) {
			System.out.println("<class CardPayment>결제 정보 서버에 전송...");
			System.out.println("카드번호 : "+card_num);
			am.plus_margin(price);
			return true;
		} else {
			System.out.println("카드번호 : "+card_num);
			return false;
		}
	}
}
