package _16_IO_TextFile.BaiTap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CopyFileText {
    public static void main(String[] args) {
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader("D:\\C0620G1-NguyenVanKhanh\\Module2\\src\\_16_IO_TextFile\\BaiTap\\test.txt"));

            System.out.println("Đọc nội dung file sử dụng phương thức readLine()");

            String textInALine;

            while ((textInALine = br.readLine()) != null) {
                System.out.println(textInALine);
                textInALine = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
//        BufferedReader br1 = null;
//
//        try {
//            br1 = new BufferedReader(new FileReader("D:\\C0620G1-NguyenVanKhanh\\Module2\\src\\_16_IO_TextFile\\BaiTap\\test.txt"));
//
//            System.out.println("Đọc nội dung file sử dụng phương thức read()");
//
//            int num=0;
//            char ch;
//
//            while((num = br1.read()) != -1)
//            {
//                ch = (char) num;
//                System.out.print(ch);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                br1.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
    }

}
