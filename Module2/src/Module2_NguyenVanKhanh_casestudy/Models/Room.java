package Module2_NguyenVanKhanh_casestudy.Models;


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

    public Room(String id, String tenDichVu, String dienTichSuDung, String chiPhiThue, String soLuongNguoiThueToiDa, String kieuThue, String dichVuMienPhi) {
        super(id, tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiThueToiDa, kieuThue);
        this.dichVuMienPhi = dichVuMienPhi;

    }

    @Override
    public void showInfor() {
        System.out.println("House có ID: " + getId() + "\n" +
                "Tên dịch vụ: " + getTenDichVu() + "\n" +
                "Diện tích sử dụng: " + getDienTichSuDung() + "\n" +
                "Chi phí thuê: " + getChiPhiThue() + "\n" +
                "Số lượng người thuê tối đa: " + getSoLuongNguoiThueToiDa() + "\n" +
                "Kiểu thuê: " + getKieuThue() + "\n" + "Dịch vụ miễn phí đi kèm: " + dichVuMienPhi);

    }

    @Override
    public String toString() {
        return getId() + "," + getTenDichVu() + "," + getDienTichSuDung() + "," + getChiPhiThue() + "," + getSoLuongNguoiThueToiDa() +
                "," + getKieuThue() + "," + dichVuMienPhi + "\n";
    }
}
