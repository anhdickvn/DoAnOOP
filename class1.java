abstract class HoaDon{
    private double gia;
    private String maKH;
    private float soLuong;
    private String tenKH;

    public double getGia() {
        return this.gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getMaKH() {
        return this.maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public float getSoLuong() {
        return this.soLuong;
    }

    public void setSoLuong(float soLuong) {
        this.soLuong = soLuong;
    }

    public String getTenKH() {
        return this.tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }
    
    
    public HoaDon(){}
    public HoaDon(double gia, String maKH,int soLuong,String tenKH){
        this.gia = gia;
        this. maKH = maKH;
        this.soLuong = soLuong;
        this. tenKH = tenKH;
    }
    public abstract float ChietKhau();
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Gia: ");
        gia = sc.nextFloat();
        System.out.println("Ma khach hang: ");
        maKH = sc.nextLine();
        System.out.println("So luong: ");
        soLuong = sc.nextInt();
        System.out.println("Ten khach hang: ");
        tenKH = sc.nextLine();
    }
    public double TongTien(){
        return soLuong*gia;
    }
    public double thueVAT(){
        return TongTien()*0.1;
    }
    public void xuat(){
        System.out.println("Gia: "+gia);
        System.out.println("Ma KH: "+maKH);
        System.out.println("So luong: "+soLuong);
        System.out.println("Ten KH: "+tenKH);
    }
}
