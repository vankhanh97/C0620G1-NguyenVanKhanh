package Module2_NguyenVanKhanh_casestudy.Models;

public abstract class Services{
   private String id;
    private String tenDichVu;
    private String dienTichSuDung;
    private String chiPhiThue;
    private String soLuongNguoiThueToiDa;
    private String kieuThue;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public String getDienTichSuDung() {
        return dienTichSuDung;
    }

    public void setDienTichSuDung(String dienTichSuDung) {
        this.dienTichSuDung = dienTichSuDung;
    }

    public String getChiPhiThue() {
        return chiPhiThue;
    }

    public void setChiPhiThue(String chiPhiThue) {
        this.chiPhiThue = chiPhiThue;
    }

    public String getSoLuongNguoiThueToiDa() {
        return soLuongNguoiThueToiDa;
    }

    public void setSoLuongNguoiThueToiDa(String soLuongNguoiThueToiDa) {
        this.soLuongNguoiThueToiDa = soLuongNguoiThueToiDa;
    }

    public String getKieuThue() {
        return kieuThue;
    }

    public void setKieuThue(String kieuThue) {
        this.kieuThue = kieuThue;
    }




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


//    @Override
//    public String toString() {
//        return id + "," + tenDichVu + "," + dienTichSuDung + "," + chiPhiThue + "," + soLuongNguoiThueToiDa +
//                "," + kieuThue + "," +"\n";
//    }

    public abstract void showInfor();
    }

