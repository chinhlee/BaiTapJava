package chinhle.it;
import java.util.Scanner;
public class GiaiThua {
	public static int tinhGiaiThua(int n){
		int giaithua = 1;
		if(n == 0 || n == 1)
		{
			return 1;
		}
		else {
			for(int i=1; i<=n; i++) {
				giaithua = giaithua * i;
			}
		}
		return giaithua;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao so can tinh gia thua: ");
		int n;
		n = sc.nextInt();
		System.out.print("Giai thua cua so " + n + " la: " + tinhGiaiThua(n));
	}

}
