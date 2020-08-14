package _3_MangVaPhuongThucTrongJava.BaiTap;

import java.util.Scanner;

public class TimGTLonNhatMang2Chieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập kích thước mảng: ");
        int kichThuocMang = sc.nextInt();
        int[][] arr = new int[kichThuocMang][kichThuocMang];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Nhập arr" + "[" + i + "]" + "[" + j + "]");
                arr[i][j] = sc.nextInt();

            }
        }
        int soLonNhat = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (soLonNhat<arr[i][j]){
                    soLonNhat = arr[i][j];
                }
            }
        }
        System.out.println("Số lớn nhất trong mảng là: "+ soLonNhat);
//        for (int a = 0; a < arr.length; a++) {
//            for (int b = 0; b < arr[a].length; b++) {
//                System.out.print(arr[a][b] + " ");
//            }
//            System.out.println();
//        }
    }
}
