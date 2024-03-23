package inheritPractise2;

import java.util.Scanner;

public class hiuman2 {
    protected String name;
    protected String sex;
    protected String dob;
    protected String queQuan;
    protected String address;

    public hiuman2(String name, String sex, String dob, String queQuan, String address) {
        this.name = name;
        this.sex = sex;
        this.dob = dob;
        this.queQuan = queQuan;
        this.address = address;
    }

    public hiuman2() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void input(){
        Scanner sc= new Scanner(System.in);
        System.out.println("tên : ");
        name=sc.nextLine();
        System.out.println("giới tính : ");
        sex=sc.nextLine();
        System.out.println("ngày sinh : ");
        dob=sc.nextLine();
        System.out.println("quê quán: ");
        queQuan=sc.nextLine();
        System.out.println("địa chỉ : ");
        address=sc.nextLine();
    }
    public void output(){
        System.out.println("tên : "+name);
        System.out.println("giới tính: "+sex);
        System.out.println("ngày sinh "+dob);
        System.out.println("địa chỉ : "+address);
    }

}
