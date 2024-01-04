package QLNhanSu;

import java.util.Scanner;

public class Main {
	
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NhanVien nv[]=null;
		int a,n=0; 
		boolean flag=true;
		do 
		{
			System.out.println("===============================================");
		System.out.println("CHUONG TRINH QUAN LY NHAN SU JAVA");
		System.out.println("Ban muon chon so may?");
		System.out.println("1. Nhap du lieu thong tin nhan vien");
		System.out.println("2. In danh sach nhan vien ra man hinh");
		System.out.println("3. Tim kiem thong tin nhan vien theo ma nhan vien");
		System.out.println("4. Tim kiem cac nhan vien lam viec cho mot du an");
		System.out.println("5. Sap xep danh sach tang dan theo luong");
		System.out.println("0. Thoat");
		System.out.println("Chon so: ");
		a= sc.nextInt();
		switch (a)
		{
		case 1:
		    System.out.println("Nhap vao so nhan vien: ");
		    n=sc.nextInt();
		    nv=new NhanVien[n];
		    System.out.println("Nhap danh sach nhan vien: ");
		    for(int i=0; i<nv.length; i++)
		    {
			 System.out.println("Thong tin nhan vien thu "+(i+1));
			 nv[i]=new NhanVien();
		        nv[i].input();
//		        nv[i].TinhLuong();
//		        nv[i].TinhThuong();
		        System.out.println("Tien luong: "+nv[i].TinhLuong());
		        System.out.println("Tien thuong: "+nv[i].TinhThuong());
		     }
	          break; 
		case 2: 
		    System.out.println("Danh sach nhan vien: ");
		    for(int i=0;i<nv.length;i++)
		    {
			  System.out.println("Thong tin nhan vien thu "+(i+1));
			  nv[i].output();
			  System.out.println("Tien luong: "+nv[i].TinhLuong());
			  System.out.println("Tien thuong: "+nv[i].TinhThuong());
		    }
		   break;
		 case 3:
		    String manv;
		    System.out.println("Ma nhan vien: ");
		    manv=sc.nextLine();
		    manv=sc.nextLine();
		    for(int i=0;i<nv.length;i++) 
		    {
			if(nv[i].getMaNV().equals(manv))
			 {
			   System.out.println("Thong tin cua nhan vien co ma nhan vien " +manv+ " la:");
			   nv[i].output();
			   System.out.println("Tien luong: "+nv[i].TinhLuong());
		       System.out.println("Tien thuong: "+nv[i].TinhThuong());
			 }
		    }
		   break;
		case 4:
		    String tenduan;
		    System.out.println("Ten du an: ");
		    tenduan=sc.nextLine();
		    tenduan=sc.nextLine();
		    for(int i=0;i<nv.length;i++)
		    {
			if(nv[i].getTenDA().equals(tenduan))
			 {
			   System.out.println("Cac nhan vien lam viec cho du an " +tenduan+ " la:");
			   nv[i].output();
			   System.out.println("Tien luong: "+nv[i].TinhLuong());
		       System.out.println("Tien thuong: "+nv[i].TinhThuong());
			 }
		     }
		    break;
		case 5:
		    NhanVien temp = new NhanVien();
		    for(int i=0; i<nv.length-1; i++) 
		    {
			for(int j=i+1;j<nv.length; j++)
			{
			  if(nv[j].TinhLuong() < nv[i].TinhLuong())
			   {
				temp = nv[j];
				nv[j]=nv[i];
				nv[i]=temp;
			   }
			}
		    }
		    System.out.println("Danh sach nhan vien tang dan theo luong");
		    for(int i=0; i<nv.length; i++)
		    {
			  nv[i].output();
		      System.out.println("Tien luong: "+nv[i].TinhLuong());
		      System.out.println("Tien thuong: "+nv[i].TinhThuong());
		    }
			break;
		 default:
		    System.out.println("Tam biet! Hen gap lai");
                 flag = false;
                 break;
			}		
	    }while (flag);
	}

}
