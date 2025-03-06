package springmvc.com.beans;

public class hinhanhcafe {
    private int id;           // Mã hình ảnh
    private int maQuanCafe;   // Mã quán cà phê hoặc sản phẩm liên quan
    private String tenHinh;   // Tên hình ảnh
    private String duongDan;  // Đường dẫn hình ảnh (URL hoặc đường dẫn trong hệ thống)
    private String moTa;      // Mô tả hình ảnh

    // Constructor mặc định
    public hinhanhcafe() {
        super();
    }

    // Constructor có tham số
    public hinhanhcafe(int id, int maQuanCafe, String tenHinh, String duongDan, String moTa) {
        super();
        this.id = id;
        this.maQuanCafe = maQuanCafe;
        this.tenHinh = tenHinh;
        this.duongDan = duongDan;
        this.moTa = moTa;
    }

    // Getter và Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMaQuanCafe() {
        return maQuanCafe;
    }

    public void setMaQuanCafe(int maQuanCafe) {
        this.maQuanCafe = maQuanCafe;
    }

    public String getTenHinh() {
        return tenHinh;
    }

    public void setTenHinh(String tenHinh) {
        this.tenHinh = tenHinh;
    }

    public String getDuongDan() {
        return duongDan;
    }

    public void setDuongDan(String duongDan) {
        this.duongDan = duongDan;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    // Phương thức toString() để hiển thị thông tin hình ảnh
    @Override
    public String toString() {
        return "HinhAnhCafe [id=" + id + ", maQuanCafe=" + maQuanCafe + ", tenHinh=" + tenHinh 
                + ", duongDan=" + duongDan + ", moTa=" + moTa + "]";
    }
}
