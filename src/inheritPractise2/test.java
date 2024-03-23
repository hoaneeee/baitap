package inheritPractise2;

import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<thiSinh> dsts = new ArrayList<>();
        System.out.println("nhập vào số lượng thí sinh : ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ":");
            thiSinh ts = new thiSinh();
            ts.input();
            dsts.add(ts);
        }
        for (thiSinh ts : dsts) {
            ts.output();
            System.out.println();
        }
        System.out.println("nhập điểm chuẩn : ");
        double diemChuan = sc.nextDouble();
        System.out.println("danh sách thí sinh đỗ : ");
        for (thiSinh ts : dsts) {
            if (ts.checkDiem(diemChuan)) {
                ts.output();
                System.out.println();
            }

        }
    }
}
