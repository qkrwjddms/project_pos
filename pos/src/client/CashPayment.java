package client;
import java.util.Scanner;

public class CashPayment implements Payment{
	public int cash;
	public void cash() {
		System.out.print("�󸶸� �޾ҽ��ϱ�? : ");
		Scanner sc = new Scanner(System.in);
		cash = sc.nextInt();
	}
	@Override
	public boolean pay(int price) {
		cash();
		System.out.println(cash + "���� �޾ҽ��ϴ�.");
		if (price < cash) {
			System.out.println("�Ž����� : " + (cash - price) + "��");
			return true;
		} else {
			System.out.println("���� �� �޾ҽ��ϴ�.");
			return false;
		}
	}
}
