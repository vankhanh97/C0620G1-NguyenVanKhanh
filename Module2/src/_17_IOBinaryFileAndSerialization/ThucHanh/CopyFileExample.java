package _17_IOBinaryFileAndSerialization.ThucHanh;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFileExample {
    public static void main(String[] args) throws IOException {
        InputStream inStream = null;
        OutputStream outStream = null;

        try {
            inStream = new FileInputStream(new File("D:\\C0620G1-NguyenVanKhanh\\Module2\\src\\_17_IOBinaryFileAndSerialization\\ThucHanh\\file1.txt"));
            outStream = new FileOutputStream(new File("D:\\C0620G1-NguyenVanKhanh\\Module2\\src\\_17_IOBinaryFileAndSerialization\\ThucHanh\\file2.txt"));

            int length;
            byte[] buffer = new byte[1024];

            // copy the file content in bytes
            while ((length = inStream.read(buffer)) > 0) {
                outStream.write(buffer, 0, length);
            }
            System.out.println("File is copied successful!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            inStream.close();
            outStream.close();
        }
    }
}
