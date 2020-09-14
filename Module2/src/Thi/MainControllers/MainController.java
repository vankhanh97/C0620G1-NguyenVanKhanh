package Thi.MainControllers;

import Module2_NguyenVanKhanh_casestudy.Commons.FileUtils;
import Module2_NguyenVanKhanh_casestudy.Exception.NameException;
import Module2_NguyenVanKhanh_casestudy.Models.Villa;
import Thi.Regex.Regex;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Module2_NguyenVanKhanh_casestudy.Commons.FileUtils.readCSV;
import static Module2_NguyenVanKhanh_casestudy.Commons.Regex.valid_NgaySinh;
import static Thi.Regex.Regex.valid_Sdt;
import static Thi.Regex.Regex.valid_Tendichvu;


public class MainController {
    public static ArrayList<DanhBa> danhBas = new ArrayList<>();

    public static void hienThiManHinh() throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Chọn chức năng theo số để tiếp tục ");
        System.out.println("1. Xem danh sách");
        System.out.println("2. Thêm mới");
        System.out.println("3. Cập nhật");
        System.out.println("4. Xóa");
        System.out.println("5. Tìm kiếm");
        System.out.println("6. Đọc từ file");
        System.out.println("7. Ghi vào file");
        System.out.println("8. Thoát");
        System.out.println("Chọn chức năng");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                hienThiDanhBa();
                break;
            case 2:
                themDanhBa();
                break;
            case 3:
                capNhatDanhBa();
                break;
            case 4:
                xoaDanhBa();
                break;
            case 5:
                timKiem();
                break;
            case 6:
                docFile();
                break;
            case 7:
                ghiFile();
                break;
            case 8:
                System.exit(0);

        }
    }

    public static void hienThiDanhBa() throws IOException {
        Scanner sc = new Scanner(System.in);
        for (DanhBa danhBa:danhBas){
            danhBa.hienThiDanhBa();
        }

        docFile();
        System.out.println("1. Thêm mới");
        System.out.println("2. Sửa");
        System.out.println("3. Xóa");
        System.out.println("4. Hiển thị màn hình");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                themDanhBa();
                break;
            case 2:
                capNhatDanhBa();
                break;
            case 3:
                xoaDanhBa();
                break;
            case 4:
                hienThiManHinh();
                break;
        }


    }

    public static void themDanhBa() {
        Scanner scanner = new Scanner(System.in);
        String soDienThoai;
        String nhomDanhBa;
        String hoTen;
        String gioiTinh;
        String diaChi;
        String ngaySinh;
        String email;
        do {
            try {
                System.out.println("Số điện thoại : ");
                soDienThoai = scanner.nextLine();
                if (valid_Sdt(soDienThoai)) break;
                else throw new NameException();
            } catch (NameException e) {
                System.out.print("Số điện thoại có 10 số." + "\n");
            }
        } while (true);
        do {
            try {
                System.out.println("Họ và tên : ");
                hoTen = scanner.nextLine();
                if (valid_Tendichvu(hoTen)) break;
                else throw new NameException();
            } catch (NameException e) {
                System.out.print("Họ tên phải in hoa ký tự đầu tiên trong mỗi từ." + "\n");
            }
        } while (true);
        do {
            try {
                System.out.println("Nhóm danh bạ : ");
                nhomDanhBa = scanner.nextLine();
                if (valid_Tendichvu(nhomDanhBa)) break;
                else throw new NameException();
            } catch (NameException e) {
                System.out.print("Viết hoa chữ cái đầu." + "\n");
            }
        } while (true);
        do {
            try {
                System.out.println("Giới tính : ");
                gioiTinh = scanner.nextLine();
                if (Regex.valid_Gioitinh(gioiTinh)) break;
                else throw new NameException();
            } catch (NameException e) {
                System.out.print("Nam hoặc nữ hoặc unknown." + "\n");
            }
        } while (true);
        do {
            try {
                System.out.println("Địa chỉ : ");
                diaChi = scanner.nextLine();
                if (valid_Tendichvu(diaChi)) break;
                else throw new NameException();
            } catch (NameException e) {
                System.out.print("Viết hoa chữ cái đầu." + "\n");
            }
        } while (true);
        do {
            try {
                System.out.println("Ngày sinh: ");
                ngaySinh = scanner.nextLine();
                if (valid_NgaySinh(ngaySinh)) break;
                else throw new NameException();
            } catch (NameException e) {
                System.out.print("Lớn hơn 1900." + "\n");
            }
        } while (true);
        do {
            try {
                System.out.println("Email : ");
                email = scanner.nextLine();
                if (Regex.valid_Email(email)) break;
                else throw new NameException();
            } catch (NameException e) {
                System.out.print("Định dạng acb@abc.abc ." + "\n");
            }
        } while (true);
        System.out.println("Thêm thành công vào danh bạ!");
        DanhBa danhBa = new DanhBa(soDienThoai, nhomDanhBa, hoTen, gioiTinh, diaChi, ngaySinh, email);
        danhBas.add(danhBa);
        danhBa.hienThiDanhBa();
    }

    public static void capNhatDanhBa() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số điện thoại danh bạ cần sửa: ");
        String soDienthoai = sc.nextLine();
        for (DanhBa danhBa : danhBas) {
            if (danhBa.getSoDienThoai().equals(soDienthoai)) {
                danhBas.remove(danhBa);
                themDanhBa();
            } else {
                System.out.println("Không tìm được danh bạ với số điện thoại trên.");
                System.out.println("Nhập số 1 để tiếp tục sửa hoặc nhấn enter để quay lại màn hình chính .");
                String nhap = sc.nextLine();
                if (nhap.equals("")) {
                    hienThiManHinh();
                } else {
                    capNhatDanhBa();
                }
            }
        }

    }

    public static void xoaDanhBa() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số điện thoại danh bạ cần xóa: ");
        String soDienthoai = sc.nextLine();
        for (DanhBa danhBa : danhBas) {
            if (danhBa.getSoDienThoai().equals(soDienthoai)) {
                System.out.println("Tìm thấy số cần xóa nhấn Y để xóa hoặc nhập kí tự khác để quay lại");
                String xoa = sc.nextLine();
                if (xoa.equals("Y")) {
                    danhBas.remove(danhBa);
                } else
                    hienThiManHinh();

            }

        }
    }

    public static void timKiem() {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Nhập số điện thoại hoặc họ tên trong danh bạ cần tìm: ");
        String soDienthoai = sc.nextLine();
        String soDienThoai = sc1.nextLine();
        for (DanhBa danhBa : danhBas) {
            if (danhBa.getSoDienThoai().equals(soDienthoai) || danhBa.getSoDienThoai().equals(soDienThoai)) {
                danhBa.hienThiDanhBa();
            }
        }
    }

    public static void docFile() throws IOException {
        List<String> arrList = readCSV("D:\\C0620G1-NguyenVanKhanh\\Module2\\src\\Thi\\data\\contacts.csv");
        while (arrList.size() != 0) {
            DanhBa danhBa = new DanhBa(arrList.get(0), arrList.get(1), arrList.get(2), arrList.get(3), arrList.get(4), arrList.get(5)
                    , arrList.get(6));
            danhBa.hienThiDanhBa();
            arrList.subList(0, 7).clear();
        }
    }

    public static void ghiFile() throws IOException {
        System.out.println("Nếu lưu file sẽ phải cập nhật danh bạ trước:");
        for (DanhBa danhBa : danhBas) {
            FileUtils.writeCSV(danhBa, "D:\\C0620G1-NguyenVanKhanh\\Module2\\src\\Thi\\data\\contacts.csv");
        }
    }
}