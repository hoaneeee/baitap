package inheritPractise3;

import java.util.Scanner;

public class máy {
    protected String tenNhaSX;
    protected String  diaChi;
    protected String nhanHieu;
    protected int giaThanh;

    public máy(String tenNhaSX, String diaChi, String nhanHieu, int giaThanh) {
        this.tenNhaSX = tenNhaSX;
        this.diaChi = diaChi;
        this.nhanHieu = nhanHieu;
        this.giaThanh = giaThanh;
    }

    public máy() {
    }

    public String getTenNhaSX() {
        return tenNhaSX;
    }

    public void setTenNhaSX(String tenNhaSX) {
        this.tenNhaSX = tenNhaSX;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getNhanHieu() {
        return nhanHieu;
    }

    public void setNhanHieu(String nhanHieu) {
        this.nhanHieu = nhanHieu;
    }

    public int getGiaThanh() {
        return giaThanh;
    }

    public void setGiaThanh(int giaThanh) {
        this.giaThanh = giaThanh;
    }
    public void input(){
        Scanner sc= new Scanner(System.in);
        System.out.println("tên nsx: ");
        tenNhaSX=sc.nextLine();
        System.out.println("địa chỉ : ");
        diaChi=sc.nextLine();
        System.out.println("nhãn hiệu: ");
        nhanHieu=sc.nextLine();
        sc.nextLine();
        System.out.println("giá thành : ");
        giaThanh=sc.nextInt();
    }
    public void output(){
        System.out.println("nsx : "+tenNhaSX);
        System.out.println("địa chỉ : "+diaChi);
        System.out.println("nhãn hiệu : "+nhanHieu);
        System.out.println("giá thành : "+ giaThanh);
    }
}
