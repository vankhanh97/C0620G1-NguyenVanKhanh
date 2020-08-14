package _3_MangVaPhuongThucTrongJava.BaiTap;

import java.util.Scanner;

public class XoaPhanTuCuaMang {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập phần tử cần xóa trong mảng");
        int a = sc.nextInt();
        for (int x =0;x <arr.length;x++) {
            if (arr[x] == a) {
                continue;
            }
            System.out.print(arr[x]+" ");
        }
        for (int y =0;y <arr.length;y++) {
            if (arr[y]==a){
                System.out.println("Phần tử đã xóa ở vị trí "+ ++y);
            }
        }
    }
}
