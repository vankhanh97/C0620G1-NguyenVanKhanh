package Module2_NguyenVanKhanh_casestudy.Controller;

import Module2_NguyenVanKhanh_casestudy.Commons.FileUtils;
import Module2_NguyenVanKhanh_casestudy.Models.House;
import Module2_NguyenVanKhanh_casestudy.Models.Room;
import Module2_NguyenVanKhanh_casestudy.Models.Villa;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import static Module2_NguyenVanKhanh_casestudy.Commons.FileUtils.readCSV;

public class MainController {
    public static void dislayMainMenu() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu: ");
        System.out.println("1. Add New Services\n" +
                "2. Show Services\n" +
                "3. Add New Customer\n" +
                "4. Show Information of Customer\n" +
                "5. Add New Booking\n" +
                "6. Show Information of Employee\n" +
                "7. Exit ");

        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                addNewServices();
                break;
            case 2:

        }

    }

    public static void addNewServices() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Add New Villa\n" +
                "2. Add New House\n" +
                "3. Add New Room\n" +
                "4. Back to menu\n" +
                "5. Exit");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("Input Villa ID: ");
                String id = scanner1.nextLine();
                System.out.println("Input Tên dịch vụ:");
                String tenDichVu = scanner1.nextLine();
                System.out.println("Input Diện tích sử dụng:");
                String dienTichSuDung = scanner1.nextLine();
                System.out.println("Input Chi phí thuê:");
                String chiPhiThue = scanner1.nextLine();
                System.out.println("Input Số lượng người thuê tối đa:");
                String soLuongNguoiThueToiDa = scanner1.nextLine();
                System.out.println("Input Kiểu thuê:");
                String kieuThue = scanner1.nextLine();
                System.out.println("Input Tiêu chuẩn phòng:");
                String tieuChuanPhong = scanner1.nextLine();
                System.out.println("Input Số tầng: ");
                String soTang = scanner1.nextLine();
                System.out.println("Input Diện tích hồ bơi:");
                String dienTichHoBoi = scanner1.nextLine();
                Villa villaName = new Villa(id, tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiThueToiDa, kieuThue,
                        tieuChuanPhong, dienTichHoBoi, soTang);
                FileUtils.writeCSV(villaName, "D:\\C0620G1-NguyenVanKhanh\\Module2\\src\\Module2_NguyenVanKhanh_casestudy\\Data\\Villa.csv");
                break;
            case 2:
                Scanner scanner2 = new Scanner(System.in);
                System.out.println("Input House ID: ");
                String id2 = scanner2.nextLine();
                System.out.println("Input Tên dịch vụ:");
                String tenDichVu2 = scanner2.nextLine();
                System.out.println("Input Diện tích sử dụng:");
                String dienTichSuDung2 = scanner2.nextLine();
                System.out.println("Input Chi phí thuê:");
                String chiPhiThue2 = scanner2.nextLine();
                System.out.println("Input Số lượng người thuê tối đa:");
                String soLuongNguoiThueToiDa2 = scanner2.nextLine();
                System.out.println("Input Kiểu thuê:");
                String kieuThue2 = scanner2.nextLine();
                System.out.println("Input Tiêu chuẩn phòng:");
                String tieuChuanPhong2 = scanner2.nextLine();
                System.out.println("Input Số tầng: ");
                String soTang2 = scanner2.nextLine();
                House houseName = new House(id2, tenDichVu2, dienTichSuDung2, chiPhiThue2, soLuongNguoiThueToiDa2, kieuThue2,
                        tieuChuanPhong2, soTang2);
                FileUtils.writeCSV(houseName, "D:\\C0620G1-NguyenVanKhanh\\Module2\\src\\Module2_NguyenVanKhanh_casestudy\\Data\\House.csv");
                break;
            case 3:
                Scanner scanner3 = new Scanner(System.in);
                System.out.println("Input Room ID: ");
                String id3 = scanner3.nextLine();
                System.out.println("Input Tên dịch vụ:");
                String tenDichVu3 = scanner3.nextLine();
                System.out.println("Input Diện tích sử dụng:");
                String dienTichSuDung3 = scanner3.nextLine();
                System.out.println("Input Chi phí thuê:");
                String chiPhiThue3 = scanner3.nextLine();
                System.out.println("Input Số lượng người thuê tối đa:");
                String soLuongNguoiThueToiDa3 = scanner3.nextLine();
                System.out.println("Input Kiểu thuê:");
                String kieuThue3 = scanner3.nextLine();
                System.out.println("Input Dịch vụ miễn phí đi kèm:");
                String dichVuMienPhi = scanner3.nextLine();
                Room roomName = new Room(id3, tenDichVu3, dienTichSuDung3, chiPhiThue3, soLuongNguoiThueToiDa3, kieuThue3,
                        dichVuMienPhi);
                FileUtils.writeCSV(roomName, "D:\\C0620G1-NguyenVanKhanh\\Module2\\src\\Module2_NguyenVanKhanh_casestudy\\Data\\Room.csv");
                break;
            case 4:
                dislayMainMenu();
                break;
            case 5:
                System.exit(0);
            default:
                System.out.println("Error");

        }

    }

    public static void showServices() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Show all Villa\n" +
                "2. Show all House\n" +
                "3. Show all Room\n" +
                "4. Show All Name Villa Not Duplicate\n" +
                "5. Show All Name House Not Duplicate\n" +
                "6. Show All Name Name Not Duplicate\n" +
                "7. Back to menu\n" +
                "8. Exit");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                List<String> arrList = readCSV("D:\\C0620G1-NguyenVanKhanh\\Module2\\src\\Module2_NguyenVanKhanh_casestudy\\Data\\Villa.csv");

                while (arrList.size() != 0) {
                    Villa villa = new Villa(arrList.get(0), arrList.get(1), arrList.get(2), arrList.get(3), arrList.get(4), arrList.get(5)
                            , arrList.get(6), arrList.get(7), arrList.get(8));
                    villa.showInfor();
                    for (int i = 0; i < 9; i++) {
                        arrList.remove(0);
                    }

                }
        }
    }
}

