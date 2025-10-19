import java.util.*;

abstract class ConNguoi {
    private String hoTen;
    private String maDinhDanh;
    private String ngaySinh;
    private String diaChi;
    private String soDienThoai;

    public ConNguoi() {}

    public ConNguoi(String hoTen, String maDinhDanh, String ngaySinh, String diaChi, String soDienThoai) {
        this.hoTen = hoTen;
        this.maDinhDanh = maDinhDanh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
    }

    public String getHoTen() { return hoTen; }
    public void setHoTen(String hoTen) { this.hoTen = hoTen; }

    public String getMaDinhDanh() { return maDinhDanh; }
    public void setMaDinhDanh(String maDinhDanh) { this.maDinhDanh = maDinhDanh; }

    public String getNgaySinh() { return ngaySinh; }
    public void setNgaySinh(String ngaySinh) { this.ngaySinh = ngaySinh; }

    public String getDiaChi() { return diaChi; }
    public void setDiaChi(String diaChi) { this.diaChi = diaChi; }

    public String getSoDienThoai() { return soDienThoai; }
    public void setSoDienThoai(String soDienThoai) { this.soDienThoai = soDienThoai; }

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
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

    public QuanLy() {}

    public QuanLy(String hoTen, String maDinhDanh, String ngaySinh, String diaChi, String soDienThoai,
                  String idQuanLy, double luong, String khuLamViec) {
        super(hoTen, maDinhDanh, ngaySinh, diaChi, soDienThoai);
        this.idQuanLy = idQuanLy;
        this.luong = luong;
        this.khuLamViec = khuLamViec;
    }

    public String getIdQuanLy() { return idQuanLy; }
    public void setIdQuanLy(String idQuanLy) { this.idQuanLy = idQuanLy; }

    public double getLuong() { return luong; }
    public void setLuong(double luong) { this.luong = luong; }

    public String getKhuLamViec() { return khuLamViec; }
    public void setKhuLamViec(String khuLamViec) { this.khuLamViec = khuLamViec; }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ID quan ly: ");
        idQuanLy = sc.nextLine();
        System.out.print("Nhap luong: ");
        luong = sc.nextDouble();
        sc.nextLine();
        System.out.print("Nhap khu lam viec: ");
        khuLamViec = sc.nextLine();
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("=== Thong tin Quan Ly ===");
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
    private double doanhThu;
    private int soLuongHoaDon;

    public NhanVien() {}

    public NhanVien(String hoTen, String maDinhDanh, String ngaySinh, String diaChi, String soDienThoai,
                    String idNhanVien, double luong, String chucVu, String ca, double doanhThu , int soLuongHoaDon) {
        super(hoTen, maDinhDanh, ngaySinh, diaChi, soDienThoai);
        this.idNhanVien = idNhanVien;
        this.luong = luong;
        this.chucVu = chucVu;
        this.ca = ca;
        this.doanhThu = doanhThu;
        this.soLuongHoaDon = soLuongHoaDon;
    }

    public double getDoanhThu() { return doanhThu; }
    public void setDoanhThu(double doanhThu) { this.doanhThu = doanhThu; }
    public int getSoLuongHoaDon() { return soLuongHoaDon; }
    public void setSoLuongHoaDon(int soLuongHoaDon) { this.soLuongHoaDon = soLuongHoaDon; }

    public String getIdNhanVien() { return idNhanVien; }
    public void setIdNhanVien(String idNhanVien) { this.idNhanVien = idNhanVien; }

    public double getLuong() { return luong; }
    public void setLuong(double luong) { this.luong = luong; }

    public String getChucVu() { return chucVu; }
    public void setChucVu(String chucVu) { this.chucVu = chucVu; }

    public String getCa() { return ca; }
    public void setCa(String ca) { this.ca = ca; }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ID Nhan Vien: ");
        idNhanVien = sc.nextLine();
        System.out.print("Nhap luong: ");
        luong = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap chuc vu: ");
        chucVu = sc.nextLine();
        System.out.print("Nhap ca lam viec: ");
        ca = sc.nextLine();
        System.out.print("Nhap doanh thu: "); 
        doanhThu = sc.nextDouble();
          System.out.print("Nhap so luong hoa don: ");
        soLuongHoaDon = sc.nextInt();
        sc.nextLine();// bo qua ki tu newline
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("=== Thong tin Nhan Vien ===");
        super.hienThiThongTin();
        System.out.println("ID Nhan Vien: " + idNhanVien);
        System.out.println("Luong: " + luong);
        System.out.println("Chuc vu: " + chucVu);
        System.out.println("Ca lam viec: " + ca);
        System.out.println("Doanh Thu: " + doanhThu); 
        System.out.println("So luong hoa don: "+ soLuongHoaDon);
    }
}


class ThongKeNhanVien {
    private NhanVien[] dsNhanVien;

    public ThongKeNhanVien() {}

    public ThongKeNhanVien(NhanVien[] dsNhanVien, int soLuongHoaDon) {
        this.dsNhanVien = dsNhanVien;
    }

    public NhanVien[] getDsNhanVien() { return dsNhanVien; }
    public void setDsNhanVien(NhanVien[] dsNhanVien) { this.dsNhanVien = dsNhanVien; }

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong nhan vien: ");
        int n = sc.nextInt(); sc.nextLine();
        dsNhanVien = new NhanVien[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nNhap thong tin nhan vien " + (i + 1) + ":");
            dsNhanVien[i] = new NhanVien();
            dsNhanVien[i].nhapThongTin();
        }
    }


    public void hienThiThongKe() {
        System.out.println("\nThong ke nhan vien:");
        System.out.println("\nDanh sach nhan vien:");
        for (NhanVien nv : dsNhanVien) nv.hienThiThongTin();
    }
}

class ThuongNhanVien {
    private double soTienThuong;

    public ThuongNhanVien() {}

    public double getSoTienThuong() { return soTienThuong; }
    public void setSoTienThuong(double soTienThuong) { this.soTienThuong = soTienThuong; }

    public void tinhThuong(ThongKeNhanVien tk) {
        if (tk == null || tk.getDsNhanVien() == null || tk.getDsNhanVien().length == 0) {
            System.out.println("Chưa có dữ liệu nhân viên!");
            return;
        }

        Scanner sc = new Scanner(System.in);
        
        System.out.println("\n=== DANH SACH NHAN VIEN DUOC THUONG ===");
        boolean coNhanVienThuong = false;

        for (NhanVien nv : tk.getDsNhanVien()) {
            double doanhThuNV = nv.getDoanhThu(); 

            if (doanhThuNV > 1000000) { 
                soTienThuong = doanhThuNV * 0.1; 
                coNhanVienThuong = true;

                nv.hienThiThongTin();
                System.out.println("Doanh thu: " + doanhThuNV);
                System.out.println(">> So Tien Thuong: " + soTienThuong);
                System.out.println("--------------------------------");
            }
        }

        if (!coNhanVienThuong) {
            System.out.println("Nhan vien Phe");
        }
    }

    public void hienThi() {
        System.out.println("Thông tin thưởng gần nhất:");
        System.out.println("So Tien Thuong: " + soTienThuong);
    }
}

public class AnhHigh {
    public static void main(String[] args) {
        // Nhập thông tin thống kê nhân viên
        ThongKeNhanVien thongKe = new ThongKeNhanVien();
        thongKe.nhapThongTin();  // Người dùng nhập danh sách nhân viên và tổng doanh thu

        // Tính thưởng nhân viên
        ThuongNhanVien thuong = new ThuongNhanVien();
        thuong.tinhThuong(thongKe);

    }
}

    
