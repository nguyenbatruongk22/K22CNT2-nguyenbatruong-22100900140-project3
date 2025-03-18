package springmvc.com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import springmvc.com.beans.HeThongCuaHang;

public class HeThongCuaHangdao {
    private JdbcTemplate template;

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    // Thêm mới cửa hàng
    public int save(HeThongCuaHang ht) {
        String sql = "INSERT INTO hethongcuahang (ten_cua_hang, dia_chi, so_dien_thoai, gio_mo_cua, gio_dong_cua) VALUES (?, ?, ?, ?, ?)";
        return template.update(sql, ht.getTenCuaHang(), ht.getDiaChi(), ht.getSoDienThoai(), ht.getGioMoCua(), ht.getGioDongCua());
    }

    // Cập nhật thông tin cửa hàng
    public int update(HeThongCuaHang ht) {
        String sql = "UPDATE hethongcuahang SET ten_cua_hang=?, dia_chi=?, so_dien_thoai=?, gio_mo_cua=?, gio_dong_cua=? WHERE id=?";
        return template.update(sql, ht.getTenCuaHang(), ht.getDiaChi(), ht.getSoDienThoai(), ht.getGioMoCua(), ht.getGioDongCua(), ht.getId());
    }

    // Xóa cửa hàng theo ID
    public int delete(int id) {
        String sql = "DELETE FROM hethongcuahang WHERE id=?";
        return template.update(sql, id);
    }

    // Lấy danh sách tất cả cửa hàng
    public List<HeThongCuaHang> getAll() {
        String sql = "SELECT * FROM hethongcuahang";
        return template.query(sql, new RowMapper<HeThongCuaHang>() {
            @Override
            public HeThongCuaHang mapRow(ResultSet rs, int rowNum) throws SQLException {
                HeThongCuaHang ht = new HeThongCuaHang();
                ht.setId(rs.getInt("id"));
                ht.setTenCuaHang(rs.getString("ten_cua_hang"));
                ht.setDiaChi(rs.getString("dia_chi"));
                ht.setSoDienThoai(rs.getString("so_dien_thoai"));
                // Chuyển đổi TIME sang String
                java.sql.Time gioMo = rs.getTime("gio_mo_cua");
                ht.setGioMoCua(gioMo != null ? gioMo.toString() : null);
                java.sql.Time gioDong = rs.getTime("gio_dong_cua");
                ht.setGioDongCua(gioDong != null ? gioDong.toString() : null);
                return ht;
            }
        });
    }

    // Lấy cửa hàng theo ID
    public HeThongCuaHang getById(int id) {
        String sql = "SELECT * FROM hethongcuahang WHERE id=?";
        return template.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper<>(HeThongCuaHang.class));
    }
}
