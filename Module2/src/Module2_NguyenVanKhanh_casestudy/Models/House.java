package Module2_NguyenVanKhanh_casestudy.Models;


public class House extends Services {
    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public String getSoTang() {
        return soTang;
    }

    public void setSoTang(String soTang) {
        this.soTang = soTang;
    }

    private String tieuChuanPhong;

    private String soTang;


    public House() {
    }

    public House(String id, String tenDichVu, String dienTichSuDung, String chiPhiThue, String soLuongNguoiThueToiDa, String kieuThue,
                 String tieuChuanPhong, String soTang) {
        super(id, tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiThueToiDa, kieuThue);

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
                "Số tầng: " + soTang);
    }

    @Override
    public String toString() {
        return getId() + "," + getTenDichVu() + "," + getDienTichSuDung() + "," + getChiPhiThue() + "," + getSoLuongNguoiThueToiDa() +
                "," + getKieuThue() + "," + tieuChuanPhong + "," + soTang + "\n";
    }

}
