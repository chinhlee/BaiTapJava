package chinhle.it;

import java.util.Scanner;

public class SoNgay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int month = 0;
		System.out.print("Nhap thang can kiem tra ngay: ");
		month = sc.nextInt();
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.print("Thang " + month + " co 31 ngay");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.print("Thang " + month + " co 30 ngay");
			break;
		case 2:
			System.out.print("Thang " + month + " co 28 hoac 29 ngay");
			break;
			default:
				System.out.print("Thang " + month + " khong ton tai!");
				break;
		}
	}

}
