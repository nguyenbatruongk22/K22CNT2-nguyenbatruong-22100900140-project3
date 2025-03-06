package springmvc.com.beans;

public class chitietdonhang {
    private int id;
    private int maDonHang;  // Mã đơn hàng
    private int maSanPham;  // Mã sản phẩm
    private int soLuong;    // Số lượng sản phẩm
    private double giaBan;  // Giá bán một đơn vị sản phẩm
    private double thanhTien; // Tổng tiền (tự động tính toán)

    // Constructor mặc định
    public chitietdonhang() {
        super();
    }

    // Constructor có tham số
    public chitietdonhang(int id, int maDonHang, int maSanPham, int soLuong, double giaBan) {
        super();
        this.id = id;
        this.maDonHang = maDonHang;
        this.maSanPham = maSanPham;
        this.soLuong = soLuong;
        this.giaBan = giaBan;
        this.thanhTien = tinhThanhTien(); // Tính tổng tiền khi khởi tạo
    }

    // Getter và Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMaDonHang() {
        return maDonHang;
    }

    public void setMaDonHang(int maDonHang) {
        this.maDonHang = maDonHang;
    }

    public int getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(int maSanPham) {
        this.maSanPham = maSanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
        this.thanhTien = tinhThanhTien(); // Cập nhật tổng tiền khi thay đổi số lượng
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
        this.thanhTien = tinhThanhTien(); // Cập nhật tổng tiền khi thay đổi giá bán
    }

    public double getThanhTien() {
        return thanhTien;
    }

    // Phương thức tính tổng tiền
    private double tinhThanhTien() {
        return this.soLuong * this.giaBan;
    }

    // Ghi đè phương thức toString để hiển thị thông tin đơn hàng
    @Override
    public String toString() {
        return "ChiTietDonHang [id=" + id + ", maDonHang=" + maDonHang + ", maSanPham=" + maSanPham 
                + ", soLuong=" + soLuong + ", giaBan=" + giaBan + ", thanhTien=" + thanhTien + "]";
    }
}
