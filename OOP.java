import java.util.*;

abstract class ConNguoi {
    private String hoTen;
    private String maDinhDanh;
    private String ngaySinh;
    private String diaChi;
    private String soDienThoai;

    public void nhapThongTin(Scanner sc) {
        System.out.print("Nhap ho va ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap Ma Dinh Danh: ");
        maDinhDanh = sc.nextLine();
        System.out.print("Nhap ngay sinh: ");
        ngaySinh = sc.nextLine();
        System.out.print("Nhap dia chi: ");
        diaChi = sc.nextLine();
        System.out.print("Nhap so dien thoai: ");
        soDienThoai = sc.nextLine();
    }

    public void hienThiThongTin() {
        System.out.println("Ho va Ten: " + hoTen);
        System.out.println("Ma Dinh Danh: " + maDinhDanh);
        System.out.println("Ngay Sinh: " + ngaySinh);
        System.out.println("Dia Chi: " + diaChi);
        System.out.println("So Dien Thoai: " + soDienThoai);
    }
}

class QuanLy extends ConNguoi {
    private String idQuanLy;
    private double luong;
    private String khuLamViec;

    @Override
    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("Nhap ID quan ly: ");
        idQuanLy = sc.nextLine();
        System.out.print("Nhap luong: ");
        luong = sc.nextDouble(); sc.nextLine();
        System.out.print("Nhap khu lam viec: ");
        khuLamViec = sc.nextLine();
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("\n=== Thong tin Quan Ly ===");
        super.hienThiThongTin();
        System.out.println("ID Quan Ly: " + idQuanLy);
        System.out.println("Luong: " + luong);
        System.out.println("Khu lam viec: " + khuLamViec);
    }
}

class NhanVien extends ConNguoi {
    private String idNhanVien;
    private double luong;
    private String chucVu;
    private String ca;

    @Override
    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("Nhap ID Nhan Vien: ");
        idNhanVien = sc.nextLine();
        System.out.print("Nhap luong: ");
        luong = sc.nextDouble(); sc.nextLine();
        System.out.print("Nhap chuc vu: ");
        chucVu = sc.nextLine();
        System.out.print("Nhap ca lam viec: ");
        ca = sc.nextLine();
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("\n=== Thong tin Nhan Vien ===");
        super.hienThiThongTin();
        System.out.println("ID Nhan Vien: " + idNhanVien);
        System.out.println("Luong: " + luong);
        System.out.println("Chuc vu: " + chucVu);
        System.out.println("Ca lam viec: " + ca);
    }
}

class ThongKeNhanVien {
    private String idNhanVien;
    private int soLuongHoaDon;
    private double tongDoanhThu;

    public void nhapThongTin(Scanner sc) {
        System.out.print("Nhap ID nhan vien: ");
        idNhanVien = sc.nextLine();
        System.out.print("Nhap so luong hoa don: ");
        soLuongHoaDon = sc.nextInt();
        System.out.print("Nhap tong doanh thu: ");
        tongDoanhThu = sc.nextDouble();
        sc.nextLine();
    }

    public void hienThiThongKe() {
        System.out.println("ID: " + idNhanVien + " | Hoa don: " + soLuongHoaDon + " | Doanh thu: " + tongDoanhThu);
    }

    public String getIdNhanVien() { return idNhanVien; }
    public double getTongDoanhThu() { return tongDoanhThu; }
}

class ThuongNhanVien {
    private String idNhanVien;
    private double soTienThuong;
    private String ngayThuong;

    public void timNhanVienThuong(ThongKeNhanVien[] ds) {
        if (ds == null || ds.length == 0) {
            System.out.println("Khong co du lieu thong ke!");
            return;
        }
        ThongKeNhanVien max = ds[0];
        for (ThongKeNhanVien nv : ds) {
            if (nv.getTongDoanhThu() > max.getTongDoanhThu()) {
                max = nv;
            }
        }
        this.idNhanVien = max.getIdNhanVien();
        this.soTienThuong = max.getTongDoanhThu() * 0.2;
    }

    public void nhapNgayThuong(Scanner sc) {
        System.out.print("Nhap ngay thuong (dd/MM/yyyy): ");
        ngayThuong = sc.nextLine();
    }

