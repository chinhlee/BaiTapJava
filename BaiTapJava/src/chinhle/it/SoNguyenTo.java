package chinhle.it;

import java.util.Scanner;

public class SoNguyenTo {
	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}

		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao so can kiem tra: ");
		int n;
		n = sc.nextInt();
		if (isPrime(n)) 
		{
			System.out.print("So " + n + " la so nguyen to");
		} 
		else 
		{
			System.out.print("So " + n + " khong la so nguyen to");
		}
	}

}
