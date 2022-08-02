import java.util.Scanner;

public class HinhChuNhat {
    static Scanner sc = new Scanner(System.in);
    private int chieudai;
    private int chieurong;

    public int getChieudai() {
        return chieudai;
    }
    public int getChieurong() {
        return chieurong;
    }

    public void setChieudai(int cd) {
        chieudai = cd;
    }
    public void setChieurong(int cr) {
        chieurong = cr;
    }

    public void input() {
        System.out.print("Nhap chieu dai: ");
        chieudai = sc.nextInt();
        System.out.print("Nhap chieu rong: ");
        chieurong = sc.nextInt();
    }

    public void output()
    {
        System.out.printf("%-12s%-12s%-12s%-12s\n", "Chieu dai", "Chieu rong", "Dien tich", "Chu vi");
        System.out.printf("%-12d%-12d%-12d%-12d\n\n", chieudai, chieurong, dientich(), chuvi());
    }

    public int chuvi()
    {
        return (chieudai+chieurong)*2;
    }

    public int dientich()
    {
        return chieudai*chieurong;
    }

    HinhChuNhat(){
    }

    public static void main(String[] args)
    {
        HinhChuNhat a = new HinhChuNhat();
        System.out.print("Nhap chieu dai: ");
        a.setChieudai(sc.nextInt());
        System.out.print("Nhap chieu rong: ");
        a.setChieurong(sc.nextInt());
        a.output();;

        HinhChuNhat b = new HinhChuNhat();
        b.input();
        b.output();

        if (a.dientich()>b.dientich()) System.out.println("Dien tich HCN a lon hon: " + a.dientich());
        else
            if (a.dientich()<b.dientich()) System.out.println("Dien tich HCN b lon hon: " + b.dientich());
            else System.out.println("Dien tich 2 HCN bang nhau");
    }
}
