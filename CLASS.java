package Java;

import java.util.Scanner;

abstract class HoaDon {
	private double gia;
	private String maKH;
	private float soLuong;
	private String tenKH;

	public double getGia() {
		return this.gia;
	}

	public void setGia(double gia) {
		this.gia = gia;
	}

	public String getMaKH() {
		return this.maKH;
	}

	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}

	public float getSoLuong() {
		return this.soLuong;
	}

	public void setSoLuong(float soLuong) {
		this.soLuong = soLuong;
	}

	public String getTenKH() {
		return this.tenKH;
	}

	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}

	public HoaDon() {
	}

	public HoaDon(double gia, String maKH, int soLuong, String tenKH) {
		this.gia = gia;
		this.maKH = maKH;
		this.soLuong = soLuong;
		this.tenKH = tenKH;
	}

	public abstract float ChietKhau();

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Gia: ");
		gia = sc.nextFloat();
		System.out.println("Ma khach hang: ");
		maKH = sc.nextLine();
		System.out.println("So luong: ");
		soLuong = sc.nextInt();
		System.out.println("Ten khach hang: ");
		tenKH = sc.nextLine();
	}

	public double TongTien() {
		return soLuong * gia;
	}

	public double thueVAT() {
		return TongTien() * 0.1;
	}

	public void xuat() {
		System.out.println("Gia: " + gia);
		System.out.println("Ma KH: " + maKH);
		System.out.println("So luong: " + soLuong);
		System.out.println("Ten KH: " + tenKH);
	}
}

abstract class CongTyABC {
	private String DiaChi;
	private HoaDon[] dsHoaDon;
	private String TenCty;

	public CongTyABC() {
	}

	public CongTyABC(String DiaChi, HoaDon[] dsHoaDon, String TenCty) {
		this.DiaChi = DiaChi;
		this.dsHoaDon = dsHoaDon;
		this.TenCty = TenCty;
	}

	public HoaDon getDsHoaDon() {
		return dsHoaDon;
	}

	public void setDsHoaDon(HoaDon dsHoaDon) {
		this.dsHoaDon = dsHoaDon;
	}

public void NhapDS() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhập địa chỉ khách hàng: ");
	DiaChi = sc.nextLine();
	System.out.println("Hãy nhập số lượng hóa đơn: ");
	int soLuong = sc.nextInt();
	sc.nextLine();
	HoaDon = new HoaDon[n];
	for (int i = 0; i < soLuong; i++) {
		System.out.println("Hãy nhập hóa đơn thứ : " + (i+1) + " : ");
		HoaDon[i] = new CongTyABC();
		HoaDon[i].nhap;
	}
	System.out.println("Nhập tên công ty: ");
	TenCty = sc.nextInt()
}

	public void XuatDS() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Địa chỉ khách hàng: " + DiaChi);
		System.out.println("Danh sách hóa đơn");
		for (int i = 0; i < dsHoaDon.length; i++) {
			System.out.println("Hóa đơn thứ " + (i + 1) + ":");
			dsHoaDon[i].xuat();
		}
		System.out.println("Tên công ty: " + TenCty);
	}
}

public class Main {
	public static void main(String[] args) {
		CongTyABC ABC = new CongTyABC();
		ABC.NhapDS();
		ABC.XuatDS();
	}
}
