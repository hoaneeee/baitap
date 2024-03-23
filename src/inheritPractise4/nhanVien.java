package inheritPractise4;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class nhanVien extends hiuMan{
    Locale locate= new Locale("vn","VN");
    NumberFormat nf= NumberFormat.getCurrencyInstance(locate);
    protected double salary;
    protected double tongSogioLamViec;
    protected String  phongBan;
    public nhanVien(String name, String sex, String dob, String address) {
        super(name, sex, dob, address);
    }

    public nhanVien(String name, String sex, String dob, String address, double salary, double tongSogioLamViec, String  phongBan) {
        super(name, sex, dob, address);
        this.salary = salary;
        this.tongSogioLamViec = tongSogioLamViec;
        this.phongBan = phongBan;
    }

    public nhanVien() {
    }
    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public double getTongSogioLamViec() {
        return tongSogioLamViec;
    }

    public void setTongSogioLamViec(int tongSogioLamViec) {
        this.tongSogioLamViec = tongSogioLamViec;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    @Override
    public void input() {
        super.input();
        Scanner sc= new Scanner(System.in);
        System.out.println("lương");
        salary=sc.nextInt();
        System.out.println("tổng số giờ làm việc  ");
        tongSogioLamViec=sc.nextInt();
        sc.nextLine();
        System.out.println("phòng ban ");
        phongBan=sc.nextLine();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("lương: "+nf.format(salary));
        System.out.println("tổng số giờ làm việc : "+tongSogioLamViec);
        System.out.println("phòng ban "+phongBan);
    }

    public int tinhLuong(){
        double thuong=0;
        if (this.tongSogioLamViec>=200) {
            thuong=salary*2;
        } else if (this.tongSogioLamViec>=100&&this.tongSogioLamViec<200) {
            thuong= (int) (salary*0.1);
        }else {
            thuong=0;
        }
        return (int) thuong;
    }
}
