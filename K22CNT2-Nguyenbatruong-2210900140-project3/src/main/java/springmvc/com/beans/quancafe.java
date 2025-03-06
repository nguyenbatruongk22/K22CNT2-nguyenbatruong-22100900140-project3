package springmvc.com.beans;

public class quancafe {
    private int id;                // Mã quán cà phê
    private String tenQuan;        // Tên quán cà phê
    private String diaChi;         // Địa chỉ quán
    private String soDienThoai;    // Số điện thoại liên hệ
    private String gioMoCua;       // Giờ mở cửa
    private String gioDongCua;     // Giờ đóng cửa
    private String moTa;           // Mô tả về quán
    private String ngayTao;        // Ngày tạo quán trong hệ thống
    private String hinhAnh;        // Ảnh đại diện quán cà phê

    // Constructor mặc định
    public  quancafe () {
        super();
    }

    // Constructor có tham số
    public  quancafe (int id, String tenQuan, String diaChi, String soDienThoai, 
                    String gioMoCua, String gioDongCua, String moTa, String ngayTao, String hinhAnh) {
        super();
        this.id = id;
        this.tenQuan = tenQuan;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.gioMoCua = gioMoCua;
        this.gioDongCua = gioDongCua;
        this.moTa = moTa;
        this.ngayTao = ngayTao;
        this.hinhAnh = hinhAnh;
    }

    // Getter và Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenQuan() {
        return tenQuan;
    }

    public void setTenQuan(String tenQuan) {
        this.tenQuan = tenQuan;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getGioMoCua() {
        return gioMoCua;
    }

    public void setGioMoCua(String gioMoCua) {
        this.gioMoCua = gioMoCua;
    }

    public String getGioDongCua() {
        return gioDongCua;
    }

    public void setGioDongCua(String gioDongCua) {
        this.gioDongCua = gioDongCua;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(String ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    // Phương thức toString() để hiển thị thông tin quán cà phê
    @Override
    public String toString() {
        return "QuanCafe [id=" + id + ", tenQuan=" + tenQuan + ", diaChi=" + diaChi 
                + ", soDienThoai=" + soDienThoai + ", gioMoCua=" + gioMoCua 
                + ", gioDongCua=" + gioDongCua + ", moTa=" + moTa 
                + ", ngayTao=" + ngayTao + ", hinhAnh=" + hinhAnh + "]";
    }
}
