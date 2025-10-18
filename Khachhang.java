import java.util.Scanner;

class KhachHang extends ConNguoi {
    private  String idKhachHang;
    private  String hoTen;
    private  String soDienThoai;

    public KhachHang() {}

    public KhachHang(String idKhachHang, String hoTen, String soDienThoai) {
        this.idKhachHang = idKhachHang;
        this.hoTen = hoTen;
        this.soDienThoai = soDienThoai;
    }

    public String getIdKhachHang() {
        return idKhachHang;
    }

    public void setIdKhachHang(String idKhachHang) {
        this.idKhachHang = idKhachHang;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ID khach hang: ");
        idKhachHang = sc.nextLine();
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap so dien thoai: ");
        soDienThoai = sc.nextLine();
    }

    public void hienThiThongTin() {
        System.out.println("ID: " + idKhachHang);
        System.out.println("Ho ten: " + hoTen);
        System.out.println("So dien thoai: " + soDienThoai);
    }
}

class KhachHangThuong extends KhachHang {
    private int soLanMuaHang;
    private double tongChiTieu;

    public KhachHangThuong() {}


    public KhachHangThuong(String idKhachHang, String hoTen, String soDienThoai,
                           int soLanMuaHang, double tongChiTieu) {
        super(idKhachHang, hoTen, soDienThoai);
        this.soLanMuaHang = soLanMuaHang;
        this.tongChiTieu = tongChiTieu;
    }

    public int getSoLanMuaHang() {
        return soLanMuaHang;
    }

    public void setSoLanMuaHang(int soLanMuaHang) {
        this.soLanMuaHang = soLanMuaHang;
    }

    public double getTongChiTieu() {
        return tongChiTieu;
    }

    public void setTongChiTieu(double tongChiTieu) {
        this.tongChiTieu = tongChiTieu;
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so lan mua hang: ");
        soLanMuaHang = sc.nextInt();
        System.out.print("Nhap tong chi tieu (VND): ");
        tongChiTieu = sc.nextDouble();
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("=== Khach Hang Thuong ===");
        super.hienThiThongTin();
        System.out.println("So lan mua hang: " + soLanMuaHang);
        System.out.println("Tong chi tieu: " + tongChiTieu + " VND");
    }
}

class KhachHangVIP extends KhachHang {
    private double tongChiTieu;
    private double diemTichLuy;

    public KhachHangVIP() {}

    public KhachHangVIP(String idKhachHang, String hoTen, String soDienThoai,
                        double tongChiTieu, double diemTichLuy) {
        super(idKhachHang, hoTen, soDienThoai);
        this.tongChiTieu = tongChiTieu;
        this.diemTichLuy = diemTichLuy;
    }


    public double getTongChiTieu() {
        return tongChiTieu;
    }

    public void setTongChiTieu(double tongChiTieu) {
        this.tongChiTieu = tongChiTieu;
    }

    public double getDiemTichLuy() {
        return diemTichLuy;
    }

    public void setDiemTichLuy(double diemTichLuy) {
        this.diemTichLuy = diemTichLuy;
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap tong chi tieu (VND): ");
        tongChiTieu = sc.nextDouble();
        System.out.print("Nhap diem tich luy: ");
        diemTichLuy = sc.nextDouble();
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("=== Khach Hang VIP ===");
        super.hienThiThongTin();
        System.out.println("Tong chi tieu: " + tongChiTieu + " VND");
        System.out.println("Diem tich luy: " + diemTichLuy);
    }
}

public class Khachhang {
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



