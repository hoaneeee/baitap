package inheritPractise4;

import java.util.Scanner;

public class hiuMan {
    protected String name;
    protected String sex;
    protected String dob;
    protected String address;

    public hiuMan(String name, String sex, String dob, String address) {
        this.name = name;
        this.sex = sex;
        this.dob = dob;
        this.address = address;
    }

    public hiuMan() {

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
        System.out.println("địa chỉ : ");
        address=sc.nextLine();
    }
    public void output(){
        System.out.println("tên : "+name);
        System.out.println("giới tính : "+sex);
        System.out.println("ngày sinh : "+dob);
        System.out.println("địa chỉ"+address);
    }
}

