package Module2_NguyenVanKhanh_casestudy.Models;

public class Employee {
    private String maSoNV;
    private String hoVaten;
    private String tuoi;
    private String diaChi;


    public String getMaSoNV() {
        return maSoNV;
    }

    public void setMaSoNV(String maSoNV) {
        this.maSoNV = maSoNV;
    }


    public Employee() {
    }

    public Employee(String maSoNV, String hoVaten, String tuoi, String diaChi) {
        this.maSoNV = maSoNV;
        this.hoVaten = hoVaten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
    }

    public String getHoVaten() {
        return hoVaten;
    }

    public void setHoVaten(String hoVaten) {
        this.hoVaten = hoVaten;
    }

    public String getTuoi() {
        return tuoi;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return maSoNV + "," + hoVaten + "," + tuoi + "," + diaChi+"\n";
    }
}

