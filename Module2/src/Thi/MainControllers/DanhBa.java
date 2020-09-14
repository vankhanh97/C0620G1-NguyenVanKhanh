package Thi.MainControllers;

public class DanhBa {
    private String soDienThoai;
    private String nhomDanhBa;
    private String hoTen;
    private String gioiTinh;
    private String diaChi;
    private String ngaySinh;
    private String email;

    public DanhBa() {
    }

    public DanhBa(String soDienThoai, String nhomDanhBa, String hoTen, String gioiTinh, String diaChi, String ngaySinh, String email) {
        this.soDienThoai = soDienThoai;
        this.nhomDanhBa = nhomDanhBa;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.ngaySinh = ngaySinh;
        this.email = email;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getNhomDanhBa() {
        return nhomDanhBa;
    }

    public void setNhomDanhBa(String nhomDanhBa) {
        this.nhomDanhBa = nhomDanhBa;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void hienThiDanhBa() {
        System.out.println("---------------------------------------------------------");
        System.out.println("Số điện thoại: " + getSoDienThoai() + "\n" +
                "Nhóm của danh bạ: " + getNhomDanhBa() + "\n" +
                "Họ và Tên: " + getHoTen() + "\n" +
                "Giới tính: " + getGioiTinh() + "\n" +
                "Địa chỉ: " + getDiaChi() + "\n" +
                "Ngày sinh: " + getNgaySinh() + "\n" +
                "Email: " + getEmail() + "\n");
    }

    @Override
    public String toString() {
        return soDienThoai + "," + nhomDanhBa + "," + hoTen + "," + gioiTinh + "," + diaChi + "," + ngaySinh + "," + email + "\n";
    }
}
