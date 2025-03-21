package springmvc.com.beans;

public class ThucDon {
    private int id;
    private String loai;
    private String tenMon;
    private String hinhAnh;
    private String danhMuc;
    private String moTa;
    private int gia;

    public ThucDon() {
        super();
    }

    public ThucDon(int id, String tenMon, String hinhAnh, String danhMuc, String moTa, int gia) {
        super();
        this.id = id;
        this.tenMon = tenMon;
        this.hinhAnh = hinhAnh;
        this.danhMuc = danhMuc;
        this.moTa = moTa;
        this.gia = gia;
    }

    // Getter và Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getDanhMuc() {
        return danhMuc;
    }

    public void setDanhMuc(String danhMuc) {
        this.danhMuc = danhMuc;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }
    public String getLoai() {
        return loai;
    }
    public void setLoai(String loai) {
        this.loai = loai;
    }
}