    public void hienThiThuong() {
        if (idNhanVien == null) {
            System.out.println("Chua co nhan vien duoc thuong!");
            return;
        }
        System.out.println("\n=== Nhan vien duoc thuong ===");
        System.out.println("ID: " + idNhanVien);
        System.out.println("So tien thuong: " + soTienThuong);
        System.out.println("Ngay thuong: " + ngayThuong);
    }
}

class KhachHang {
    protected String idKhachHang;
    protected String hoTen;
    protected String soDienThoai;

    public void nhapThongTin(Scanner sc) {
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

    @Override
    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("Nhap so lan mua hang: ");
        soLanMuaHang = sc.nextInt();
        System.out.print("Nhap tong chi tieu (VND): ");
        tongChiTieu = sc.nextDouble();
        sc.nextLine();
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("\n=== Khach Hang Thuong ===");
        super.hienThiThongTin();
        System.out.println("So lan mua hang: " + soLanMuaHang);
        System.out.println("Tong chi tieu: " + tongChiTieu + " VND");
    }
}

class KhachHangVIP extends KhachHang {
    private double tongChiTieu;
    private double diemTichLuy;
    private String hangThe;

    @Override
    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("Nhap tong chi tieu (VND): ");
        tongChiTieu = sc.nextDouble();
        System.out.print("Nhap diem tich luy: ");
        diemTichLuy = sc.nextDouble();
        sc.nextLine();
        System.out.print("Nhap hang the (Vang/Bac/Kim Cuong): ");
        hangThe = sc.nextLine();
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("\n=== Khach Hang VIP ===");
        super.hienThiThongTin();
        System.out.println("Tong chi tieu: " + tongChiTieu + " VND");
        System.out.println("Diem tich luy: " + diemTichLuy);
        System.out.println("Hang the: " + hangThe);
    }
}

public class Oop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThongKeNhanVien[] dsThongKe = null;
        ThuongNhanVien thuong = new ThuongNhanVien();
        NhanVien nv = null;
        QuanLy ql = null;
        KhachHangThuong khThuong = null;
        KhachHangVIP khVIP = null;

        int chon;
        do {
            System.out.println("\n===== MENU CHINH =====");
            System.out.println("1. Nhap & hien thi nhan vien");
            System.out.println("2. Nhap & hien thi quan ly");
            System.out.println("3. Nhap danh sach thong ke nhan vien");
            System.out.println("4. Tim nhan vien duoc thuong");
            System.out.println("5. Nhap & hien thi khach hang thuong");
            System.out.println("6. Nhap & hien thi khach hang VIP");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");
            chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1 -> {
                    nv = new NhanVien();
                    nv.nhapThongTin(sc);
                    nv.hienThiThongTin();
                }
                case 2 -> {
                    ql = new QuanLy();
                    ql.nhapThongTin(sc);
                    ql.hienThiThongTin();
                }
                case 3 -> {
                    System.out.print("Nhap so luong thong ke: ");
                    int n = sc.nextInt(); sc.nextLine();
                    dsThongKe = new ThongKeNhanVien[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("\nThong ke thu " + (i + 1) + ":");
                        dsThongKe[i] = new ThongKeNhanVien();
                        dsThongKe[i].nhapThongTin(sc);
                    }
                    for (ThongKeNhanVien tk : dsThongKe) tk.hienThiThongKe();
                }
                case 4 -> {
                    if (dsThongKe == null) System.out.println("Chua co du lieu thong ke!");
                    else {
                        thuong.timNhanVienThuong(dsThongKe);
                        thuong.nhapNgayThuong(sc);
                        thuong.hienThiThuong();
                    }
                }
                case 5 -> {
                    khThuong = new KhachHangThuong();
                    khThuong.nhapThongTin(sc);
                    khThuong.hienThiThongTin();
                }
                case 6 -> {
                    khVIP = new KhachHangVIP();
                    khVIP.nhapThongTin(sc);
                    khVIP.hienThiThongTin();
                }
                case 0 -> System.out.println("Tam biet!");
                default -> System.out.println("Lua chon khong hop le!");
            }
        } while (chon != 0);
    }
}
