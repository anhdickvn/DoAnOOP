package DoAn;
import java.util.*;

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

    public int getSoLuong(){
        return soLuong;
    }
    public void setSoLuong(int soLuong){
        this.soLuong = soLuong;
    }

	public static double getThueVAT() {
		return thueVAT;
	}

	public static void setThueVAT(double thueVAT) {
		Sach.thueVAT = thueVAT;
	}
	
    public Sach(){
	}

	public Sach(String idSach, String tenSach, String idTacGia, String idTheLoai, String idNhaXuatBan, double gia,int namXuatBan,int soLuong) {
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

        System.out.println("Số lượng: ");
        soLuong = sc.nextInt();
	}
	public void xuat() {
    System.out.printf("%-10s %-25s %-15s %-15s %-15s %-10d %-10d %-15.2f %-15.2f\n",idSach, tenSach, idTacGia, idTheLoai, idNhaXuatBan,namXuatBan, soLuong, gia, tinhTienSauThue());
    }


	public double tinhTienSauThue() {
		return gia + gia * thueVAT;
	}
    public void NhapDSTacGia(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong tac gia: ");
        int soLuongTacGia = sc.nextInt();
        sc.nextLine();
        tacGia = new TacGia[soLuongTacGia];

        for(int i = 0; i < soLuongTacGia;i++){
            System.out.println("Tac gia thu "+(i+1)+": ");
            tacGia[i] = new TacGia();
            tacGia[i].nhap();
        }
    }    
    public void xuatDSTacGia(){
        System.out.printf("%-15s %-25s %-15s\n", "ID Tác Giả", "Tên Tác Giả", "Ngày Sinh");
        System.out.println("---------------------------------------------------------------");
        for(int i = 0; i < tacGia.length; i++){
            tacGia[i].xuat();
        }
    }

    public void NhapDSTheLoai(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong the loai: ");
        int soLuongTheLoai = sc.nextInt();
        sc.nextLine();
        theLoai = new TheLoai[soLuongTheLoai];
        for(int i = 0; i < soLuongTheLoai; i++){
            System.out.println("The loai thu "+(i+1)+": ");
            theLoai[i] = new TheLoai();
            theLoai[i].nhap();
        }
    }
    public void XuatDSTheLoai(){
        System.out.printf("%-15s %-25s\n", "ID Thể Loại", "Tên Thể Loại");
        System.out.println("----------------------------------------------");
        for(int i = 0; i < theLoai.length; i++){    
            theLoai[i].xuat();
        }
    }
}   

class KhoSach{
    private Sach[] ds;
    private int soLuongSachKho;

    public int getSoLuongSachKho() {
        return soLuongSachKho;
    }

    public void setSoLuongSachKho(int soLuongSachKho) {
        this.soLuongSachKho = soLuongSachKho;
    }
    public Sach[] getDs() {
        return ds;
    }
    public void setDs(Sach[] ds) {
        this.ds = ds;
    }
    
    public KhoSach(){}
    public KhoSach(Sach[] ds,int soLuongSachKho){
        this.ds = ds;
        this.soLuongSachKho = soLuongSachKho;
    }

    public void nhapDS(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong sach trong kho: ");
        soLuongSachKho = sc.nextInt();
        ds = new Sach[soLuongSachKho];
        sc.nextLine();
        for(int i = 0; i < soLuongSachKho;i++){
            System.out.println("Sach thu "+(i+1)+": ");
            ds[i] = new Sach();
            ds[i].nhap();
        }
    }
    public void xuatDS(){
        System.out.println("\n==================== DANH SÁCH SÁCH TRONG KHO ====================");
        System.out.printf("%-10s %-25s %-15s %-15s %-15s %-10s %-10s %-15s %-15s\n","ID Sách", "Tên Sách", "ID Tác Giả", "ID Thể Loại","ID NXB", "Năm XB", "Số Lượng", "Giá Gốc", "Giá Sau Thuế");
        System.out.println("---------------------------------------------------------------------------------------------------------------");
        for(int i = 0; i < soLuongSachKho;i++){
            ds[i].xuat();
        }
    }
    public void ThemSach(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so sach muon them: ");
        int sosachThem = sc.nextInt();
        Sach[] dsMoi = Arrays.copyOf(ds, ds.length + sosachThem);

        for(int i = ds.length; i < dsMoi.length;i++){
            System.out.println("Sach moi thu: "+(i+1));
            dsMoi[i] = new Sach();
            dsMoi[i].nhap();
        }
    }
    public void SuaSach(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ID sach can sua: ");
        String idSach = sc.nextLine();
        for(int i = 0; i < soLuongSachKho;i++){
            if(ds[i].getIdSach().equals(idSach)){
                System.out.println("Thong tin hien tai: ");
                ds[i].xuat();
                System.out.println("Thong tin moi: ");
                ds[i].nhap();
                return;
            }
        }
        System.out.println("Khong tim thay ID sach");
    }
    public void xoaSach(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma sach can xoa: ");
        String ID = sc.nextLine();
        
        for(int i = 0; i < soLuongSachKho;i++){
                if(ds[i].getIdSach().equals(ID)){
                    for(int j = i;j < soLuongSachKho-1;j++){
                        ds[j] = ds[j+1];
                    }
                    soLuongSachKho--;
            System.out.println("Da xoa sach co ID: "+ID);
            xuatDS();
            return;
            }
        }   
        System.out.println("Khong tim thay sach co ID: "+ID);
        xuatDS();
    }    

    public void timKiemSach(){
    }
    
}    
public class abc1 {
    public static void main(String[] args) {
       // KhoSach a = new KhoSach();
        //a.nhapDS();
       // a.xuatDS();
        Sach b = new Sach();
        //b.NhapDSTacGia();
        //b.xuatDSTacGia();
        b.NhapDSTheLoai();
        b.XuatDSTheLoai();
    }
}
