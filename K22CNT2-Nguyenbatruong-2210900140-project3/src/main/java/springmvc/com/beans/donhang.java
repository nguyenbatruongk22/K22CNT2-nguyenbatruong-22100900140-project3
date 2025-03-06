package springmvc.com.beans;

import java.util.Date;

public class donhang {
    private int id;
    private int maKhachHang;  // Mã khách hàng đặt đơn hàng
    private Date ngayDat;      // Ngày đặt hàng
    private double tongTien;   // Tổng tiền của đơn hàng
    private String trangThai;  // Trạng thái đơn hàng (Đang xử lý, Hoàn thành, Đã hủy)

    // Constructor mặc định
    public donhang() {
        super();
    }

    // Constructor có tham số
    public donhang(int id, int maKhachHang, Date ngayDat, double tongTien, String trangThai) {
        super();
        this.id = id;
        this.maKhachHang = maKhachHang;
        this.ngayDat = ngayDat;
        this.tongTien = tongTien;
        this.trangThai = trangThai;
    }

    // Getter và Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(int maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public Date getNgayDat() {
        return ngayDat;
    }

    public void setNgayDat(Date ngayDat) {
        this.ngayDat = ngayDat;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    // Ghi đè phương thức toString để hiển thị thông tin đơn hàng
    @Override
    public String toString() {
        return "DonHang [id=" + id + ", maKhachHang=" + maKhachHang + ", ngayDat=" + ngayDat 
                + ", tongTien=" + tongTien + ", trangThai=" + trangThai + "]";
    }
}
