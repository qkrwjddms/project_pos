package client;

public class KakaoPayment implements Payment{
	public int code = 0;
	public boolean pay(int price) {
		System.out.println("<class KakaoPayment>īī������ ������ �����...");
		int limit = 100000;
		if (limit >= price) {
			System.out.println("<class KakaoPayment>���� ���� ������ ����...");
			return true;
		}else {
			System.out.println("<class KakaoPayment>�ѵ� �ʰ�");
			return false;
		}
	}
}
