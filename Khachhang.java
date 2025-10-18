import java.util.Scanner;
class KhachHan extends ConNguoi {
    private String idKhachHang;

    public KhachHang() {
        this.idKhachHang = "";
    }

    public KhachHang(String idKhachHang) {
        this.idKhachHang = idKhachHang;
    }

    public String getIdKhachHang() {
        return idKhachHang;
    }

    public void setIdKhachHang(String idKhachHang) {
        this.idKhachHang = idKhachHang;
    }

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ID khách hàng: ");
        idKhachHang = sc.nextLine();
    }

    public void hienThiThongTin() {
        System.out.println("ID khách hàng: " + idKhachHang);
    }
}

class KhachHangVIP extends KhachHang {
    private double mucGiamGia;
    private int diemTichLuy;

    public KhachHangVIP() {
        super();
        this.mucGiamGia = 0.0;
        this.diemTichLuy = 0;
    }

    public KhachHangVIP(String id, double mucGiamGia, int diemTichLuy) {
        super(id);
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
        System.out.print("Nhập mức giảm giá (%): ");
        mucGiamGia = sc.nextDouble();
        System.out.print("Nhập điểm tích lũy: ");
        diemTichLuy = sc.nextInt();
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Mức giảm giá: " + mucGiamGia + "%");
        System.out.println("Điểm tích lũy: " + diemTichLuy);
    }
}

class KhachHangThuong extends KhachHang {
    private int soLanMua;

    public KhachHangThuong() {
        super();
        this.soLanMua = 0;
    }

    public KhachHangThuong(String id, int soLanMua) {
        super(id);
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
        System.out.print("Nhập số lần mua hàng: ");
        soLanMua = sc.nextInt();
    }


    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Số lần mua hàng: " + soLanMua);
    }
}

public class Khachhang {
    public static void main(String[] args) {
        System.out.println("=== Nhập thông tin khách hàng VIP ===");
        KhachHangVIP vip = new KhachHangVIP();
        vip.nhapThongTin();

        System.out.println("\n=== Nhập thông tin khách hàng Thường ===");
        KhachHangThuong thuong = new KhachHangThuong();
        thuong.nhapThongTin();

        System.out.println("\n=== Thông tin khách hàng VIP ===");
        vip.hienThiThongTin();

        System.out.println("\n=== Thông tin khách hàng Thường ===");
        thuong.hienThiThongTin();
    }
}
