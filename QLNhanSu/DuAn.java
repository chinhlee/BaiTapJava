package QLNhanSu;

import java.util.Scanner;

public class DuAn {
	private String maDA,TenDA;
	DuAn()
	{
		
	}
	DuAn(String maDA, String TenDA)
	{
		this.maDA=maDA;
		this.TenDA=TenDA;
	}
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap vao ma du an: ");
		this.maDA=sc.nextLine();
		System.out.println("Nhap vao ten du an: ");
		this.TenDA=sc.nextLine();
	}
	public void output()
	{
		System.out.println("Ma du an: "+maDA);
		System.out.println("Ten du an: "+TenDA);
	}
	public String getMaDA() {
		return maDA;
	}
	public void setMaDA(String maDA) {
		this.maDA = maDA;
	}
	public String getTenDA() {
		return TenDA;
	}
	public void setTenDA(String tenDA) {
		TenDA = tenDA;
	}

	
}
