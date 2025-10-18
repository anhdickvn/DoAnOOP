

import java.util.Scanner;

abstract class ConNguoi {
	private String hoTen;
	private String maDinhDanh;
	private String ngaySinh;
	private String diaChi;
	private String soDienThoai;

	public ConNguoi() {
	}

	public ConNguoi(String hoTen, String maDinhDanh, String ngaySinh, String diaChi, String soDienThoai) {
		this.hoTen = hoTen;
		this.maDinhDanh = maDinhDanh;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
		this.soDienThoai = soDienThoai;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getMaDinhDanh() {
		return maDinhDanh;
	}

	public void setMaDinhDanh(String maDinhDanh) {
		this.maDinhDanh = maDinhDanh;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public void nhapThongTin() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ho ten: ");
		hoTen = sc.nextLine();
		System.out.print("Nhap ma dinh danh: ");
		maDinhDanh = sc.nextLine();
		System.out.print("Nhap ngay sinh: ");
		ngaySinh = sc.nextLine();
		System.out.print("Nhap dia chi: ");
		diaChi = sc.nextLine();
		System.out.print("Nhap so dien thoai: ");
		soDienThoai = sc.nextLine();
	}

	public void hienThiThongTin() {
		System.out.println("Ho ten: " + hoTen);
		System.out.println("Ma dinh danh: " + maDinhDanh);
		System.out.println("Ngay sinh: " + ngaySinh);
		System.out.println("Dia chi: " + diaChi);
		System.out.println("So dien thoai: " + soDienThoai);
	}
}

class KhachHang extends ConNguoi {
	private String idKhachHang;

	public KhachHang() {
	}

	public KhachHang(String hoTen, String maDinhDanh, String ngaySinh, String diaChi, String soDienThoai,
			String idKhachHang) {
		super(hoTen, maDinhDanh, ngaySinh, diaChi, soDienThoai);
		this.idKhachHang = idKhachHang;
	}

	public String getIdKhachHang() {
		return idKhachHang;
	}

	public void setIdKhachHang(String idKhachHang) {
		this.idKhachHang = idKhachHang;
	}

	@Override
	public void nhapThongTin() {
		super.nhapThongTin();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ID khach hang: ");
		idKhachHang = sc.nextLine();
	}

	@Override
	public void hienThiThongTin() {
		System.out.println("=== Thong tin khach hang ===");
		super.hienThiThongTin();
		System.out.println("ID khach hang: " + idKhachHang);
	}
}

class KhachHangThuong extends KhachHang {
	private int soLanMua;

	public KhachHangThuong() {
	}

	public KhachHangThuong(String hoTen, String maDinhDanh, String ngaySinh, String diaChi, String soDienThoai,
			String idKhachHang, int soLanMua) {
		super(hoTen, maDinhDanh, ngaySinh, diaChi, soDienThoai, idKhachHang);
		this.soLanMua = soLanMua;
	}

	public int getSoLanMua() {
		return soLanMua;
	}

	public void setSoLanMua(int soLanMua) {
		this.soLanMua = soLanMua;
	}

	@Override
	public void nhapThongTin() {
		super.nhapThongTin();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so lan mua hang: ");
		soLanMua = sc.nextInt();
	}

	@Override
	public void hienThiThongTin() {
		System.out.println("=== Khach Hang Thuong ===");
		super.hienThiThongTin();
		System.out.println("So lan mua: " + soLanMua);
	}
}

class KhachHangVIP extends KhachHang {
	private double mucGiamGia;
	private int diemTichLuy;

	public KhachHangVIP() {
	}

	public KhachHangVIP(String hoTen, String maDinhDanh, String ngaySinh, String diaChi, String soDienThoai,
			String idKhachHang, double mucGiamGia, int diemTichLuy) {
		super(hoTen, maDinhDanh, ngaySinh, diaChi, soDienThoai, idKhachHang);
		this.mucGiamGia = mucGiamGia;
		this.diemTichLuy = diemTichLuy;
	}

	public double getMucGiamGia() {
		return mucGiamGia;
	}

	public void setMucGiamGia(double mucGiamGia) {
		this.mucGiamGia = mucGiamGia;
	}

	public int getDiemTichLuy() {
		return diemTichLuy;
	}

	public void setDiemTichLuy(int diemTichLuy) {
		this.diemTichLuy = diemTichLuy;
	}

	@Override
	public void nhapThongTin() {
		super.nhapThongTin();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap muc giam gia (%): ");
		mucGiamGia = sc.nextDouble();
		System.out.print("Nhap diem tich luy: ");
		diemTichLuy = sc.nextInt();
	}

	@Override
	public void hienThiThongTin() {
		System.out.println("=== Khach Hang VIP ===");
		super.hienThiThongTin();
		System.out.println("Muc giam gia: " + mucGiamGia + "%");
		System.out.println("Diem tich luy: " + diemTichLuy);
	}
}

public class Project {
	public static void main(String[] args) {
		KhachHangThuong khThuong = new KhachHangThuong();
		KhachHangVIP khVIP = new KhachHangVIP();

		System.out.println("Nhap thong tin khach hang thuong:");
		khThuong.nhapThongTin();

		System.out.println("\nNhap thong tin khach hang VIP:");
		khVIP.nhapThongTin();

		System.out.println("\n=== DANH SACH KHACH HANG ===");
		khThuong.hienThiThongTin();
		System.out.println();
		khVIP.hienThiThongTin();
	}
}
