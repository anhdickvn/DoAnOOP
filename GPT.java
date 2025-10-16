package OOP;
import java.util.Scanner;

public class HoaDon {
    private String idHoaDon;
    private String idKhachHang;
    private String idCTKM;
    private String ngayInPhieu;
    private int soLuong;           // tổng số lượng sách trong hóa đơn
    private double tongTien;       // tổng tiền thanh toán
    private Sach[] dsSach;         // danh sách sách trong hóa đơn
    private int[] dsSoLuong;       // số lượng tương ứng từng sách

    Scanner sc = new Scanner(System.in);

    // ===================== HÀM NHẬP =====================
    public void nhapHoaDon() {
        System.out.print("Nhập mã hóa đơn: ");
        idHoaDon = sc.nextLine();

        System.out.print("Nhập mã khách hàng: ");
        idKhachHang = sc.nextLine();

        System.out.print("Nhập mã chương trình khuyến mãi (nếu có): ");
        idCTKM = sc.nextLine();

        System.out.print("Nhập ngày in phiếu: ");
        ngayInPhieu = sc.nextLine();

        System.out.print("Nhập số lượng loại sách trong hóa đơn: ");
        int n = Integer.parseInt(sc.nextLine());

        dsSach = new Sach[n];
        dsSoLuong = new int[n];

        tongTien = 0;
        soLuong = 0;

        // ===== Nhập danh sách sách và số lượng =====
        for (int i = 0; i < n; i++) {
            System.out.println("\n== Nhập thông tin sách thứ " + (i + 1) + " ==");
            dsSach[i] = new Sach();
            dsSach[i].nhap();

            System.out.print("Nhập số lượng sách này: ");
            dsSoLuong[i] = Integer.parseInt(sc.nextLine());

            // Cộng dồn tổng
            soLuong += dsSoLuong[i];
            tongTien += dsSach[i].thueVAT() * dsSoLuong[i];  // nếu có VAT
        }
    }

    // ===================== HÀM XUẤT =====================
    public void xuatHoaDon() {
        System.out.println("\n========== HÓA ĐƠN ==========");
        System.out.println("Mã hóa đơn: " + idHoaDon);
        System.out.println("Mã khách hàng: " + idKhachHang);
        System.out.println("Mã CTKM: " + idCTKM);
        System.out.println("Ngày in phiếu: " + ngayInPhieu);
        System.out.println("Tổng số lượng sách: " + soLuong);

        System.out.println("\n--- Danh sách sách trong hóa đơn ---");
        for (int i = 0; i < dsSach.length; i++) {
            System.out.println("\n>> Sách thứ " + (i + 1) + ":");
            dsSach[i].xuat();
            System.out.println("Số lượng mua: " + dsSoLuong[i]);
        }

        System.out.println("\nTổng tiền hóa đơn: " + tongTien);
        System.out.println("====================================");
    }
}
