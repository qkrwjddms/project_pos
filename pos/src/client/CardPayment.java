package client;

public class CardPayment implements Payment{
	Asset_Management am = new Asset_Management();
	@Override
	public boolean pay(int price) {
		CardReader cr = new CardReader();
		int card_num = cr.read_card();
		System.out.println("<class CardPayment>ī�� ������ �����...");
		System.out.println("ī���ȣ : "+card_num);
		int limit = 10000000;
		if(limit >= price) {
			System.out.println("<class CardPayment>���� ���� ������ ����...");
			System.out.println("ī���ȣ : "+card_num);
			am.plus_margin(price);
			return true;
		} else {
			System.out.println("ī���ȣ : "+card_num);
			return false;
		}
	}
}
