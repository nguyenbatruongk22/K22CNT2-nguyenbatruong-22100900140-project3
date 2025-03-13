package springmvc.com.beans;

public class ThucDon {
    private String tenMon;
    private String hinhAnh;
    private String moTa;

    public ThucDon() {
    }

    public ThucDon(String tenMon, String hinhAnh, String moTa) {
        this.tenMon = tenMon;
        this.hinhAnh = hinhAnh;
        this.moTa = moTa;
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
}
