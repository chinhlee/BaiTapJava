package chinhle.it;
import java.util.Scanner;
public class dayFibonacci {
	
	public static int Fibonacci(int n) {
		if(n==0){
			return 0;
		}
		if(n==1) {
			return 1;
		}
		return Fibonacci(n - 2) + Fibonacci(n - 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Nhap vao so can hien thi day Fibonacci: ");
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
            System.out.print(Fibonacci(i) + " ");
        }
	}

}
