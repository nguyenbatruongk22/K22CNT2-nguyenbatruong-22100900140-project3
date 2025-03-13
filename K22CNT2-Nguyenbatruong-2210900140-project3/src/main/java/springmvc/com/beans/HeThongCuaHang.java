package springmvc.com.beans;

public class HeThongCuaHang {
    private String tenCuaHang;
    private String diaChi;
    private String soDienThoai;
    private String hinhAnh;
    
    public HeThongCuaHang() {
    }

    public HeThongCuaHang(String tenCuaHang, String diaChi, String soDienThoai, String hinhAnh) {
        this.tenCuaHang = tenCuaHang;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.hinhAnh = hinhAnh;
    }

    public String getTenCuaHang() {
        return tenCuaHang;
    }

    public void setTenCuaHang(String tenCuaHang) {
        this.tenCuaHang = tenCuaHang;
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

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }
}
