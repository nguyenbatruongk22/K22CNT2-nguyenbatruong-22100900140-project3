package springmvc.com.beans;

public class khachhang {
    private int id;              // Mã khách hàng
    private String hoTen;        // Họ và tên khách hàng
    private String email;        // Email khách hàng
    private String soDienThoai;  // Số điện thoại khách hàng
    private String diaChi;       // Địa chỉ khách hàng
    private String ngayDangKy;   // Ngày đăng ký tài khoản
    private int diemTichLuy;     // Điểm tích lũy của khách hàng

    // Constructor mặc định
    public khachhang() {
        super();
    }

    // Constructor có tham số
    public khachhang(int id, String hoTen, String email, String soDienThoai, String diaChi, String ngayDangKy, int diemTichLuy) {
        super();
        this.id = id;
        this.hoTen = hoTen;
        this.email = email;
        this.soDienThoai = soDienThoai;
        this.diaChi = diaChi;
        this.ngayDangKy = ngayDangKy;
        this.diemTichLuy = diemTichLuy;
    }

    // Getter và Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getNgayDangKy() {
        return ngayDangKy;
    }

    public void setNgayDangKy(String ngayDangKy) {
        this.ngayDangKy = ngayDangKy;
    }

    public int getDiemTichLuy() {
        return diemTichLuy;
    }

    public void setDiemTichLuy(int diemTichLuy) {
        this.diemTichLuy = diemTichLuy;
    }

    // Phương thức toString() để hiển thị thông tin khách hàng
    @Override
    public String toString() {
        return "KhachHang [id=" + id + ", hoTen=" + hoTen + ", email=" + email 
                + ", soDienThoai=" + soDienThoai + ", diaChi=" + diaChi 
                + ", ngayDangKy=" + ngayDangKy + ", diemTichLuy=" + diemTichLuy + "]";
    }
}
