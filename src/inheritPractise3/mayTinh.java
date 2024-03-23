package inheritPractise3;

import java.util.Scanner;

public class mayTinh extends máy{
    protected double tocDo;
    protected double dungLuongRam;
    protected double dungLuongOCungHDD;
    public mayTinh(String tenNhaSX, String diaChi, String nhanHieu, int giaThanh) {
        super(tenNhaSX, diaChi, nhanHieu, giaThanh);
    }

    public mayTinh(String tenNhaSX, String diaChi, String nhanHieu, int giaThanh, double tocDo, double dungLuongRam, double dungLuongOCungHDD) {
        super(tenNhaSX, diaChi, nhanHieu, giaThanh);
        this.tocDo = tocDo;
        this.dungLuongRam = dungLuongRam;
        this.dungLuongOCungHDD = dungLuongOCungHDD;
    }

    public mayTinh() {
    }

    @Override
    public void input() {
        super.input();
        Scanner sc= new Scanner(System.in);
        System.out.println("tốc độ : ");
        tocDo=sc.nextDouble();
        System.out.println("dung lượng ram: ");
        dungLuongRam=sc.nextDouble();
        System.out.println("dung lượng hDD: ");
        dungLuongOCungHDD=sc.nextDouble();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("tốc độ : "+tocDo);
        System.out.println("dung lượng ram : "+dungLuongRam);
        System.out.println("dung lượng hdd : "+dungLuongOCungHDD);
    }
}
