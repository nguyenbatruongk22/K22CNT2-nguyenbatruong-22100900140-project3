package springmvc.com.beans;

public class loaicafe {
    private int id;              // Mã loại cà phê
    private String tenLoai;      // Tên loại cà phê
    private String moTa;         // Mô tả về loại cà phê
    private String ngayTao;      // Ngày thêm vào danh sách
    private String hinhAnh;      // Đường dẫn ảnh của loại cà phê

    // Constructor mặc định
    public loaicafe() {
        super();
    }

    // Constructor có tham số
    public loaicafe(int id, String tenLoai, String moTa, String ngayTao, String hinhAnh) {
        super();
        this.id = id;
        this.tenLoai = tenLoai;
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

    public String getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
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

    // Phương thức toString() để hiển thị thông tin loại cà phê
    @Override
    public String toString() {
        return "LoaiCafe [id=" + id + ", tenLoai=" + tenLoai + ", moTa=" + moTa 
                + ", ngayTao=" + ngayTao + ", hinhAnh=" + hinhAnh + "]";
    }
}

