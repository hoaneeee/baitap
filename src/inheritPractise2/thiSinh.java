package inheritPractise2;

import java.util.Scanner;

public class thiSinh extends hiuman2{
    protected String sbd;
    protected float diemToan;
    protected float diemHoa;
    protected float diemLy;
    public thiSinh(String name, String sex, String dob, String queQuan, String address) {
        super(name, sex, dob, queQuan, address);
    }

    public thiSinh(String name, String sex, String dob, String queQuan, String address, String sbd, float diemToan, float diemHoa, float diemLy) {
        super(name, sex, dob, queQuan, address);
        this.sbd = sbd;
        this.diemToan = diemToan;
        this.diemHoa = diemHoa;
        this.diemLy = diemLy;
    }

    public thiSinh() {
    }

    @Override
    public void input() {
        Scanner sc= new Scanner(System.in);
        super.input();
        System.out.println("số báo danh: ");
        sbd=sc.nextLine();
        System.out.println("diem toan : ");
        diemToan=sc.nextInt();
        System.out.println("điểm lý : ");
        diemLy= sc.nextInt();
        System.out.println(" điểm hóa : ");
        diemHoa= sc.nextInt();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("số báo danh : "+sbd);
        System.out.println("điểm toán "+diemToan);
        System.out.println("điểm lý là "+diemLy);
        System.out.println("điểm hóa "+diemHoa);
    }
    public boolean checkDiem(double diemChuan){
        return (diemHoa+diemHoa+diemLy)>=diemChuan;
    }
}
