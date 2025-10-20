import java.util.Scanner;

class TacGia {
	private String idTacGia;
	private String tenTacGia;
	private String ngaySinh;

	public String getIdTacGia() {
		return this.idTacGia;
	}

	public void setIdTacGia(String idTacGia) {
		this.idTacGia = idTacGia;
	}

	public String getTenTacGia() {
		return this.tenTacGia;
	}

	public void setTenTacGia(String tenTacGia) {
		this.tenTacGia = tenTacGia;
	}

	public String getNgaySinh() {
		return this.ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public TacGia() {
	}

	public TacGia(String idTacGia, String tenTacGia, String ngaySinh) {
		this.idTacGia = idTacGia;
		this.tenTacGia = tenTacGia;
		this.ngaySinh = ngaySinh;
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ID tac gia: ");
		idTacGia = sc.nextLine();
		System.out.print("Ten tac gia: ");
		tenTacGia = sc.nextLine();
		System.out.println("Ngay sinh: ");
		ngaySinh = sc.nextLine();
	}

	public void xuat() {
		System.out.printf("%-15s %-25s %-15s %-20s\n", "ID Tác Giả", "Tên Tác Giả", "Ngày Sinh");
		System.out.println("--------------------------------------------------------------------------");
		System.out.printf("%-15s %-25s %-15s %-20s\n", idTacGia, tenTacGia, ngaySinh);
	}
}

class TheLoai {
	private String idTheLoai;
	private String tenTheLoai;

	public String getIdTheLoai() {
		return this.idTheLoai;
	}

	public void setIdTheLoai(String idTheLoai) {
		this.idTheLoai = idTheLoai;
	}

	public String getTenTheLoai() {
		return this.tenTheLoai;
	}

	public void setTenTheLoai(String tenTheLoai) {
		this.tenTheLoai = tenTheLoai;
	}

	public TheLoai() {
	}

	public TheLoai(String idTheLoai, String tenTheLoai) {
		this.idTheLoai = idTheLoai;
		this.tenTheLoai = tenTheLoai;
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ID thể loại: ");
		idTheLoai = sc.nextLine();
		System.out.print("Tên thể loại: ");
		tenTheLoai = sc.nextLine();
	}

	public void xuat() {
		System.out.printf("%-15s %-25s\n", "ID Thể Loại", "Tên Thể Loại");
		System.out.println("----------------------------------------------");
		System.out.printf("%-15s %-25s\n", idTheLoai, tenTheLoai);
	}
}

class NhaXuatBan {
	private String idNhaXuatBan;
	private String tenNhaXuatBan;
	private String diaChi;
	private String soDienThoai;

	public String getIdNhaXuatBan() {
		return this.idNhaXuatBan;
	}

	public void setIdNhaXuatBan(String idNhaXuatBan) {
		this.idNhaXuatBan = idNhaXuatBan;
	}

	public String getTenNhaXuatBan() {
		return this.tenNhaXuatBan;
	}

	public void setTenNhaXuatBan(String tenNhaXuatBan) {
		this.tenNhaXuatBan = tenNhaXuatBan;
	}

