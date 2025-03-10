package springmvc.com.beans;

import java.util.Date;

public class baiviet {
    private int id;
    private String tieuDe;
    private String noiDung;
    private String hinhAnh;
    private Date ngayDang;
    private String tacGia;

    // Constructor mặc định
    public baiviet() {
        super();
    }

    // Constructor có tham số
    public baiviet(int id, String tieuDe, String noiDung, String hinhAnh, Date ngayDang, String tacGia) {
        super();
        this.id = id;
        this.tieuDe = tieuDe;
        this.noiDung = noiDung;
        this.hinhAnh = hinhAnh;
        this.ngayDang = ngayDang;
        this.tacGia = tacGia;
    }

    // Getter và Setter cho các thuộc tính
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public Date getNgayDang() {
        return ngayDang;
    }

    public void setNgayDang(Date ngayDang) {
        this.ngayDang = ngayDang;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    // Ghi đè phương thức toString để hiển thị thông tin bài viết
    @Override
    public String toString() {
        return "BaiViet [id=" + id + ", tieuDe=" + tieuDe + ", tacGia=" + tacGia + ", ngayDang=" + ngayDang + "]";
    }
}
