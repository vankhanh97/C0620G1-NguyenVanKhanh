package _11_StackAndQueue.BaiTap.DaoNguocPhanTuTrongMangSuDungStack;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        Stack<Object> myArray = new Stack<>();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Nhập phần tử của mảng: ");

            String input = scanner.nextLine();
            if (!input.equals("0")) {
                myArray.push(input);
                System.out.println(myArray);
            } else
                break;
        }
        while (!myArray.isEmpty()) {
            System.out.print(myArray.pop()+" ");
        }
    }
}

