package VongLapTrongJava.BaiTap;

import java.util.Scanner;

public class InHinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. In hình chữ nhật ");
        System.out.println("2. In hình tam giác ");
        System.out.println("3. exit ");
        int x = sc.nextInt();
        switch (x){
            case 1:
                System.out.println("Hình chữ nhật");
                for (int i = 0;i<5;i++){
                    System.out.println("**********");
                }
                break;
            case 2:
                System.out.println("Hình tam giác");
                System.out.println("**********");
                System.out.println("******");
                System.out.println("***");
                System.out.println("*");
               break;
            case 3:
                break;
            default:
                System.out.println("Không có");
        }
    }
}
