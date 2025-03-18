package springmvc.com.beans;

public class HeThongCuaHang {
    private int id;
    private String tenCuaHang;
    private String diaChi;
    private String soDienThoai;
    private String gioMoCua;
    private String gioDongCua;

    public HeThongCuaHang() {
    }

    public HeThongCuaHang(int id, String tenCuaHang, String diaChi, String soDienThoai, String gioMoCua, String gioDongCua) {
        this.id = id;
        this.tenCuaHang = tenCuaHang;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.gioMoCua = gioMoCua;
        this.gioDongCua = gioDongCua;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
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
}
