package chinhle.it;

import java.util.Scanner;

public class ChanLe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		int n;
		System.out.print("Nhap vao so n: ");
		n = sc.nextInt();
//		//Danh sách số chẵn
//		System.out.print("Danh sach so chan: ");
//		for(int i = 1; i <= n; i++) {
//			if(i % 2 == 0) {
//				System.out.print(i + " ");
//			}
//		}
		//Danh sách số lẻ
		System.out.print("Danh sach so le: ");
		for(int i = 1; i <= n; i++) {
			if(i % 2 != 0) {
				System.out.print(i + " ");
			}
		}

	}

}
