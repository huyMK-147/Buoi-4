import java.util.Scanner;

public class PtBac2 {
    private int a;
    private int b;
    private int c;
    static Scanner sc = new Scanner(System.in);

    public void intput()
    {
        System.out.print("Nhap a: ");
        a = sc.nextInt();
        System.out.print("Nhap b: ");
        b = sc.nextInt();
        System.out.print("Nhap c: ");
        c = sc.nextInt();
    }

    public void cal()
    {
        float delta = (float) Math.pow(b,2) - 4*a*c;
        if (delta<0)
        {
            System.out.print(" vo nghiem");
        }
        else
            if (delta==0) System.out.print(" co nghiem kep: x = " + (float) (-b)/(2*a));
            else
            {
                System.out.print(" co 2 nghiem phan biet:\n");
                System.out.print("\tx1 = " + (float) (-b+Math.sqrt(delta))/(2*a));
                System.out.print("\n\tx2 = " + (float) (-b-Math.sqrt(delta))/(2*a));
            }
    }

    public void output()
    {
        System.out.print("Phuong trinh");
        cal();
    }

    public static void main(String[] args)
    {
        PtBac2 a = new PtBac2();
        a.intput();
        a.output();
    }
}
