import java.util.Scanner;

public class NhanVien {
    static Scanner sc = new Scanner(System.in);
    private int Manv;
    private String Tennv;
    private int Tuoi;
    private String DiaChi;
    private String BoPhan;
    static int temp = 1;

    public NhanVien() {
        Manv = temp;
        temp++;
    }

    public void input() {
        System.out.print("Nhap ten NV: ");
        Tennv = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        Tuoi = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap dia chi: ");
        DiaChi = sc.nextLine();
        System.out.print("Nhap bo phan: ");
        BoPhan = sc.nextLine();
    }

    public void output()
    {
        System.out.printf("%-12d%-12s%-12d%-12s%-12s\n", Manv, Tennv, Tuoi, DiaChi, BoPhan);
    }

    public static void main(String[] args) {
        System.out.println("NHAP VAO THONG TIN\n------------------\n");
        NhanVien a = new NhanVien();
        NhanVien b = new NhanVien();
        NhanVien c = new NhanVien();
        NhanVien d = new NhanVien();
        NhanVien e = new NhanVien();
        a.input();
        b.input();
        c.input();
        d.input();
        e.input();
        System.out.printf("%-12s%-12s%-12s%-12s%-12s\n", "Manv", "Tennv", "Tuoi", "DiaChi", "BoPhan");
        a.output();
        b.output();
        c.output();
        d.output();
        e.output();
    }
}
