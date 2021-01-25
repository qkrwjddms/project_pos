package client;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Pos pos = new BookstorePos();
		Asset_Management am = new Asset_Management();
		Scanner sc = new Scanner(System.in);
		am.initialize_cash();
		
		while(true) {
			System.out.print("�̿��� ���񽺸� �����Ͻÿ�(�ڻ���� / ���� / ����) : ");
			String service = sc.next();
			switch(service) {
			case "����":
				System.out.print("���� ������ �Է��Ͻÿ�(ī��, īī������, ����) : ");
				String payment = sc.next();
				switch(payment) {
				case "ī��": 
					pos.setPaymentMethod(new CardPayment());
					pos.pay();
					break;
				case "īī������":
					pos.setPaymentMethod(new KakaoPayment());
					pos.pay();
					break;
				case "����":
					pos.setPaymentMethod(new CashPayment());
					pos.pay();
					break;
				default :
					System.out.println("���� ���� ����");
					break;
				}
				break;
			case "�ڻ����":
				System.out.print("���� / ���� : ");
				String management = sc.next();
				switch(management) {
				case "����":
					System.out.println("���� : " + Asset_Management.cash);
					break;
				case "����":
					System.out.println("���� : " + Asset_Management.margin);
					break;
				default : 
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
					break;
			}
				break;
			case "����":
				System.out.print("�����մϴ�");
				return;
			}
		}
	}

}
