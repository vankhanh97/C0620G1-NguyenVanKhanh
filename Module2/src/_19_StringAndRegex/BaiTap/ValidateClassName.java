package _19_StringAndRegex.BaiTap;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClassName {
    public static void main(String[] args) {
        System.out.println("Nhập lớp cần kiểm tra: ");
        Scanner scanner = new Scanner(System.in);
        String nameClass = scanner.nextLine();
        Pattern pattern = Pattern.compile("^[CAP]\\d\\d\\d\\d[GHIKLM]");
        Matcher check = pattern.matcher(nameClass);
        System.out.println(check.matches());
    }
}
