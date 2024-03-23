package inheritPractise1;

import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<giangVien> danhSachGiangVien = new ArrayList<>();

        System.out.print("Nhập số lượng giảng viên: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin giảng viên thứ " + (i + 1) + ":");
            giangVien gv = new giangVien();
            gv.input();
            danhSachGiangVien.add(gv);
        }
        for (giangVien teach: danhSachGiangVien) {
            teach.output();
            System.out.println();
        }
    }
}
