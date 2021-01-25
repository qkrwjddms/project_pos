package client;

public class KakaoPayment implements Payment{
	Asset_Management am = new Asset_Management();
	public int code = 0;
	public boolean pay(int price) {
		System.out.println("<class KakaoPayment>카카오페이 서버와 통신중...");
		int limit = 100000;
		if (limit >= price) {
			System.out.println("<class KakaoPayment>결제 정보 서버에 전송...");
			am.plus_margin(price);
			return true;
		}else {
			System.out.println("<class KakaoPayment>한도 초과");
			return false;
		}
	}
}
