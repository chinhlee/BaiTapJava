package QLNhanSu;

import java.util.Scanner;

public class PhongBan {
	private String maPB,TenPhong,soDT;
	PhongBan()
	{
		
	}
	PhongBan(String maPB,String TenPhong,String soDT,int soNV)
	{
		this.maPB=maPB;
		this.TenPhong=TenPhong;
		this.soDT=soDT;
	}
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap vao ma phong ban: ");
		this.maPB=sc.nextLine();
		System.out.println("Nhap vao ten phong: ");
		this.TenPhong=sc.nextLine();
		System.out.println("Nhap vao so dien thoai phong ban: ");
		this.soDT=sc.nextLine();
	}
	public void output()
	{
		System.out.println("Ma phong ban: "+maPB);
		System.out.println("Ten phong: "+TenPhong);
		System.out.println("So dien thoai phong ban: "+soDT);
	}
	public String getMaPB() {
		return maPB;
	}
	public void setMaPB(String maPB) {
		this.maPB = maPB;
	}
	public String getTenPhong() {
		return TenPhong;
	}
	public void setTenPhong(String tenPhong) {
		TenPhong = tenPhong;
	}
	public String getSoDT() {
		return soDT;
	}
	public void setSoDT(String soDT) {
		this.soDT = soDT;
	}

	
}
