package _4_LopVaDoiTuongTrongJava.ThucHanh;

import java.util.Scanner;

public class LopHinhChuNhat {
    public static void main(String[] args) {

        class Rectangle {
            double width, height;

            public Rectangle(double width, double height) {
                this.width = width;
                this.height = height;
            }

            public double getArea() {
                return this.width * this.height;
            }

            public double getPerimeter() {
                return (this.width + this.height) * 2;
            }

            public String display() {
                return "Rectangle{" + "width=" + width + ", height=" + height + "}";
            }

        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width:");
        double width = scanner.nextDouble();
        System.out.print("Enter the height:");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Your Rectangle \n" + rectangle.display());
        System.out.println("Perimeter of the Rectangle: " + rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: " + rectangle.getArea());
    }
}
