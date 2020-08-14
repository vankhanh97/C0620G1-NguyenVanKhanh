package _3_MangVaPhuongThucTrongJava.BaiTap;

import java.util.Scanner;

public class TimGiaTriNhoNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập kích thước mảng: ");
        int kichThuocMang = sc.nextInt();
        int[] arr = new int[kichThuocMang];
        for (int i = 0; i < arr.length; i++) {
                System.out.println("Nhập arr" + "[" + i + "]");
                arr[i] = sc.nextInt();
        }
        int soBeNhat = arr[0];
        for (int i = 0; i < arr.length; i++) {
                if (soBeNhat>arr[i]){
                    soBeNhat = arr[i];
            }
        }
        System.out.println("Số nhỏ nhất trong mảng là: "+ soBeNhat);}}
