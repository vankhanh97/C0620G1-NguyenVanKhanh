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
        System.out.println("House có ID: " + id + "\n" +
                "Tên dịch vụ: " + tenDichVu + "\n" +
                "Diện tích sử dụng: " + dienTichSuDung + "\n" +
                "Chi phí thuê: " + chiPhiThue + "\n" +
                "Số lượng người thuê tối đa: " + soLuongNguoiThueToiDa + "\n" +
                "Kiểu thuê: " + kieuThue + "\n" + "Dịch vụ miễn phí đi kèm: " + dichVuMienPhi);

    }

    @Override
    public String toString() {
        return id + "," + tenDichVu + "," + dienTichSuDung + "," + soLuongNguoiThueToiDa +
                "," + kieuThue + "," + dichVuMienPhi + "\n";
    }
}
