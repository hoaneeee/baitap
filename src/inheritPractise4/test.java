
package inheritPractise4;

import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<nhanVien> dsnv= new ArrayList<>();
        System.out.println("nhập số lượng nhân viên : ");
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            System.out.println("Nhập thông tin nhân viên thứ " + (i + 1) + ":");
            nhanVien nhanvien= new nhanVien();
            nhanvien.input();
            dsnv.add(nhanvien);
        }
        for (nhanVien nv:dsnv) {
            nv.output();
            System.out.println();
        }
        Collections.sort(dsnv,new compareSalary());
        System.out.println("danh sách sau khi sắp xếp là :");
        for (nhanVien nv:dsnv) {
            nv.output();
            System.out.println();
        }
//b
        int count=0;
        for (nhanVien nv:dsnv) {
            if(nv.tinhLuong()>0){
                count++;
            }
        }
        System.out.println("số nhân viên có thưởng "+count);
        System.out.println("nhân viên có thưởng ");
        for (nhanVien nv:dsnv) {
            if(nv.tinhLuong()>0){
                nv.output();
                System.out.println();
            }
        }
//c
        System.out.println("số nhân viên phòng ban kỹ thuật ");
        int count2=0;
        for (nhanVien nv:dsnv) {
            if (nv.getPhongBan().equalsIgnoreCase("kỹ thuật ")){
                count2++;
            }
        }
        System.out.println(count2);
//d
        System.out.println();
        double timluongCaoNhat= checkLuongCaoNhat(dsnv);
        System.out.println("nhân viên có lương cao nhất là : ");
        for (nhanVien nv:dsnv) {
            if (nv.getSalary()==timluongCaoNhat){
                nv.output();
                System.out.println();
            }
        }
//e
        System.out.println();
        System.out.println("nhân viên phòng kế toán :");
        for (nhanVien nv:dsnv) {
            if (nv.getPhongBan().equalsIgnoreCase("kế toán ")){
                nv.output();
                System.out.println();
            }
        }
//f
        Collections.sort(dsnv,new compareSalary2());
        System.out.println("danh sách hành chính sau khi sắp xếp là :");
        for (nhanVien nv:dsnv) {
            if(nv.getPhongBan().equalsIgnoreCase("hành chính ")){
                nv.output();
                System.out.println();
            }
        }
//g
        for (nhanVien nv : dsnv) {
            if(nv.getName().equalsIgnoreCase("Nguyễn Thzu Phương")){
                nv.output();
                System.out.println();
            }
        }
//h
        System.out.println("chuyển lê tuấn sang hành chính ");
        for (nhanVien nv:dsnv) {
            if (nv.getName().equalsIgnoreCase("Lê Tuấn ")){
                nv.getPhongBan().replace("kỹ thuật","hành chính");
                nv.output();
            }
        }

//i
        Iterator<nhanVien> iterator= dsnv.iterator();
        while (iterator.hasNext()){
            nhanVien nv= iterator.next();
            if (nv.getName().equalsIgnoreCase("Nguyễn Thu Phương")){
                iterator.remove();
            }
        }
    }
    public static double checkLuongCaoNhat(ArrayList<nhanVien> dsnv){
        double luongCaoNhat= Double.MIN_VALUE;
        for (nhanVien nv:dsnv) {
            if(nv.getSalary()>luongCaoNhat){
                luongCaoNhat=nv.getSalary();
            }

        }
        return  luongCaoNhat;
    }

}
class compareSalary implements Comparator<nhanVien>{
    @Override
    public int compare(nhanVien nv1, nhanVien nv2) {
        return Double.compare(nv1.getSalary(),nv2.getSalary());
    }
}
class compareSalary2 implements Comparator<nhanVien>{
    @Override
    public int compare(nhanVien nv1, nhanVien nv2) {
        return Double.compare(nv2.getSalary(),nv1.getSalary());
    }
}
