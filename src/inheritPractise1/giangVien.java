package inheritPractise1;

import java.util.Scanner;

public class giangVien extends hiuMan{

    protected String lopday;
    protected int luong1Hour;
    protected int soGioDay;


    public giangVien(String name, String sex, String dob, String address) {
        super(name, sex, dob, address);
    }

    public giangVien(String name, String sex, String dob, String address, String lopday, int luong1Hour, int soGioDay) {
        super(name, sex, dob, address);
        this.lopday = lopday;
        this.luong1Hour = luong1Hour;
        this.soGioDay = soGioDay;
    }

    public giangVien() {
    }

    public String getLopday() {
        return lopday;
    }

    public void setLopday(String lopday) {
        this.lopday = lopday;
    }

    public int getLuong1Hour() {
        return luong1Hour;
    }

    public void setLuong1Hour(int luong1Hour) {
        this.luong1Hour = luong1Hour;
    }

    public int getSoGioDay() {
        return soGioDay;
    }

    public void setSoGioDay(int soGioDay) {
        this.soGioDay = soGioDay;
    }

    @Override
    public void input() {
        Scanner sc= new Scanner(System.in);
        super.input();
        System.out.println("lớp dạy");
        lopday=sc.nextLine();
        System.out.println("lương 1 giờ : ");
        luong1Hour=sc.nextInt();
        System.out.println("số giờ dạy : ");
        soGioDay=sc.nextInt();
    }

    @Override
    public void output() {
        super.output();
        System.out.println(lopday);
        System.out.println(lopday);
        System.out.println(soGioDay);
        System.out.println(tinhLuong());
    }
    public int tinhLuong(){
        int luong=0;
        if(lopday.equalsIgnoreCase("buoi sang")||lopday.equalsIgnoreCase("buoi chieu")){
            luong= luong1Hour*soGioDay;
        } else if (lopday.equalsIgnoreCase("buoi toi")) {
            luong= luong1Hour*soGioDay+200000;

        }
        return luong;
    }
}
