package Module2_NguyenVanKhanh_casestudy.casestudy.src.Models;


import Module2_NguyenVanKhanh_casestudy.casestudy.src.Task1.Services;

public class Room extends Services {
    private String dichVuMienPhi;

    public String getDichVuMienPhi() {
        return dichVuMienPhi;
    }

    public void setDichVuMienPhi(String dichVuMienPhi) {
        this.dichVuMienPhi = dichVuMienPhi;
    }

    public Room() {
    }

    public Room(String id, String tenDichVu, String dienTichSuDung, String chiPhiThue, String soLuongNguoiThueToiDa, String kieuThue ,String dichVuMienPhi) {
        super(id, tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiThueToiDa, kieuThue);
        this.dichVuMienPhi = dichVuMienPhi;

    }

    @Override
    public void showInfor() {
        System.out.println("House có ID: " + id + "\n" +
                "Tên dịch vụ: "+tenDichVu+ "\n" +
                "Diện tích Sử Dụng: "+dienTichSuDung+ "\n" +
                "Chi Phí Thuê: "+chiPhiThue+ "\n" +
                "Số lượng người thuê tối đa: "+soLuongNguoiThueToiDa+ "\n" +
                "Kiểu thuê: "+kieuThue+ "\n"+"Dịch vụ miễn phí đi kèm: "+dichVuMienPhi);

    }
}
