package _2_VongLapTrongJava.BaiTap;

public class    HienThi20SoNTDauTien {
    public static void main(String[] args) {
        System.out.println("Các số nguyên tố nhỏ hơn 20 là: ");
        for (int i = 0; i < 20; i++) {
            if (isPrimeNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrimeNumber(int n) {

        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}