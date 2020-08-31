package Module2_NguyenVanKhanh_casestudy.casestudy.src.Models;

import Module2_NguyenVanKhanh_casestudy.casestudy.src.Task1.Services;


public class Villa extends Services {
    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public String getDienTichHoBoi() {
        return dienTichHoBoi;
    }

    public void setDienTichHoBoi(String dienTichHoBoi) {
        this.dienTichHoBoi = dienTichHoBoi;
    }

    public String getSoTang() {
        return soTang;
    }

    public void setSoTang(String soTang) {
        this.soTang = soTang;
    }

    private String tieuChuanPhong;
    private String dienTichHoBoi;
    private String soTang;
    public Villa() {
    }

    public Villa(String id, String tenDichVu, String dienTichSuDung, String chiPhiThue, String soLuongNguoiThueToiDa, String kieuThue,
                 String tieuChuanPhong, String dienTichHoBoi, String soTang) {
        super(id, tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiThueToiDa, kieuThue);
        this.dienTichHoBoi = dienTichHoBoi;
        this.tieuChuanPhong = tieuChuanPhong;
        this.soTang = soTang;
    }

    @Override
    public void showInfor() {
        System.out.println("House có ID: " + id + "\n" +
                "Tên dịch vụ: "+tenDichVu+ "\n" +
                "Diện tích Sử Dụng: "+dienTichSuDung+ "\n" +
                "Chi Phí Thuê: "+chiPhiThue+ "\n" +
                "Số lượng người thuê tối đa: "+soLuongNguoiThueToiDa+ "\n" +
                "Kiểu thuê: "+kieuThue+ "\n" +
                "Tiêu chuẩn phòng: "+tieuChuanPhong+ "\n" +
                "Số tầng: "+soTang+"\n"+
                "Diện tích hồ bơi: "+dienTichHoBoi);
    }
}
