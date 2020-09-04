package Module2_NguyenVanKhanh_casestudy.Models;

public class Customer{
    private String hoVaTen;
    private String ngaySinh;
    private String gioiTinh;
    private String soCMND;
    private String sdt;
    private String email;
    private String loaiKhach;
    private String diaChi;

    public Customer(String hoVaTen, String ngaySinh, String gioiTinh, String soCMND, String sdt, String email, String loaiKhach, String diaChi) {
        this.hoVaTen = hoVaTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.soCMND = soCMND;
        this.sdt = sdt;
        this.email = email;
        this.loaiKhach = loaiKhach;
        this.diaChi = diaChi;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(String soCMND) {
        this.soCMND = soCMND;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLoaiKhach() {
        return loaiKhach;
    }

    public void setLoaiKhach(String loaiKhach) {
        this.loaiKhach = loaiKhach;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return hoVaTen + ',' + ngaySinh + ',' + gioiTinh + ',' + soCMND + ',' + sdt + ',' + email + ',' +
                loaiKhach + ',' + diaChi + "\n";
    }

    public void showInfomationCustomer() {
        System.out.println("Khách hàng : " + hoVaTen + "\n" +
                "Ngày sinh: " + ngaySinh + "\n" +
                "Giới tính: " + gioiTinh + "\n" +
                "Số CMND: " + soCMND + "\n" +
                "Số điện thoại: " + sdt + "\n" +
                "Email: " + email + "\n" +
                "Loại khách hàng: " + loaiKhach + "\n" +
                "Địa chỉ: " + diaChi);

    }}

