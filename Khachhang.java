import java.util.Scanner;

class KhachHang {
    private String idKhachHang;
    private String hoTen;
    private String soDienThoai;


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
        setIdKhachHang(sc.nextLine());
        System.out.print("Nhap ho ten: ");
        setHoTen(sc.nextLine());
        System.out.print("Nhap so dien thoai: ");
        setSoDienThoai(sc.nextLine());
    }

    public void hienThiThongTin() {
        System.out.println("ID: " + getIdKhachHang());
        System.out.println("Ho ten: " + getHoTen());
        System.out.println("So dien thoai: " + getSoDienThoai());
    }
}

class KhachHangThuong extends KhachHang {
    private int soLanMuaHang;
    private double tongChiTieu;


    public KhachHangThuong() {}

    public KhachHangThuong(String id, String hoTen, String sdt, int soLanMuaHang, double tongChiTieu) {
        super(id, hoTen, sdt);
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
        setSoLanMuaHang(sc.nextInt());
        System.out.print("Nhap tong chi tieu (VND): ");
        setTongChiTieu(sc.nextDouble());
    }

    // Ghi đè phương thức hiển thị
    @Override
    public void hienThiThongTin() {
        System.out.println("=== Khach Hang Thuong ===");
        super.hienThiThongTin();
        System.out.println("So lan mua hang: " + getSoLanMuaHang());
        System.out.println("Tong chi tieu: " + getTongChiTieu() + " VND");
    }
}

class KhachHangVIP extends KhachHang {
    private double tongChiTieu;
    private double diemTichLuy;
    private String hangThe;

    public KhachHangVIP() {}

   
    public KhachHangVIP(String id, String hoTen, String sdt, double tongChiTieu, double diemTichLuy, String hangThe) {
        super(id, hoTen, sdt);
        this.tongChiTieu = tongChiTieu;
        this.diemTichLuy = diemTichLuy;
        this.hangThe = hangThe;
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

    public String getHangThe() {
        return hangThe;
    }

    public void setHangThe(String hangThe) {
        this.hangThe = hangThe;
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap tong chi tieu (VND): ");
        setTongChiTieu(sc.nextDouble());
        System.out.print("Nhap diem tich luy: ");
        setDiemTichLuy(sc.nextDouble());
        sc.nextLine(); // clear buffer
        System.out.print("Nhap hang the (Vang/Bac/Kim Cuong): ");
        setHangThe(sc.nextLine());
    }


    @Override
    public void hienThiThongTin() {
        System.out.println("=== Khach Hang VIP ===");
        super.hienThiThongTin();
        System.out.println("Tong chi tieu: " + getTongChiTieu() + " VND");
        System.out.println("Diem tich luy: " + getDiemTichLuy());
        System.out.println("Hang the: " + getHangThe());
    }
}

public class Khachhang {
    public static void main(String[] args) {
        System.out.println("Nhap thong tin khach hang thuong:");
        KhachHangThuong khThuong = new KhachHangThuong();
        khThuong.nhapThongTin();

        System.out.println("\nNhap thong tin khach hang VIP:");
        KhachHangVIP khVIP = new KhachHangVIP();
        khVIP.nhapThongTin();

        System.out.println("\n=== DANH SACH KHACH HANG ===");
        khThuong.hienThiThongTin();
        System.out.println();
        khVIP.hienThiThongTin();
    }
}
