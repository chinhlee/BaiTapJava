package chinhle.it;
import java.util.Scanner;
public class UCLN_BCNN {
	
	public static int UCLN(int a, int b) {
		if(b == 0)
		{
			return a;
		}
		return UCLN(b, a % b);
	}
	
	public static int BCNN(int a, int b) {
		return (a * b) / UCLN(a ,b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		System.out.println("Nhap vao 2 so");
		int a,b;
		System.out.print("So a: ");
		a = sc.nextInt();
		System.out.print("So b: ");
		b = sc.nextInt();
		System.out.println("Uoc chung lon nhat cua " + a + " va " + b + " la: " + UCLN(a,b));
		System.out.println("Boi chung nho nhat cua " + a + " va " + b + " la: " + BCNN(a,b));
	}

}
