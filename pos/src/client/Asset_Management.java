package client;

import java.util.Scanner;

public class Asset_Management {
	public static int cash = 0;
	public static int margin = 0;
	public void initialize_cash() {
		Scanner sc = new Scanner(System.in);
		System.out.print("현금을 입력하세요 : ");
		int icash = sc.nextInt();
		cash = icash;
	}
	public void plus_cash(int rcash, int change) {
		if (cash < change) {
			System.out.println("거스름돈이 부족합니다.");
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
		System.out.println("현금 : "+cash);
		System.out.println("수익 : "+margin);
	}
}
