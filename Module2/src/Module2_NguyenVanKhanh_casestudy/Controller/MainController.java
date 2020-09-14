package Module2_NguyenVanKhanh_casestudy.Controller;

import Module2_NguyenVanKhanh_casestudy.Commons.FileUtils;
import Module2_NguyenVanKhanh_casestudy.Commons.SortCustomer;
import Module2_NguyenVanKhanh_casestudy.Exception.*;
import Module2_NguyenVanKhanh_casestudy.Models.*;

import java.io.IOException;
import java.util.*;

import static Module2_NguyenVanKhanh_casestudy.Commons.FileUtils.readCSV;
import static Module2_NguyenVanKhanh_casestudy.Commons.Regex.*;

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
                showServices();
                break;
            case 3:
                addNewCustomer();
                break;
            case 4:
                showInfomationCustomer();
                break;
            case 5:
                addNewBooking();
                break;
            case 6:
                showInfoEmployee();
                break;
            case 7:
                System.exit(0);
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
                String id, tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiThueToiDa, kieuThue, soTang, dienTichHoBoi, tieuChuanPhong;
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
                    } else
                        check = true;
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
                    } else
                        check = true;
                }
                while (check);

                Villa villaName = new Villa(id, tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiThueToiDa, kieuThue,
                        tieuChuanPhong, dienTichHoBoi, soTang);
                FileUtils.writeCSV(villaName, "D:\\C0620G1-NguyenVanKhanh\\Module2\\src\\Module2_NguyenVanKhanh_casestudy\\Data\\Villa.csv");
                break;
            case 2:
                Scanner scanner2 = new Scanner(System.in);
                String id2, tenDichVu2, dienTichSuDung2, chiPhiThue2, soLuongNguoiThueToiDa2, kieuThue2, soTang2, tieuChuanPhong2;
                do {
                    System.out.println("Input House ID: ");
                    id2 = scanner2.nextLine();
                    check = !valid_Id_House(id2);
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
                    } else
                        check = true;
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
                    check = !valid_Id_Room(id3);
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
                    } else
                        check = true;
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

    public static void addNewCustomer() throws IOException {
        Scanner scanner = new Scanner(System.in);
        String hoVaTen;
        String ngaySinh;
        String gioiTinh;
        String soCMND;
        String sdt;
        String email;
        String loaiKhach;
        String diaChi;

        do {
            try {
                System.out.println("Họ và tên khách hàng: ");
                hoVaTen = scanner.nextLine();
                if (valid_Hovaten(hoVaTen)) break;
                else throw new NameException();
            } catch (NameException e) {
                System.out.print("Tên Khách hàng phải in hoa ký tự đầu tiên trong mỗi từ." + "\n");
            }
        }
        while (true);
        do {
            try {
                System.out.println("Ngày sinh: ");
                ngaySinh = scanner.nextLine();
                if (valid_NgaySinh(ngaySinh)) break;
                else throw new BirthdayException();
            } catch (BirthdayException e) {
                System.out.print("Năm sinh phải lớn 1900 và nhỏ hơn 2002, đúng định dạng dd/mm/yyyy." + "\n");
            }
        }
        while (true);
        do {
            try {
                System.out.println("Giới tính: ");
                gioiTinh = scanner.nextLine();
                if (valid_Gioitinh(gioiTinh)) break;
                else throw new GenderException();
            } catch (GenderException e) {
                System.out.print("Phải là Nữ/Nam/Không xác định." + "\n");
            }
        }
        while (true);
        do {
            try {
                System.out.println("Số CMND: ");
                soCMND = scanner.nextLine();
                if (valid_CMND(soCMND)) break;
                else throw new IdCardException();
            } catch (IdCardException e) {
                System.out.print("CMND phải có 9 chữ số và theo định dạng XXXXXXXXX." + "\n");
            }
        }
        while (true);
        do {
            try {
                System.out.println("Số điện thoại: ");
                sdt = scanner.nextLine();
                if (valid_Sdt(sdt)) break;
                else throw new IdCardException();
            } catch (IdCardException e) {
                System.out.print("Số điện thoại phải có 10 chữ số và theo định dạng XXXXXXXXX." + "\n");
            }
        }
        while (true);
        do {
            try {
                System.out.println("Email: ");
                email = scanner.nextLine();
                if (valid_Email(email)) break;
                else throw new EmailException();
            } catch (EmailException e) {
                System.out.print("Email phải đúng định dạng abc@abc.abc." + "\n");
            }
        }
        while (true);
        System.out.println("Loại khách: ");
        loaiKhach = scanner.nextLine();
        System.out.println("Địa chỉ: ");
        diaChi = scanner.nextLine();
        Customer customer = new Customer(hoVaTen, ngaySinh, gioiTinh, soCMND, sdt, email, loaiKhach, diaChi);
        FileUtils.writeCSV(customer, "D:\\C0620G1-NguyenVanKhanh\\Module2\\src\\Module2_NguyenVanKhanh_casestudy\\Data\\Customer.csv");
    }

    public static void showInfomationCustomer() throws IOException {
        List<String> arrList = readCSV("D:\\C0620G1-NguyenVanKhanh\\Module2\\src\\Module2_NguyenVanKhanh_casestudy\\Data\\Customer.csv");
        ArrayList<Customer> customers = new ArrayList<>();
        while (arrList.size() != 0) {
            Customer customer = new Customer(arrList.get(0), arrList.get(1), arrList.get(2), arrList.get(3), arrList.get(4), arrList.get(5)
                    , arrList.get(6), arrList.get(7));
            customers.add(customer);
            arrList.subList(0, 8).clear();
        }
        customers.sort(new SortCustomer());
        for (Customer customer : customers) {
            customer.showInfomationCustomer();
        }

    }

    public static ArrayList<Customer> arrayListInfomationCustomer() throws IOException {
        List<String> arrList = readCSV("D:\\C0620G1-NguyenVanKhanh\\Module2\\src\\Module2_NguyenVanKhanh_casestudy\\Data\\Customer.csv");
        ArrayList<Customer> customers = new ArrayList<>();
        while (arrList.size() != 0) {
            Customer customer = new Customer(arrList.get(0), arrList.get(1), arrList.get(2), arrList.get(3), arrList.get(4), arrList.get(5)
                    , arrList.get(6), arrList.get(7));
            customers.add(customer);
            arrList.subList(0, 8).clear();
        }
        customers.sort(new SortCustomer());
        return customers;

    }

    public static void addNewBooking() throws IOException {
        ArrayList<Customer> customers = arrayListInfomationCustomer();
        Scanner sc = new Scanner(System.in);
        showInfomationCustomer();
        System.out.println("Lựa chọn khách hàng theo số thứ tự: ");
        String choice = sc.nextLine();
        do {
            if (Integer.parseInt(choice) > 0 && valid_soNguyenDuong(choice)) {
                System.out.println(customers.get(Integer.parseInt(choice) - 1));
                break;
            }
        } while (true);
        System.out.println("1. Booking Villa\n" +
                "2. Booking House\n" +
                "3. Booking Room\n");
        int choice1 = sc.nextInt();
        switch (choice1) {
            case 1:
                List<String> arrList = readCSV("D:\\C0620G1-NguyenVanKhanh\\Module2\\src\\Module2_NguyenVanKhanh_casestudy\\Data\\Villa.csv");
                ArrayList<Villa> villas = new ArrayList<>();
                while (arrList.size() != 0) {
                    Villa villa = new Villa(arrList.get(0), arrList.get(1), arrList.get(2), arrList.get(3), arrList.get(4), arrList.get(5)
                            , arrList.get(6), arrList.get(7), arrList.get(8));
                    villas.add(villa);
                    arrList.subList(0, 9).clear();
                }
                for (Villa villa : villas) {
                    villa.showInfor();
                }
                System.out.println("Nhập số Villa mong muốn theo thứ tự: ");
                int choice2 = sc.nextInt();
                FileUtils.writeCSV(customers.get(Integer.parseInt(choice) - 1), "D:\\C0620G1-NguyenVanKhanh\\Module2\\src\\Module2_NguyenVanKhanh_casestudy\\Data\\Booking.csv");
                FileUtils.writeCSV(villas.get(choice2 - 1), "D:\\C0620G1-NguyenVanKhanh\\Module2\\src\\Module2_NguyenVanKhanh_casestudy\\Data\\Booking.csv");
                System.out.println("Thao tác thành công!");
                break;
            case 2:
                List<String> arrList1 = readCSV("D:\\C0620G1-NguyenVanKhanh\\Module2\\src\\Module2_NguyenVanKhanh_casestudy\\Data\\House.csv");
                ArrayList<House> houses = new ArrayList<>();
                while (arrList1.size() != 0) {
                    House house = new House(arrList1.get(0), arrList1.get(1), arrList1.get(2), arrList1.get(3), arrList1.get(4), arrList1.get(5)
                            , arrList1.get(6), arrList1.get(7));
                    houses.add(house);
                    arrList1.subList(0, 8).clear();
                }
                for (House house : houses) {
                    house.showInfor();
                }
                System.out.println("Nhập số House mong muốn theo thứ tự: ");
                int choice3 = sc.nextInt();
                FileUtils.writeCSV(customers.get(Integer.parseInt(choice) - 1), "D:\\C0620G1-NguyenVanKhanh\\Module2\\src\\Module2_NguyenVanKhanh_casestudy\\Data\\Booking.csv");
                FileUtils.writeCSV(houses.get(choice3 - 1), "D:\\C0620G1-NguyenVanKhanh\\Module2\\src\\Module2_NguyenVanKhanh_casestudy\\Data\\Booking.csv");
                System.out.println("Thao tác thành công!");
                break;
            case 3:
                List<String> arrList2 = readCSV("D:\\C0620G1-NguyenVanKhanh\\Module2\\src\\Module2_NguyenVanKhanh_casestudy\\Data\\Room.csv");
                ArrayList<Room> rooms = new ArrayList<>();
                while (arrList2.size() != 0) {
                    Room room = new Room(arrList2.get(0), arrList2.get(1), arrList2.get(2), arrList2.get(3), arrList2.get(4), arrList2.get(5)
                            , arrList2.get(6));
                    rooms.add(room);
                    arrList2.subList(0, 7).clear();
                }
                for (Room room : rooms) {
                    room.showInfor();
                }
                System.out.println("Nhập số Room mong muốn theo thứ tự: ");
                int choice4 = sc.nextInt();
                FileUtils.writeCSV(customers.get(Integer.parseInt(choice) - 1), "D:\\C0620G1-NguyenVanKhanh\\Module2\\src\\Module2_NguyenVanKhanh_casestudy\\Data\\Booking.csv");
                FileUtils.writeCSV(rooms.get(choice4 - 1), "D:\\C0620G1-NguyenVanKhanh\\Module2\\src\\Module2_NguyenVanKhanh_casestudy\\Data\\Booking.csv");
                System.out.println("Thao tác thành công!");
                break;
        }
    }

    public static void showInfoEmployee() throws IOException {
        List<String> arrList = readCSV("D:\\C0620G1-NguyenVanKhanh\\Module2\\src\\Module2_NguyenVanKhanh_casestudy\\Data\\Employee.csv");
        Map<String, Employee> employees = new LinkedHashMap<>();
        while (arrList.size() != 0) {
            Employee employee = new Employee(arrList.get(0), arrList.get(1), arrList.get(2), arrList.get(3));
            employees.put(arrList.get(0), employee);
            arrList.subList(0, 4).clear();
        }

        for (Map.Entry<String,Employee> employeeEntry:employees.entrySet()) {
            System.out.print(employeeEntry.getValue());
        }

    }

    public static void main(String[] args) throws IOException {
        while (true){
            dislayMainMenu();
        }
    }
}

