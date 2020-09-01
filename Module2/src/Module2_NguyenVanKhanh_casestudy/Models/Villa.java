package Module2_NguyenVanKhanh_casestudy.Models;


import Module2_NguyenVanKhanh_casestudy.Models.Services;

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
                "Tên dịch vụ: " + tenDichVu + "\n" +
                "Diện tích sử dụng: " + dienTichSuDung + "\n" +
                "Chi phí thuê: " + chiPhiThue + "\n" +
                "Số lượng người thuê tối đa: " + soLuongNguoiThueToiDa + "\n" +
                "Kiểu thuê: " + kieuThue + "\n" +
                "Tiêu chuẩn phòng: " + tieuChuanPhong + "\n" +
                "Số tầng: " + soTang + "\n" +
                "Diện tích hồ bơi: " + dienTichHoBoi);
    }


    @Override
    public String toString() {
        return id + "," + tenDichVu + "," + dienTichSuDung + ","+chiPhiThue +","+ soLuongNguoiThueToiDa +
                "," + kieuThue + "," + tieuChuanPhong + "," + dienTichHoBoi + "," + soTang+"\n";
    }
}