	public String getDiaChi() {
		return this.diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getSoDienThoai() {
		return this.soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public NhaXuatBan() {
	}

	public NhaXuatBan(String idNhaXuatBan, String tenNhaXuatBan, String diaChi, String soDienThoai) {
		this.idNhaXuatBan = idNhaXuatBan;
		this.tenNhaXuatBan = tenNhaXuatBan;
		this.diaChi = diaChi;
		this.soDienThoai = soDienThoai;
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ID nhà xuất bản: ");
		idNhaXuatBan = sc.nextLine();
		System.out.print("Tên nhà xuất bản: ");
		tenNhaXuatBan = sc.nextLine();
		System.out.print("Địa chỉ: ");
		diaChi = sc.nextLine();
		System.out.print("Số điện thoại: ");
		soDienThoai = sc.nextLine();
	}

	public void xuat() {
		System.out.printf("%-15s %-25s %-30s %-15s\n", "ID NXB", "Tên Nhà Xuất Bản", "Địa Chỉ", "SĐT");
		System.out.println(
				"---------------------------------------------------------------------------------------------");
		System.out.printf("%-15s %-25s %-30s %-15s\n", idNhaXuatBan, tenNhaXuatBan, diaChi, soDienThoai);
	}
}

class Sach {
	private String idSach;
	private String idTacGia;
	private String idTheLoai;
	private String idNhaXuatBan;
	private TacGia[] tacGia;
	private TheLoai[] theLoai;
	private double gia;
	private String tenSach;
	private int namXuatBan;
	private int soLuong;
	private static double thueVAT = 0.1;

	public TacGia[] getTacGia() {
		return tacGia;
	}

	public void setTacGia(TacGia[] tacGia) {
		this.tacGia = tacGia;
	}

	public TheLoai[] getTheLoai() {
		return theLoai;
	}

	public void setTheLoai(TheLoai[] theLoai) {
		this.theLoai = theLoai;
	}

	public String getIdSach() {
		return idSach;
	}

	public void setIdSach(String idSach) {
		this.idSach = idSach;
	}

	public String getTenSach() {
		return tenSach;
	}

	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}

	public double getGia() {
		return gia;
	}

	public void setGia(double gia) {
		this.gia = gia;
	}

	public int getNamXuatBan() {
		return namXuatBan;
	}

	public void setNamXuatBan(int namXuatBan) {
		this.namXuatBan = namXuatBan;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public static double getThueVAT() {
		return thueVAT;
	}

	public static void setThueVAT(double thueVAT) {
		Sach.thueVAT = thueVAT;
	}

	public Sach() {
	}

	public Sach(String idSach, String tenSach, String idTacGia, String idTheLoai, String idNhaXuatBan, double gia,
			int namXuatBan, int soLuong) {
		this.idSach = idSach;
		this.tenSach = tenSach;
		this.idTacGia = idTacGia;
		this.idTheLoai = idTheLoai;
		this.idNhaXuatBan = idNhaXuatBan;
		this.gia = gia;
		this.namXuatBan = namXuatBan;
		this.soLuong = soLuong;
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập ID sách: ");
		idSach = sc.nextLine();

		System.out.print("Nhập tên sách: ");
		tenSach = sc.nextLine();

		System.out.print("Nhập ID tác giả: ");
		idTacGia = sc.nextLine();

		System.out.print("Nhập ID thể loại: ");
		idTheLoai = sc.nextLine();

		System.out.print("Nhập ID nhà xuất bản: ");
		idNhaXuatBan = sc.nextLine();

		System.out.print("Nhập năm xuất bản: ");
		namXuatBan = sc.nextInt();

		System.out.print("Nhập giá sách: ");
		gia = sc.nextDouble();

		System.out.println("Nhập số lượng: ");
		soLuong = sc.nextInt();
	}

	public void xuat() {
		System.out.printf("%-10s %-25s %-15s %-15s %-15s %-10d %-10d %-15.2f %-15.2f\n", idSach, tenSach, idTacGia,
				idTheLoai, idNhaXuatBan, namXuatBan, soLuong, gia, tinhTienSauThue());
	}

	public double tinhTienSauThue() {
		return gia + gia * thueVAT;
	}

	public void NhapDSTacGia() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong tac gia: ");
		int soLuongTacGia = sc.nextInt();
		sc.nextLine();
		tacGia = new TacGia[soLuongTacGia];

		for (int i = 0; i < soLuongTacGia; i++) {
			System.out.println("Tac gia thu " + (i + 1) + ": ");
			tacGia[i] = new TacGia();
			tacGia[i].nhap();
		}
	}

	public void xuatDSTacGia() {
		System.out.printf("%-15s %-25s %-15s\n", "ID Tác Giả", "Tên Tác Giả", "Ngày Sinh");
		System.out.println("---------------------------------------------------------------");
		for (int i = 0; i < tacGia.length; i++) {
			tacGia[i].xuat();
		}
	}

	public void NhapDSTheLoai() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong the loai: ");
		int soLuongTheLoai = sc.nextInt();
		sc.nextLine();
		theLoai = new TheLoai[soLuongTheLoai];
		for (int i = 0; i < soLuongTheLoai; i++) {
			theLoai[i] = new TheLoai();
			theLoai[i].nhap();
		}
	}

