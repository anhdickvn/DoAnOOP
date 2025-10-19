class KhoSach{
    private Sach[] ds;
    private int n;

    public KhoSach(){}
    public KhoSach(Sach[] ds,int n){
        this.ds = ds;
        this.n = n;
    }

    public Sach[] getDs() {
        return ds;
    }

    public void setDs(Sach[] ds) {
        this.ds = ds;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    public void nhapDS(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong sach trong kho: ");
        n = sc.nextInt();
        ds = new Sach[n];
        sc.nextLine();
        for(int i = 0; i < n;i++){
            System.out.println("Sach thu "+(i+1)+": ");
            ds[i] = new Sach();
            ds[i].nhap();
        }
    }
    public void xuatDS(){
        System.out.println("\n==================== DANH SÁCH SÁCH TRONG KHO ====================");
        System.out.printf("%-10s %-25s %-15s %-15s %-15s %-10s %-15s %-15s\n","ID Sách", "Tên Sách", "ID Tác Giả", "ID Thể Loại","ID NXB", "Năm XB", "Giá Gốc", "Giá Sau Thuế");
        System.out.println("---------------------------------------------------------------------------------------------------------------");
        for(int i = 0; i < n;i++){
            ds[i].xuat();
        }
    }

