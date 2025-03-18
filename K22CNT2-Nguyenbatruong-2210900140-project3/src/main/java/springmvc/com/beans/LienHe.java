package springmvc.com.beans;

public class LienHe {
    private int id;
    private String hoTen;
    private String email;
    private String soDienThoai;
    private String noiDung;
    private String ngayGui;

    public LienHe() {
    }

    public LienHe(int id, String hoTen, String email, String soDienThoai, String noiDung, String ngayGui) {
        this.id = id;
        this.hoTen = hoTen;
        this.email = email;
        this.soDienThoai = soDienThoai;
        this.noiDung = noiDung;
        this.ngayGui = ngayGui;
    }

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
    public String getNoiDung() {
        return noiDung;
    }
    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }
    public String getNgayGui() {
        return ngayGui;
    }
    public void setNgayGui(String ngayGui) {
        this.ngayGui = ngayGui;
    }
}
