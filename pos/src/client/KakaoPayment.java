package client;

public class KakaoPayment implements Payment{
	Asset_Management am = new Asset_Management();
	public int code = 0;
	public boolean pay(int price) {
		System.out.println("<class KakaoPayment>īī������ ������ �����...");
		int limit = 100000;
		if (limit >= price) {
			System.out.println("<class KakaoPayment>���� ���� ������ ����...");
			am.plus_margin(price);
			return true;
		}else {
			System.out.println("<class KakaoPayment>�ѵ� �ʰ�");
			return false;
		}
	}
}
