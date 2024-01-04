package QLNhanSu;

import java.util.Scanner;

public class Nguoi {
	private String HoTen,NgaySinh,GioiTinh,DiaChi,SDT,Email;
	int Tuoi;
	Nguoi()
	{
		
	}
	Nguoi(String HoTen,String NgaySinh,int Tuoi,String GioiTinh,String DiaChi,String SDT,String Email)
	{
		this.HoTen=HoTen;
		this.NgaySinh=NgaySinh;
		this.Tuoi=Tuoi;
		this.GioiTinh=GioiTinh;
		this.DiaChi=DiaChi;
		this.SDT=SDT;
		this.Email=Email;
	}
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap vao ho va ten: ");
		this.HoTen=sc.nextLine();
		System.out.println("Nhap vao gioi tinh: ");
		this.GioiTinh=sc.nextLine();
		System.out.println("Nhap vao ngay sinh: ");
		this.NgaySinh=sc.nextLine();
		this.Tuoi=KiemTraTuoi("Nhap vao tuoi: ", "Tuoi phai la so nguyen duong. Moi ban nhap lai tuoi");
		System.out.println("Nhap vao dia chi: ");
		this.DiaChi=sc.nextLine();
		System.out.println("Nhap vao so dien thoai: ");
		this.SDT=sc.nextLine();
		System.out.println("Nhap vao Email: ");
		this.Email=sc.nextLine();
	}
	
	//Xử lý lỗi về tuổi
	private int KiemTraTuoi(String msg, String errormsg)
	{
		int b=0;
		boolean kiemtra=true;
		Scanner sc=new Scanner(System.in);
		do
		{
			try {
				System.out.println(msg);
				b = Integer.parseInt(sc.nextLine());
				kiemtra=false;
			}catch(NumberFormatException e)
			{
				System.out.println(errormsg);
			}
		}while(kiemtra);
		return b;
	}
	
	
	public void output()
	{
		System.out.println("Ho va ten: "+HoTen);
		System.out.println("Gioi tinh: "+GioiTinh);
		System.out.println("Ngay sinh: "+NgaySinh);
		System.out.println("Tuoi: "+Tuoi);
		System.out.println("Dia chi: "+DiaChi);	
		System.out.println("So dien thoai: "+SDT);
		System.out.println("Email: "+Email);
	}
	public String getHoTen() {
		return HoTen;
	}
	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}
	public String getNgaySinh() {
		return NgaySinh;
	}
	public void setNgaySinh(String ngaySinh) {
		NgaySinh = ngaySinh;
	}
	public String getGioiTinh() {
		return GioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		GioiTinh = gioiTinh;
	}
	public String getDiaChi() {
		return DiaChi;
	}
	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}
	public String getSDT() {
		return SDT;
	}
	public void setSDT(String sDT) {
		SDT = sDT;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getTuoi() {
		return Tuoi;
	}
	public void setTuoi(int tuoi) {
		Tuoi = tuoi;
	}

    
}

