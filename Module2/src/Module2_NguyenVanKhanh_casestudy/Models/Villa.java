package Module2_NguyenVanKhanh_casestudy.Models;



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
        System.out.println("House có ID: " + getId() + "\n" +
                "Tên dịch vụ: " + getTenDichVu() + "\n" +
                "Diện tích sử dụng: " + getDienTichSuDung() + "\n" +
                "Chi phí thuê: " + getChiPhiThue() + "\n" +
                "Số lượng người thuê tối đa: " + getSoLuongNguoiThueToiDa() + "\n" +
                "Kiểu thuê: " + getKieuThue() + "\n" +
                "Tiêu chuẩn phòng: " + tieuChuanPhong + "\n" +
                "Số tầng: " + soTang + "\n" +
                "Diện tích hồ bơi: " + dienTichHoBoi);
    }


    @Override
    public String toString() {
        return getId() + "," + getTenDichVu() + "," + getDienTichSuDung() + "," + getChiPhiThue() + "," + getSoLuongNguoiThueToiDa() +
                "," + getKieuThue() + "," + tieuChuanPhong + "," + dienTichHoBoi + "," + soTang + "\n";
    }


}
