package springmvc.com.beans;

public class quanlycafe {
    private int userId;
    private String id;
    private String tenQuan;
    private String diaChi;
    private String soDienThoai;
    private String gioMoCua;
    private String moTa;
    private double role;
    private String createAt;

    // Constructor mặc định
    public quanlycafe() {
    }

    // Constructor có tham số
    public quanlycafe(int userId, String id, String tenQuan, String diaChi, String soDienThoai, 
                      String gioMoCua, String moTa, double role, String createAt) {
        this.userId = userId;
        this.id = id;
        this.tenQuan = tenQuan;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.gioMoCua = gioMoCua;
        this.moTa = moTa;
        this.role = role;
        this.createAt = createAt;
    }

    // Getter và Setter
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public double getRole() {
        return role;
    }

    public void setRole(double role) {
        this.role = role;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }
}
