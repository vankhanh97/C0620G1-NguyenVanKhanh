package _4_LopVaDoiTuongTrongJava.BaiTap;

import java.util.Scanner;

public class PhuongTrinhBacHai {
    public static void main(String[] args) {
        class QuadraticEquation {
            private double a, b, c;

            public QuadraticEquation(double a, double b, double c) {
                this.a = a;
                this.b = b;
                this.c = c;
            }

            public double getDiscriminant() {
                return this.b * 2 - 4 * this.a * this.c;
            }

            public double oneRoot() {
                return -this.b / 2 * this.a;
            }

            public double nghiemA() {
                return (-this.b - Math.sqrt(getDiscriminant())) / 2 * this.a;
            }

            public double nghiemB() {
                return (-this.b + Math.sqrt(getDiscriminant())) / 2 * this.a;
            }
        }
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập a: ");
            int a = sc.nextInt();
            System.out.println("Nhập b: ");
            int b = sc.nextInt();
            System.out.println("Nhập c: ");
            int c = sc.nextInt();
            QuadraticEquation pt_1 = new QuadraticEquation(a, b, c);
            if (pt_1.getDiscriminant() < 0) {
                System.out.println("Phương trình vô nghiệm");
            } else if (pt_1.getDiscriminant() == 0) {
                System.out.println("Phương trình có nghiệm kép " + pt_1.oneRoot());
            } else {
                System.out.println("Phương trình có 2 nghiệm " + pt_1.nghiemA() + " và " + pt_1.nghiemB());
            }
        }
    }

}
