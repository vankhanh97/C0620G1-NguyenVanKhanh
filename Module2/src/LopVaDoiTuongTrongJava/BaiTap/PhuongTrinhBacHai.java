package LopVaDoiTuongTrongJava.BaiTap;

public class PhuongTrinhBacHai {
    public static void main(String[] args) {
        class QuadraticEquation {
            double a, b, c;

            public QuadraticEquation(double a, double b, double c) {
                this.a = a;
                this.b = b;
                this.c = c;
            }

            public double getDiscriminant() {
                return this.b * 2 - 4 * this.a * this.c;
            }
            public double oneRoot(){
                return -this.b/2*this.a;
            }
        }
    }
}
