abstract class CongTyABC {
	private String DiaChi;
	private HoaDon dsHoaDon[];
	private String TenCty;

	public CongTyABC() {
	}

	public CongTyABC(String DiaChi, String dsHoaDon, String TenCty) {
		this.DiaChi = DiaChi;
		this.dsHoaDon = dsHoaDon;
		this.TenCty = TenCty;
	}

	public HoaDon getDsHoaDon() {
		return dsHoaDon;
	}

	public void setDsHoaDon(HoaDon dsHoaDon) {
		this.dsHoaDon = dsHoaDon;
	}

public void NhapDS() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhập địa chỉ khách hàng: ");
	DiaChi = sc.nextLine();
	System.out.println("Hãy nhập số lượng hóa đơn: ");
	int soLuong = sc.nextInt();
	sc.nextLine();
	HoaDon = new HoaDon[n];
	for (int i = 0; i < soLuong; i++) {
		System.out.println("Hãy nhập hóa đơn thứ : " + (i+1) + " : ");
		HoaDon[i] = new CongTyABC();
		HoaDon[i].nhap;
	}
	System.out.println("Nhập tên công ty: ");
	TenCty = sc.nextInt()
}

	public void XuatDS() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Địa chỉ khách hàng: " + DiaChi);
		System.out.println("Danh sách hóa đơn");
		for (int i = 0; i < dsHoaDon.length; i++) {
			System.out.println("Hóa đơn thứ " + (i + 1) + ":");
			dsHoaDon[i].xuat();
		}
		System.out.println("Tên công ty: " + TenCty);
	}
}

public class Main {
	public static void main(String[] args) {
		CongTyABC ABC = new CongTyABC();
		ABC.NhapDS();
		ABC.XuatDS();
	}
}
