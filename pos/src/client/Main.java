package client;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Pos pos = new BookstorePos();
		Asset_Management am = new Asset_Management();
		Scanner sc = new Scanner(System.in);
		am.initialize_cash();
		
		while(true) {
			System.out.print("이용할 서비스를 선택하시오(자산관리 / 결제 / 종료) : ");
			String service = sc.next();
			switch(service) {
			case "결제":
				System.out.print("결제 수단을 입력하시오(카드, 카카오페이, 현금) : ");
				String payment = sc.next();
				switch(payment) {
				case "카드": 
					pos.setPaymentMethod(new CardPayment());
					pos.pay();
					break;
				case "카카오페이":
					pos.setPaymentMethod(new KakaoPayment());
					pos.pay();
					break;
				case "현금":
					pos.setPaymentMethod(new CashPayment());
					pos.pay();
					break;
				default :
					System.out.println("결제 수단 오류");
					break;
				}
				break;
			case "자산관리":
				System.out.print("현금 / 수익 : ");
				String management = sc.next();
				switch(management) {
				case "현금":
					System.out.println("현금 : " + Asset_Management.cash);
					break;
				case "수익":
					System.out.println("수익 : " + Asset_Management.margin);
					break;
				default : 
					System.out.println("잘못 입력하셨습니다.");
					break;
			}
				break;
			case "종료":
				System.out.print("종료합니다");
				return;
			}
		}
	}

}
