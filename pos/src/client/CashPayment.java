package client;
import java.util.Scanner;

public class CashPayment implements Payment{
	public int cash;
	public void cash() {
		System.out.print("얼마를 받았습니까? : ");
		Scanner sc = new Scanner(System.in);
		cash = sc.nextInt();
	}
	@Override
	public boolean pay(int price) {
		cash();
		System.out.println(cash + "원을 받았습니다.");
		if (price < cash) {
			System.out.println("거스름돈 : " + (cash - price) + "원");
			return true;
		} else {
			System.out.println("돈을 덜 받았습니다.");
			return false;
		}
	}
}