	public void XuatDSTheLoai() {
		System.out.printf("%-15s %-25s\n", "ID Thể Loại", "Tên Thể Loại");
		System.out.println("----------------------------------------------");
		for (int i = 0; i < theLoai.length; i++) {
			theLoai[i].xuat();
		}
	}
}

class KhoSach {
	private Sach[] ds;
	private int soLuongSachKho;

	public KhoSach() {
	}

	public KhoSach(Sach[] ds, int soLuongSachKho) {
		this.ds = ds;
		this.soLuongSachKho = soLuongSachKho;
	}

	public Sach[] getDs() {
		return ds;
	}

	public void setDs(Sach[] ds) {
		this.ds = ds;
	}

	public int getSoLuongSachKho() {
		return soLuongSachKho;
	}

	public void setSoLuongSachKho(int soLuongSachKho) {
		this.soLuongSachKho = soLuongSachKho;
	}

	public void nhapDS() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so luong sach trong kho: ");
		int soLuongSach = sc.nextInt();
		ds = new Sach[soLuongSach];
		sc.nextLine();
		for (int i = 0; i < soLuongSach; i++) {
			System.out.println("Sach thu " + (i + 1) + ": ");
			ds[i] = new Sach();
			ds[i].nhap();
		}
	}

	public void xuatDS() {
		System.out.println("\n==================== DANH SÁCH SÁCH TRONG KHO ====================");
		System.out.printf("%-10s %-25s %-15s %-15s %-15s %-10s %-10s %-15s %-15s\n", "ID Sách", "Tên Sách",
				"ID Tác Giả", "ID Thể Loại", "ID NXB", "Năm XB", "Số Lượng", "Giá Gốc", "Giá Sau Thuế");
		System.out.println(
				"---------------------------------------------------------------------------------------------------------------");
		for (int i = 0; i < ds.length; i++) {
			ds[i].xuat();
		}
	}
}

class HoaDon {

	private String idHoaDon;
	private String idKhachHang;
	private String idCTKM;
	private String ngayInPhieu;
	private int soLuong;
	private double tongTien;
	private Sach[] dsSach;
	private int[] dsSoLuong;

	public HoaDon() {
	}

	public HoaDon(String idHoaDon, String idKhachHang, String idCTKM, String ngayInPhieu, int soLuong, double tongTien,
			Sach[] dsSach, int[] dsSoLuong) {
		this.idHoaDon = idHoaDon;
		this.idKhachHang = idKhachHang;
		this.idCTKM = idCTKM;
		this.ngayInPhieu = ngayInPhieu;
		this.soLuong = soLuong;
		this.tongTien = tongTien;
		this.dsSach = dsSach;
		this.dsSoLuong = dsSoLuong;
	}

	public String getIdHoaDon() {
		return idHoaDon;
	}

	public void setIdHoaDon(String idHoaDon) {
		this.idHoaDon = idHoaDon;
	}

	public String getIdKhachHang() {
		return idKhachHang;
	}

	public void setIdKhachHang(String idKhachHang) {
		this.idKhachHang = idKhachHang;
	}

	public String getIdCTKM() {
		return idCTKM;
	}

	public void setIdCTKM(String idCTKM) {
		this.idCTKM = idCTKM;
	}

