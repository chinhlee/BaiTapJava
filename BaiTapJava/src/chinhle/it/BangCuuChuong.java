package chinhle.it;

import java.util.Scanner;

public class BangCuuChuong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Nhap vao so ma ban muon xem bang cuu chuong: ");
		n = sc.nextInt();
		for(int i = 1; i <= 10; i++) {
			System.out.format("%d x %d = %d \t",n,i,i*n);
			System.out.println();
		}
	}

}
