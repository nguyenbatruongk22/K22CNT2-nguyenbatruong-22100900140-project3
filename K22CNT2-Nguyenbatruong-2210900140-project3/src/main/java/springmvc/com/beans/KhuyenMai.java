package springmvc.com.beans;

import java.math.BigDecimal;
import java.sql.Date;

public class KhuyenMai {
    private int id;
    private String tenKhuyenMai;
    private String loai;
    private BigDecimal giaTri;
    private String moTa;
    private String ngayBatDau;
    private String ngayKetThuc;

    public KhuyenMai() {}

    public KhuyenMai(int id, String tenKhuyenMai, String loai, BigDecimal giaTri, String moTa, String ngayBatDau, String ngayKetThuc) {
        this.id = id;
        this.tenKhuyenMai = tenKhuyenMai;
        this.loai = loai;
        this.giaTri = giaTri;
        this.moTa = moTa;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
    }

    // Getters và Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTenKhuyenMai() { return tenKhuyenMai; }
    public void setTenKhuyenMai(String tenKhuyenMai) { this.tenKhuyenMai = tenKhuyenMai; }

    public String getLoai() { return loai; }
    public void setLoai(String loai) { this.loai = loai; }

    public BigDecimal getGiaTri() { return giaTri; }
    public void setGiaTri(BigDecimal giaTri) { this.giaTri = giaTri; }

    public String getMoTa() { return moTa; }
    public void setMoTa(String moTa) { this.moTa = moTa; }

    public String getNgayBatDau() { return ngayBatDau; }
    public void setNgayBatDau(String ngayBatDau) { this.ngayBatDau = ngayBatDau; }

    public String getNgayKetThuc() { return ngayKetThuc; }
    public void setNgayKetThuc(String ngayKetThuc) { this.ngayKetThuc = ngayKetThuc; }
}
