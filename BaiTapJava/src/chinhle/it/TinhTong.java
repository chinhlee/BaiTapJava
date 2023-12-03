package chinhle.it;

import java.util.Scanner;

public class TinhTong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		int tong = 0;
		System.out.println("Nhap vao n: ");
		n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			tong = tong + i;
		}
		System.out.print("Tong day so vua nhap la: " + tong);

	}

}
