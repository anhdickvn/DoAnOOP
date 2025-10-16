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
