import java.util.*;

public interface Bai5_4 {
    double troGia();
}

abstract class HoaDon {
    protected String maKH, tenKH;
    protected int soLuong;
    protected double giaBan;

    public HoaDon() {}

    public HoaDon(String maKH, String tenKH, int soLuong, double giaBan) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.soLuong = soLuong;
        this.giaBan = giaBan;
    }

    public double getTongTien() {
        return soLuong * giaBan;
    }

    public abstract double chietKhau();

    public double thueVAT() {
        return 0.1 * getTongTien();
    }

    public double thanhTien() {
        return getTongTien() - chietKhau() + thueVAT();
    }

    public void xuat() {
        System.out.printf("%-10s %-15s %5d %12.2f %15.2f\n",
                maKH, tenKH, soLuong, giaBan, thanhTien());
    }
}
class HDCaNhan extends HoaDon {
    private double khoangCach;

    public HDCaNhan(String maKH, String tenKH, int soLuong, double giaBan, double khoangCach) {
        super(maKH, tenKH, soLuong, giaBan);
        this.khoangCach = khoangCach;
    }

    @Override
    public double chietKhau() {
        if (khoangCach < 2) return 0.05 * getTongTien();
        else if (khoangCach <= 10) return 0.03 * getTongTien();
        else return 0;
    }
}

class HDDaiLy extends HoaDon {
    private int soNamHopTac;
    private int capDaiLy;

    public HDDaiLy(String maKH, String tenKH, int soLuong, double giaBan, int soNamHopTac, int capDaiLy) {
        super(maKH, tenKH, soLuong, giaBan);
        this.soNamHopTac = soNamHopTac;
        this.capDaiLy = capDaiLy;
    }

    @Override
    public double chietKhau() {
        if (capDaiLy != 1) return 0;
        double ck = 0.3 * giaBan * soLuong;
        if (soNamHopTac > 3) {
            ck += 0.01 * giaBan * soLuong * (soNamHopTac - 3);
            if (ck > 0.35 * giaBan * soLuong) ck = 0.35 * giaBan * soLuong;
        }
        return ck;
    }
}

class HDCongTy extends HoaDon implements Bai5_4 {
    private int soNV;

    public HDCongTy(String maKH, String tenKH, int soLuong, double giaBan, int soNV) {
        super(maKH, tenKH, soLuong, giaBan);
        this.soNV = soNV;
    }

    @Override
    public double chietKhau() {
        if (soNV > 500) return 0.05 * giaBan * soLuong;
        else if (soNV > 100) return 0.03 * giaBan * soLuong;
        else return 0;
    }

    @Override
    public double troGia() {
        return 120000 * soLuong;
    }

    @Override
    public double thanhTien() {
        return super.thanhTien() - troGia();
    }
}

class CongtyABC {
    private String diaChi;
    private ArrayList<HoaDon> dsHoaDon = new ArrayList<>();

    public void nhapDS() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng hóa đơn: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("\n=== Nhập hóa đơn thứ " + (i + 1) + " ===");
            System.out.println("Chọn loại hóa đơn (1.Cá nhân | 2.Đại lý | 3.Công ty): ");
            int chon = sc.nextInt(); sc.nextLine();

            System.out.print("Mã KH: ");
            String ma = sc.nextLine();
            System.out.print("Tên KH: ");
            String ten = sc.nextLine();
            System.out.print("Số lượng: ");
            int sl = sc.nextInt();
            System.out.print("Giá bán: ");
            double gb = sc.nextDouble();

            switch (chon) {
                case 1:
                    System.out.print("Khoảng cách (km): ");
                    double kc = sc.nextDouble();
                    dsHoaDon.add(new HDCaNhan(ma, ten, sl, gb, kc));
                    break;
                case 2:
                    System.out.print("Số năm hợp tác: ");
                    int nam = sc.nextInt();
                    System.out.print("Cấp đại lý (1: cao cấp, khác: thường): ");
                    int cap = sc.nextInt();
                    dsHoaDon.add(new HDDaiLy(ma, ten, sl, gb, nam, cap));
                    break;
                case 3:
                    System.out.print("Số lượng nhân viên: ");
                    int nv = sc.nextInt();
                    dsHoaDon.add(new HDCongTy(ma, ten, sl, gb, nv));
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }

    public void xuatDS() {
        System.out.println("\n===== DANH SÁCH HÓA ĐƠN =====");
        System.out.printf("%-10s %-15s %5s %12s %15s\n",
                "Mã KH", "Tên KH", "SL", "Giá bán", "Thành tiền");
        for (HoaDon h : dsHoaDon) {
            h.xuat();
        }
    }

    public void tongThanhTien() {
        double tong = 0;
        for (HoaDon h : dsHoaDon) tong += h.thanhTien();
        System.out.printf("\nTổng thành tiền của các hóa đơn: %.2f\n", tong);
    }
}

public class Bai5_4 {
    public static void main(String[] args) {
        CongtyABC cty = new CongtyABC();
        cty.nhapDS();
        cty.xuatDS();
        cty.tongThanhTien();
    }
}
