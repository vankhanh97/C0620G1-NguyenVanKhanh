package _1_IntroductiontoJava.BaiTap;

import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       while (true) {
           System.out.println("Nhập số cần chuyển từ 1 đến 10 ");
           int so = sc.nextInt();
           switch (so) {
               case 1:
                   System.out.println("one");
                   break;
               case 2:
                   System.out.println("two");
                   break;
               case 3:
                   System.out.println("three");
                   break;
               case 4:
                   System.out.println("four");
                   break;
               case 5:
                   System.out.println("five");
                   break;
               case 6:
                   System.out.println("six");
                   break;
               case 7:
                   System.out.println("seven");
                   break;
               case 8:
                   System.out.println("eight");
                   break;
               case 9:
                   System.out.println("nine");
                   break;
               case 10:
                   System.out.println("ten");
                   break;
               default:
                   System.out.println("Không có số cần chuyển");
           }
       }
    }
}
