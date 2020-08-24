package _15_XuLyNgoaiLeVaDebug.BaiTap;

import java.util.*;

public class NgoaiLe {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập cạnh a");
        int canhA = scanner.nextInt();
        System.out.println("Nhập cạnh b");
        int canhB = scanner.nextInt();
        System.out.println("Nhập cạnh c");
        int canhC = scanner.nextInt();
        try {
            if (canhA < 0 || canhC < 0 || canhB < 0 || canhA + canhB < canhC || canhC + canhB < canhA || canhA + canhC < canhB) {
            }


        }
    }
}
