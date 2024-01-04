package QLNhanSu;

import java.util.Scanner;
public class NhanVien extends QLNhanSu.Nguoi{
	private String maNV,ChucVu,TenPhong,TenDA,BangCap,TDNN,CCTH;
	private double LuongCoBan,LuongPhuCap;
	private int HeSoLuong,SoGio;
	NhanVien()
	{
		super();
	}
	NhanVien(String HoTen,String NgaySinh,int Tuoi,String GioiTinh,String DiaChi,String SDT,String Email,String maNV,
			String ChucVu,String TenPhong,String TenDA,String BangCap,String TDNN,String CCTH,double LuongCoBan,
			double LuongPhuCap,int HeSoLuong,int SoGio)
	{
		super(HoTen,NgaySinh,Tuoi,GioiTinh,DiaChi,SDT,Email);
		this.maNV=maNV;
		this.ChucVu=ChucVu;
		this.TenPhong=TenPhong;
		this.TenDA=TenDA;
		this.BangCap=BangCap;
		this.TDNN=TDNN;
		this.CCTH=CCTH;
		this.LuongCoBan=LuongCoBan;
		this.LuongPhuCap=LuongPhuCap;
		this.HeSoLuong=HeSoLuong;
		this.SoGio=SoGio;
	}
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		super.input();
		System.out.println("Nhap vao ma nhan vien: ");
		this.maNV=sc.nextLine();
		System.out.println("Nhap vao chuc vu: ");
		this.ChucVu=sc.nextLine();
		System.out.println("Nhap vao ten phong: ");
		this.TenPhong=sc.nextLine();
		System.out.println("Nhap vao ten du an: ");
		this.TenDA=sc.nextLine();
		System.out.println("Nhap vao bang cap: ");
		this.BangCap=sc.nextLine();
		System.out.println("Nhap vao trinh do ngoai ngu: ");
		this.TDNN=sc.nextLine();
		System.out.println("Nhap vao chung chi tin hoc: ");
		this.CCTH=sc.nextLine();
		System.out.println("Nhap vao luong co ban: ");
		this.LuongCoBan=sc.nextDouble();
		System.out.println("Nhap vao luong phu cap: ");
		this.LuongPhuCap=sc.nextDouble();
		System.out.println("Nhap vao he so luong: ");
		this.HeSoLuong=sc.nextInt();
		System.out.println("Nhap vao so gio lam viec: ");
		this.SoGio=sc.nextInt();
	}
	public void output()
	{
		super.output();
		System.out.println("Ma nhan vien: "+maNV);
		System.out.println("Chuc vu: "+ChucVu);
		System.out.println("Ten phong: "+TenPhong);
		System.out.println("Ten du an: "+TenDA);
		System.out.println("Bang cap: "+BangCap);
		System.out.println("Trinh do ngoai ngu: "+TDNN);
		System.out.println("Chung chi tin hoc: "+CCTH);
		System.out.println("Luong co ban: "+LuongCoBan);
		System.out.println("Luong phu cap: "+LuongPhuCap);
		System.out.println("He so luong: "+HeSoLuong);
		System.out.println("So gio lam viec: "+SoGio);
	}
	
	public double TinhLuong()
	{
		double Luong;
			Luong = (LuongCoBan + LuongPhuCap) * HeSoLuong;
		return Luong;
	}
	
	public double TinhThuong()
	{
		double Thuong;
		if(SoGio>=300)
			Thuong = TinhLuong() * 2;
		else if(SoGio>=200 && SoGio<300)
			Thuong = TinhLuong() * 1.5;
		else
			Thuong = 0;
		return Thuong;	
	}
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public String getChucVu() {
		return ChucVu;
	}
	public void setChucVu(String chucVu) {
		ChucVu = chucVu;
	}
	public String getTenPhong() {
		return TenPhong;
	}
	public void setTenPhong(String tenPhong) {
		TenPhong = tenPhong;
	}
	public String getTenDA() {
		return TenDA;
	}
	public void setTenDA(String tenDA) {
		TenDA = tenDA;
	}
	public String getBangCap() {
		return BangCap;
	}
	public void setBangCap(String bangCap) {
		BangCap = bangCap;
	}
	public String getTDNN() {
		return TDNN;
	}
	public void setTDNN(String tDNN) {
		TDNN = tDNN;
	}
	public String getCCTH() {
		return CCTH;
	}
	public void setCCTH(String cCTH) {
		CCTH = cCTH;
	}
	public double getLuongCoBan() {
		return LuongCoBan;
	}
	public void setLuongCoBan(double luongCoBan) {
		LuongCoBan = luongCoBan;
	}
	public double getLuongPhuCap() {
		return LuongPhuCap;
	}
	public void setLuongPhuCap(double luongPhuCap) {
		LuongPhuCap = luongPhuCap;
	}
	public int getHeSoLuong() {
		return HeSoLuong;
	}
	public void setHeSoLuong(int heSoLuong) {
		HeSoLuong = heSoLuong;
	}
	public int getSoGio() {
		return SoGio;
	}
	public void setSoGio(int soGio) {
		SoGio = soGio;
	}

	

}
