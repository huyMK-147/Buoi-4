import java.util.Scanner;

public class Employee {
    private String id;
    private String name;
    private int age;
    private int workingDays;
    private double salary;
    final int PRICE = 50;
    static Scanner sc = new Scanner(System.in);

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getWorkingDays() {
        return workingDays;
    }
    public double getSalary() {
        return salary;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setWorkingDays(int workingDays) {
        this.workingDays = workingDays;
    }
    public void setSalary() {
        salary = workingDays*PRICE;
    }
    Employee() {
    }

    public void input() {
        sc.nextLine();
        System.out.print("Nhap ma NV: ");
        id = sc.nextLine();
        System.out.print("Nhap ten NV: ");
        name = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        age = sc.nextInt();
        System.out.print("Nhap so ngay cong: ");
        workingDays = sc.nextInt();
        setSalary();
    }
    public void output()
    {
        System.out.printf("%-12s%-12s%-12d%-12d%-12.2f\n", id, name, age, workingDays, salary);
    }

    public static void main(String[] args)
    {
        System.out.println("NHAP VAO THONG TIN NV\n---------------------\n");
        Employee nv1 = new Employee();
        Employee nv2 = new Employee();
        Employee nv3 = new Employee();
        Employee nv4 = new Employee();
        System.out.print("Nhap ma NV: ");
        nv1.setId(sc.nextLine());
        System.out.print("Nhap ten NV: ");
        nv1.setName(sc.nextLine());
        System.out.print("Nhap tuoi: ");
        nv1.setAge(sc.nextInt());
        System.out.print("Nhap so ngay cong: ");
        nv1.setWorkingDays(sc.nextInt());
        nv1.setSalary();
        nv2.input();
        nv3.input();
        nv4.input();
        System.out.print("\n\t\t\t\t\tBANG THONG KE\n-------------------------------------------------------\n");
        System.out.printf("%-12s%-12s%-12s%-12s%-12s\n", "Manv", "Hoten", "Tuoi", "Ngaycong", "Luong");
        nv1.output();
        nv2.output();
        nv3.output();
        nv4.output();
    }
}
