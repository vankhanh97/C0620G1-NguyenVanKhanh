package Module2_NguyenVanKhanh_casestudy.Controller;

import Module2_NguyenVanKhanh_casestudy.Commons.FileUtils;
import Module2_NguyenVanKhanh_casestudy.Models.House;
import Module2_NguyenVanKhanh_casestudy.Models.Room;
import Module2_NguyenVanKhanh_casestudy.Models.Villa;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

import static Module2_NguyenVanKhanh_casestudy.Commons.FileUtils.readCSV;
import static Module2_NguyenVanKhanh_casestudy.Commons.Regex.*;

public class MainController {
    public static void dislayMainMenu() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu: ");
        System.out.println( "1. Add New Services\n" +
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
                showServices();
                break;
            case 3:
                addNewCustomer();


        }

    }

    public static void addNewServices() throws IOException {
        Scanner scanner = new Scanner(System.in);
        boolean check;
        System.out.println("1. Add New Villa\n" +
                "2. Add New House\n" +
                "3. Add New Room\n" +
                "4. Back to menu\n" +
                "5. Exit");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                Scanner scanner1 = new Scanner(System.in);
                String id, tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiThueToiDa, kieuThue, soTang, dienTichHoBoi,tieuChuanPhong;
                do {
                    System.out.println("Input Villa ID: ");
                    id = scanner1.nextLine();
                    check = !valid_Id_Villa(id);
                }
                while (check);
                do {
                    System.out.println("Input Tên dịch vụ:");
                    tenDichVu = scanner1.nextLine();
                    check = !valid_Tendichvu(tenDichVu);
                }
                while (check);

                do {
                    System.out.println("Input Diện tích sử dụng:");
                    dienTichSuDung = scanner1.nextLine();
                    if (Double.parseDouble(dienTichSuDung) >= 30) {
                        check = !valid_Dientichsudung_hoboi(dienTichSuDung);
                    }
                    else
                        check= true;
                }
                while (check);

                do {
                    System.out.println("Input Chi phí thuê:");
                    chiPhiThue = scanner1.nextLine();
                    check = !valid_Chiphithue(chiPhiThue);
                }
                while (check);

                do {
                    System.out.println("Input Số lượng người thuê tối đa:");
                     soLuongNguoiThueToiDa = scanner1.nextLine();
                    check = Integer.parseInt(soLuongNguoiThueToiDa) <= 0 || Integer.parseInt(soLuongNguoiThueToiDa) >= 20;
                }
                while (check);

                do {
                    System.out.println("Input Kiểu thuê:");
                    kieuThue = scanner1.nextLine();
                    check = !valid_Tendichvu(kieuThue);
                }
                while (check);

                do {
                    System.out.println("Input Tiêu chuẩn phòng:");
                    tieuChuanPhong = scanner1.nextLine();
                    check = !valid_Tendichvu(tieuChuanPhong);
                }
                while (check);

                do {
                    System.out.println("Input Số tầng: ");
                    soTang = scanner1.nextLine();
                    check = !valid_Chiphithue(soTang);
                }
                while (check);

                do {
                    System.out.println("Input Diện tích hồ bơi:");
                     dienTichHoBoi = scanner1.nextLine();
                    if (Double.parseDouble(dienTichHoBoi) >= 30) {
                        check = !valid_Dientichsudung_hoboi(dienTichHoBoi);
                    }
                    else
                        check= true;
                }
                while (check);

                Villa villaName = new Villa(id, tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiThueToiDa, kieuThue,
                        tieuChuanPhong, dienTichHoBoi, soTang);
                FileUtils.writeCSV(villaName, "D:\\C0620G1-NguyenVanKhanh\\Module2\\src\\Module2_NguyenVanKhanh_casestudy\\Data\\Villa.csv");
                break;
            case 2:
                Scanner scanner2 = new Scanner(System.in);
                String id2, tenDichVu2, dienTichSuDung2, chiPhiThue2, soLuongNguoiThueToiDa2, kieuThue2, soTang2,tieuChuanPhong2;
                do {
                    System.out.println("Input House ID: ");
                    id2 = scanner2.nextLine();
                    check = !valid_Id_Villa(id2);
                }
                while (check);
                do {
                    System.out.println("Input Tên dịch vụ:");
                    tenDichVu2 = scanner2.nextLine();
                    check = !valid_Tendichvu(tenDichVu2);
                }
                while (check);

                do {
                    System.out.println("Input Diện tích sử dụng:");
                    dienTichSuDung2 = scanner2.nextLine();
                    if (Double.parseDouble(dienTichSuDung2) >= 30) {
                        check = !valid_Dientichsudung_hoboi(dienTichSuDung2);
                    }
                    else
                        check= true;
                }
                while (check);

                do {
                    System.out.println("Input Chi phí thuê:");
                    chiPhiThue2 = scanner2.nextLine();
                    check = !valid_Chiphithue(chiPhiThue2);
                }
                while (check);

                do {
                    System.out.println("Input Số lượng người thuê tối đa:");
                    soLuongNguoiThueToiDa2 = scanner2.nextLine();
                    check = Integer.parseInt(soLuongNguoiThueToiDa2) <= 0 || Integer.parseInt(soLuongNguoiThueToiDa2) >= 20;
                }
                while (check);

                do {
                    System.out.println("Input Kiểu thuê:");
                    kieuThue2 = scanner2.nextLine();
                    check = !valid_Tendichvu(kieuThue2);
                }
                while (check);

                do {
                    System.out.println("Input Tiêu chuẩn phòng:");
                    tieuChuanPhong2 = scanner2.nextLine();
                    check = !valid_Tendichvu(tieuChuanPhong2);
                }
                while (check);

                do {
                    System.out.println("Input Số tầng: ");
                    soTang2 = scanner2.nextLine();
                    check = !valid_Chiphithue(soTang2);
                }
                while (check);


                House houseName = new House(id2, tenDichVu2, dienTichSuDung2, chiPhiThue2, soLuongNguoiThueToiDa2, kieuThue2,
                        tieuChuanPhong2, soTang2);
                FileUtils.writeCSV(houseName, "D:\\C0620G1-NguyenVanKhanh\\Module2\\src\\Module2_NguyenVanKhanh_casestudy\\Data\\House.csv");
                break;
            case 3:
                Scanner scanner3 = new Scanner(System.in);
                String id3, tenDichVu3, dienTichSuDung3, chiPhiThue3, soLuongNguoiThueToiDa3, kieuThue3;
                do {
                    System.out.println("Input Room ID: ");
                    id3 = scanner3.nextLine();
                    check = !valid_Id_Villa(id3);
                }
                while (check);
                do {
                    System.out.println("Input Tên dịch vụ:");
                    tenDichVu3 = scanner3.nextLine();
                    check = !valid_Tendichvu(tenDichVu3);
                }
                while (check);

                do {
                    System.out.println("Input Diện tích sử dụng:");
                    dienTichSuDung3 = scanner3.nextLine();
                    if (Double.parseDouble(dienTichSuDung3) >= 30) {
                        check = !valid_Dientichsudung_hoboi(dienTichSuDung3);
                    }
                    else
                        check= true;
                }
                while (check);

                do {
                    System.out.println("Input Chi phí thuê:");
                    chiPhiThue3 = scanner3.nextLine();
                    check = !valid_Chiphithue(chiPhiThue3);
                }
                while (check);

                do {
                    System.out.println("Input Số lượng người thuê tối đa:");
                    soLuongNguoiThueToiDa3 = scanner3.nextLine();
                    check = Integer.parseInt(soLuongNguoiThueToiDa3) <= 0 || Integer.parseInt(soLuongNguoiThueToiDa3) >= 20;
                }
                while (check);

                do {
                    System.out.println("Input Kiểu thuê:");
                    kieuThue3 = scanner3.nextLine();
                    check = !valid_Tendichvu(kieuThue3);
                }
                while (check);
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
                    arrList.subList(0, 9).clear();
                }
                break;
            case 2:
                List<String> arrList1 = readCSV("D:\\C0620G1-NguyenVanKhanh\\Module2\\src\\Module2_NguyenVanKhanh_casestudy\\Data\\House.csv");
                while (arrList1.size() != 0) {
                    House house = new House(arrList1.get(0), arrList1.get(1), arrList1.get(2), arrList1.get(3), arrList1.get(4), arrList1.get(5)
                            , arrList1.get(6), arrList1.get(7));
                    house.showInfor();
                    arrList1.subList(0, 8).clear();
                }
                break;
            case 3:
                List<String> arrList2 = readCSV("D:\\C0620G1-NguyenVanKhanh\\Module2\\src\\Module2_NguyenVanKhanh_casestudy\\Data\\Room.csv");
                while (arrList2.size() != 0) {
                    Room room = new Room(arrList2.get(0), arrList2.get(1), arrList2.get(2), arrList2.get(3), arrList2.get(4), arrList2.get(5)
                            , arrList2.get(6));
                    room.showInfor();
                    arrList2.subList(0, 7).clear();
                }
                break;
            case 4:
                List<String> arrList4 = readCSV("D:\\C0620G1-NguyenVanKhanh\\Module2\\src\\Module2_NguyenVanKhanh_casestudy\\Data\\Villa.csv");
                TreeSet<String> villaTreeSet = new TreeSet<>();
                while (arrList4.size() != 0) {
                    villaTreeSet.add(arrList4.get(1));
                    arrList4.subList(0, 9).clear();
                }
                for (String villa : villaTreeSet) {
                    System.out.println(villa);
                }
                break;
            case 5:
                List<String> arrList3 = readCSV("D:\\C0620G1-NguyenVanKhanh\\Module2\\src\\Module2_NguyenVanKhanh_casestudy\\Data\\House.csv");
                TreeSet<String> villaTreeSet1 = new TreeSet<>();
                while (arrList3.size() != 0) {
                    villaTreeSet1.add(arrList3.get(1));
                    arrList3.subList(0, 8).clear();
                }
                for (String villa : villaTreeSet1) {
                    System.out.println(villa);
                }
                break;
            case 6:
                List<String> arrList6 = readCSV("D:\\C0620G1-NguyenVanKhanh\\Module2\\src\\Module2_NguyenVanKhanh_casestudy\\Data\\Room.csv");
                TreeSet<String> villaTreeSet2 = new TreeSet<>();
                while (arrList6.size() != 0) {
                    villaTreeSet2.add(arrList6.get(1));
                    arrList6.subList(0, 7).clear();
                }
                for (String villa : villaTreeSet2) {
                    System.out.println(villa);
                }
                break;
            case 7:
                dislayMainMenu();
                break;
            case 8:
                System.exit(0);
            default:
                System.out.println("Error");
        }
    }

    public static void addNewCustomer(){

    }
}

