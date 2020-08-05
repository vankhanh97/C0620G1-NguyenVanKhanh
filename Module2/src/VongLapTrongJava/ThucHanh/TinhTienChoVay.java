package VongLapTrongJava.ThucHanh;

import java.util.Scanner;

public class TinhTienChoVay {
    public static void main(String[] args) {
        double money = 0;
        int month = 1;
        double interset_rate=1.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền vay: ");
        money = sc.nextDouble();
        System.out.println("Nhập số tháng vay: ");
        month =sc.nextInt();
        System.out.println("Nhập % lãi suất: ");
        interset_rate = sc.nextDouble();
        double total_interset =0;
        for (int i = 0;i < month;i++) {
            total_interset = money * (interset_rate / 100 / 12) * 3;
        }
        System.out.println("Lãi suất phải trả " + total_interset);

    }
}
