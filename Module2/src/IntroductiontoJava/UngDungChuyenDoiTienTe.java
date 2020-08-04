package IntroductiontoJava;
import java.util.Scanner;
public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float vnd = 23000;
        float usd ;
        System.out.println("Nhập số USD: ");
        usd = scanner.nextFloat();
        float soTien = usd * vnd;
        System.out.println("Số tiền đổi ra được là: "+ soTien);
    }
}
