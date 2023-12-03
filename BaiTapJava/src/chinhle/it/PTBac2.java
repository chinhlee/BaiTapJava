package chinhle.it;
import java.util.Scanner;

public class PTBac2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Tạo đối tượng sc từ lớp Scanner để cho phép nhập liệu từ bàn phím
		Scanner sc = new Scanner(System.in);
		
		//Khai báo biến
		double a,b,c,delta,x,x1,x2;
		
		//Nhập hệ số
		System.out.println("Nhap vao cac he so cua puong trinh: ");
		System.out.print("He so a: ");
		a = sc.nextFloat();
		System.out.print("He so b: ");
		b = sc.nextFloat();
		System.out.print("He so c: ");
		c = sc.nextFloat();
		
		//Giải và biện luận
		if (a == 0) {
			if(b == 0) {
				if( c == 0) {
					System.out.print("Phuong trinh vo xo nghiem!");
				}
				else {
					System.out.print("Phuong trinh vo nghiem!");
				}
			}
			else {
				x = -c / b;
				System.out.print("Phuong trinh co mot nghiem x = " + x);
			}
		}
		else {
			delta = b * b - 4 * a * c;
			if(delta < 0) {
				System.out.print("Phuong trinh vo nghiem!");
			}
			else if(delta == 0) {
				x1 = x2 = -b / (2*a);
				System.out.print("Phuong trinh co nghiem kep x1 = x2 =" + x1);
			}
			else {
				x1 = (-b - Math.sqrt(delta)) / (2*a);
				x2 = (-b + Math.sqrt(delta)) / (2*a);
				System.out.print("Phuong trinh co 2 nghiem phan biet x1 = " + x1 +"\n x2 = " + x2);
			}
		}
		

	}

}
