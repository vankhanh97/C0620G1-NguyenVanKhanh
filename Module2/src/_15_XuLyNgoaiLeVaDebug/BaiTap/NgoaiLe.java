package _15_XuLyNgoaiLeVaDebug.BaiTap;

import java.util.*;

public class NgoaiLe {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Nhập cạnh a");
            int canhA = scanner.nextInt();
            System.out.println("Nhập cạnh b");
            int canhB = scanner.nextInt();
            System.out.println("Nhập cạnh c");
            int canhC = scanner.nextInt();

            if (canhA < 0 || canhC < 0 || canhB < 0 || canhA + canhB < canhC || canhC + canhB < canhA || canhA + canhC < canhB) {
                throw new IllegalTriangleException(",cạnh tam giác phải lớn hơn 0 và tổng 2 cạnh lớn hơn cạnh còn lại");
            }
            else
                System.out.println("Hình có các cạnh trên là tam giác");

        } catch (IllegalTriangleException e) {
            e.printStackTrace();
        }
    }

}


