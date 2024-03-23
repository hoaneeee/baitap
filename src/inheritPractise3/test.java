package inheritPractise3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<mayTinh> mt = new ArrayList<>();
        System.out.println(" nhập số lượng mt:  ");
        int n= sc.nextInt();
        sc.nextLine();
        for (int i=0; i<n;i++){
            System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ":");
            mayTinh maytinh= new mayTinh();
            maytinh.input();
            mt.add(maytinh);
        }
        for (mayTinh maytinh: mt) {
            if(maytinh.getNhanHieu().equalsIgnoreCase("IBM")){
                maytinh.output();
                System.out.println();
            }
        }
        Collections.sort(mt,new compareratorMayTinh());
        System.out.println("danh sách mt sau khi sắp xếp giá thành ");
        for (mayTinh mt2:mt) {
            mt2.output();
            System.out.println();
        }

//cách 1
        for (int i=0; i<mt.size();i++){
            mayTinh mayTinh=mt.get(i);
            if(mayTinh.getNhanHieu().equalsIgnoreCase("Intel")){
                mt.remove(i);
                i--;
            }
        }
//cách 2

/*        Iterator<mayTinh> ite= mt.iterator();
        while (ite.hasNext()){
            mayTinh mt5=ite.next();
            if(mt5.getNhanHieu().equalsIgnoreCase("Intel")){
                ite.remove();
            }
        }*/
        System.out.println("danh sách sau khi xóa ");
        for (mayTinh mt4:mt) {
            mt4.output();
            System.out.println();
        }

    }
}
class compareratorMayTinh implements Comparator<mayTinh>{

    @Override
    public int compare(mayTinh mt1, mayTinh mt2) {
        return Double.compare(mt1.getGiaThanh(),mt2.getGiaThanh());
    }
}