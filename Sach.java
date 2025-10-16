class Sach {

	private String idSach;
	private String idTacGia;
	private String idTheLoai;
	private String idNhaXuatBan;
	private TacGia[] tacGia;
	private TheLoai[] theLoai;
	private NhapHoaDon[] dsNhap;
	private double gia;
	private String tenSach;
	private int namXuatBan;
	private static double thueVAT = 0.1;

	public Sach() {
	}

	public Sach(String idSach, String tenSach, String idTacGia, String idTheLoai, String idNhaXuatBan, double gia,
			int namXuatBan) {
		this.idSach = idSach;
		this.tenSach = tenSach;
		this.idTacGia = idTacGia;
		this.idTheLoai = idTheLoai;
		this.idNhaXuatBan = idNhaXuatBan;
		this.gia = gia;
		this.namXuatBan = namXuatBan;
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

	public static double getThueVAT() {
		return thueVAT;
	}

	public static void setThueVAT(double thueVAT) {
		Sach.thueVAT = thueVAT;
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhập mã sách: ");
		idSach = sc.nextLine();

		System.out.print("Nhập tên sách: ");
		tenSach = sc.nextLine();

		System.out.print("Nhập mã tác giả: ");
		idTacGia = sc.nextLine();

		System.out.print("Nhập mã thể loại: ");
		idTheLoai = sc.nextLine();

		System.out.print("Nhập mã nhà xuất bản: ");
		idNhaXuatBan = sc.nextLine();

		System.out.print("Nhập năm xuất bản: ");
		namXuatBan = sc.nextInt();

		System.out.print("Nhập giá sách: ");
		gia = sc.nextDouble();
	}
	
	public void nhapTacGia() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        sc.nextLine();
        
	}
	public void xuat() {
		System.out.println("===== THÔNG TIN SÁCH =====");
		System.out.println("Mã sách: " + idSach);
		System.out.println("Tên sách: " + tenSach);
		System.out.println("Mã tác giả: " + idTacGia);
		System.out.println("Mã thể loại: " + idTheLoai);
		System.out.println("Mã nhà xuất bản: " + idNhaXuatBan);
		System.out.println("Năm xuất bản: " + namXuatBan);
		System.out.println("Giá gốc: " + gia);
		System.out.println("Giá sau thuế: " + tinhTienSauThue());
	}

	public double tinhTienSauThue() {
		return gia + gia * thueVAT;
	}
}
