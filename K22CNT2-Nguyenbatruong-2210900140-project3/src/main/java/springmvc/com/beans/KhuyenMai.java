package springmvc.com.beans;

public class KhuyenMai {
    private String tenKhuyenMai;
    private String hinhAnh;
    private String moTa;
    private String ngayBatDau;
    private String ngayKetThuc;

    public KhuyenMai() {
    }

    public KhuyenMai(String tenKhuyenMai, String hinhAnh, String moTa, String ngayBatDau, String ngayKetThuc) {
        this.tenKhuyenMai = tenKhuyenMai;
        this.hinhAnh = hinhAnh;
        this.moTa = moTa;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
    }

    public String getTenKhuyenMai() {
        return tenKhuyenMai;
    }

    public void setTenKhuyenMai(String tenKhuyenMai) {
        this.tenKhuyenMai = tenKhuyenMai;
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

    public String getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(String ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public String getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(String ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }
}
