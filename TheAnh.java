import java.util.Scanner;

class TacGia{
    private String idTacGia;
    private String tenTacGia;
    private String ngaySinh;
    private String quocTich;

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

    public String getQuocTich() {
        return this.quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }
    public TacGia(){}
    public TacGia(String idTacGia, String tenTacGia, String ngaysinh,String quocTich){
        this.idTacGia = idTacGia;
        this.tenTacGia = tenTacGia;
        this.ngaySinh = ngaySinh;
        this.quocTich = quocTich;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("ID tac gia: ");
        idTacGia = sc.nextLine();
        System.out.print("Ten tac gia: ");
        tenTacGia = sc.nextLine();
        System.out.println("Ngay sinh: ");
        ngaySinh = sc.nextLine();
        System.out.println("Quoc tich: ");
        quocTich = sc.nextLine();
    }
    
    public void xuat() {
        System.out.printf("%-15s %-25s %-15s %-20s\n","ID Tác Giả", "Tên Tác Giả", "Ngày Sinh", "Quốc Tịch");
        System.out.println("--------------------------------------------------------------------------");
        System.out.printf("%-15s %-25s %-15s %-20s\n", idTacGia, tenTacGia, ngaySinh, quocTich);
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

    public TheLoai() {}
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

    public NhaXuatBan() {}

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
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.printf("%-15s %-25s %-30s %-15s\n",idNhaXuatBan, tenNhaXuatBan, diaChi, soDienThoai);
    }
}

public class abc {
    public static void main(String[] args) {
        TacGia a = new TacGia();
        TheLoai b = new TheLoai();
        NhaXuatBan c = new NhaXuatBan();
        //a.nhap();
        //a.xuat();
        b.nhap();
        b.xuat();
        c.nhap();
        c.xuat();

    }
    
}

