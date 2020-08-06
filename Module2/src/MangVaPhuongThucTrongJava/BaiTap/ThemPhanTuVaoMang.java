package MangVaPhuongThucTrongJava.BaiTap;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int[] arr = {11, 24, 300, 43, 5, 6, 7};
        System.out.print("Mảng đã cho: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if (i == arr.length - 1) {
                System.out.println("");
            }
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập phần tử cần thêm trong mảng");
        int input = sc.nextInt();
        System.out.println("Nhập vị trí cần thêm vào mảng");
        int index = sc.nextInt();
        System.out.println("Thêm " + input + ". vào vị trí thứ " + index);
        int[] arr2 = new int[arr.length + 1];
        for (int j = 0; j < arr.length + 1; j++) {
            if (j == index) {
                arr2[j] = input;
                System.out.print(arr2[j] + " ");
            } else if (j > index) {
                arr2[j] = arr[j-1];
                System.out.print(arr2[j] + " ");
            } else {
                System.out.print(arr[j] + " ");
            }
        }

    }
}