	public String getNgayInPhieu() {
		return ngayInPhieu;
	}

	public void setNgayInPhieu(String ngayInPhieu) {
		this.ngayInPhieu = ngayInPhieu;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public double getTongTien() {
		return tongTien;
	}

	public void setTongTien(double tongTien) {
		this.tongTien = tongTien;
	}

	public Sach[] getDsSach() {
		return dsSach;
	}

	public void setDsSach(Sach[] dsSach) {
		this.dsSach = dsSach;
	}

	public int[] getDsSoLuong() {
		return dsSoLuong;
	}

	public void setDsSoLuong(int[] dsSoLuong) {
		this.dsSoLuong = dsSoLuong;
	}

	public void nhapHoaDon(KhoSach kho) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập mã hóa đơn: ");
		idHoaDon = sc.nextLine();

		System.out.print("Nhập mã khách hàng: ");
		idKhachHang = sc.nextLine();

		System.out.print("Nhập mã chương trình khuyến mãi (nếu có): ");
		idCTKM = sc.nextLine();

		System.out.print("Khách mua bao nhiêu loại sách? ");
		int n = Integer.parseInt(sc.nextLine());

		dsSach = new Sach[n];
		dsSoLuong = new int[n];
		tongTien = 0;
		soLuong = 0;
		Sach[] dsKho = kho.getDs();
		for (int i = 0; i < n; i++) {
			System.out.println("Nhập sách thứ " + (i + 1));
			System.out.print("Nhập ID sách: ");
			String idSach = sc.nextLine();

			Sach sachChon = null;

			for (int j = 0; j < kho.getSoLuongSachKho(); j++) {
				if (dsKho[j].getIdSach().equalsIgnoreCase(idSach)) {
					sachChon = dsKho[j];
					break;
				}
			}

			if (sachChon == null) {
				System.out.println("Không tìm thấy sách có mã " + idSach);
				i--;
				continue;
			}

			System.out.print("Nhập số lượng muốn mua: ");
			int soLuongMua = sc.nextInt();
			sc.nextLine();

			if (soLuongMua > sachChon.getSoLuong()) {
				System.out.println("Sách chỉ còn " + sachChon.getSoLuong() + " cuốn trong kho!");
				i--;
				continue;
			}

			dsSach[i] = sachChon;
			dsSoLuong[i] = soLuongMua;

			sachChon.setSoLuong(sachChon.getSoLuong() - soLuongMua);

			soLuong += soLuongMua;
			tongTien += sachChon.getGia() * soLuongMua;

			System.out.println("Đã thêm " + soLuongMua + " quyển \"" + sachChon.getTenSach() + "\"");
			ngayInPhieu = java.time.LocalDate.now().toString();
		}
	}

	public void xuatHoaDon() {
		System.out.println("\n=== THÔNG TIN HÓA ĐƠN ===");
		System.out.println("Mã hóa đơn: " + idHoaDon);
		System.out.println("Mã khách hàng: " + idKhachHang);
		System.out.println("Mã CTKM: " + idCTKM);
		System.out.println("Ngày in phiếu: " + ngayInPhieu);
		System.out.println("Tổng số lượng: " + soLuong);
		System.out.println("Tổng tiền: " + tongTien);
	}
}

public class OOP {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		KhoSach kho = new KhoSach();
		HoaDon hoaDon = new HoaDon();

		System.out.println("\n=== NHẬP KHO SÁCH ===");
		kho.nhapDS();

		System.out.println("\n=== DANH SÁCH SÁCH TRONG KHO ===");
		kho.xuatDS();

		System.out.println("\n=== NHẬP HÓA ĐƠN MỚI ===");
		hoaDon.nhapHoaDon(kho);

		System.out.println("\n=== THÔNG TIN HÓA ĐƠN ===");
		hoaDon.xuatHoaDon();
		sc.close();
	}
}
