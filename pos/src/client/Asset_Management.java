package client;

import java.util.Scanner;

public class Asset_Management {
	public static int cash = 0;
	public static int margin = 0;
	public void initialize_cash() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int icash = sc.nextInt();
		cash = icash;
	}
	public void plus_cash(int rcash, int change) {
		if (cash < change) {
			System.out.println("�Ž������� �����մϴ�.");
		}
		else {
			cash += rcash;
			cash -= change;
			margin += (rcash-change);
		}
	}
	public void plus_margin(int r) {
		margin += r;
	}
	public void print_margin() {
		System.out.println("���� : "+cash);
		System.out.println("���� : "+margin);
	}
}
