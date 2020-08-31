package Module2_NguyenVanKhanh_casestudy.Models;

public abstract class Services {
    public String id;
    public String tenDichVu;
    public String dienTichSuDung;
    public String chiPhiThue;
    public String soLuongNguoiThueToiDa;
    public String kieuThue;


    public Services(String id, String tenDichVu, String dienTichSuDung, String chiPhiThue, String soLuongNguoiThueToiDa, String kieuThue) {
        this.id = id;
        this.tenDichVu = tenDichVu;
        this.dienTichSuDung = dienTichSuDung;
        this.chiPhiThue = chiPhiThue;
        this.soLuongNguoiThueToiDa = soLuongNguoiThueToiDa;
        this.kieuThue = kieuThue;
    }

    public Services() {
    }




    public abstract void showInfor();
    }

