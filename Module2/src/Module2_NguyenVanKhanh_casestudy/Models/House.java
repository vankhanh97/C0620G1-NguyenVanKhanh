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
        System.out.println("House có ID: " + id + "\n" +
                "Tên dịch vụ: "+tenDichVu+ "\n" +
                "Diện tích Sử Dụng: "+dienTichSuDung+ "\n" +
                "Chi Phí Thuê: "+chiPhiThue+ "\n" +
                "Số lượng người thuê tối đa: "+soLuongNguoiThueToiDa+ "\n" +
                "Kiểu thuê: "+kieuThue+ "\n" +
                "Tiêu chuẩn phòng: "+tieuChuanPhong+ "\n" +
                "Số tầng: "+soTang);
    }

}
