package _19_StringAndRegex.BaiTap;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    public static void main(String[] args) {
        System.out.println("Nhập SDT cần kiểm tra: ");
        Scanner scanner = new Scanner(System.in);
        String phoneNumber = scanner.nextLine();
        Pattern pattern = Pattern.compile("^\\d\\d-\\d{10}$");
        Matcher check = pattern.matcher(phoneNumber);
        System.out.println(check.matches());
    }
}
