package _17_IOBinaryFileAndSerialization.BaiTap.QuanLySanPhamLuuFileNhiPhan;

import java.io.*;
import java.util.Scanner;

public class main {

    public static void hienThiSanPham() {
        try {
            BufferedInputStream bf = new BufferedInputStream(new FileInputStream("D:\\C0620G1-NguyenVanKhanh\\Module2\\src\\_17_IOBinaryFileAndSerialization\\BaiTap\\QuanLySanPhamLuuFileNhiPhan\\SanPham"));
            int lengh;
            while ((lengh = bf.read()) != -1) {
                System.out.print((char) lengh);
            }
            bf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void ghiSanPham(String sanPham) {
        try {
            if (sanPham.equals("clear")) {
                FileOutputStream fileOutputStream = new FileOutputStream("D:\\C0620G1-NguyenVanKhanh\\Module2\\src\\_17_IOBinaryFileAndSerialization\\BaiTap\\QuanLySanPhamLuuFileNhiPhan\\SanPham");
                BufferedOutputStream bf = new BufferedOutputStream(fileOutputStream);

            } else {
                FileOutputStream fileOutputStream = new FileOutputStream("D:\\C0620G1-NguyenVanKhanh\\Module2\\src\\_17_IOBinaryFileAndSerialization\\BaiTap\\QuanLySanPhamLuuFileNhiPhan\\SanPham", true);
                BufferedOutputStream bf = new BufferedOutputStream(fileOutputStream);
                byte[] b = sanPham.getBytes();
                bf.write(b);
                bf.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n" + "Nhập thông tin: ");
            String sanPham = scanner.nextLine();
            if (sanPham.equals("clear")) {
                ghiSanPham(sanPham);
            } else
                ghiSanPham(sanPham + "\n");
            hienThiSanPham();
        }
    }
}
