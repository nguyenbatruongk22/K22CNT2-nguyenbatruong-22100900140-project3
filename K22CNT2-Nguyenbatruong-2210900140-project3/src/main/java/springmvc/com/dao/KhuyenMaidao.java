package springmvc.com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import springmvc.com.beans.KhuyenMai;

@Repository
public class KhuyenMaidao {
    private final JdbcTemplate template;

    public KhuyenMaidao(JdbcTemplate template) {
        this.template = template;
    }
    

    // ✅ Thêm khuyến mãi
    public int save(KhuyenMai km) {
        String sql = "INSERT INTO khuyenmai (ten_khuyenmai, loai, gia_tri, mo_ta, ngay_bat_dau, ngay_ket_thuc) VALUES (?, ?, ?, ?, ?, ?)";
        return template.update(sql, km.getTenKhuyenMai(), km.getLoai(), km.getGiaTri(), km.getMoTa(), km.getNgayBatDau(), km.getNgayKetThuc());
    }

    // ✅ Cập nhật khuyến mãi
    public int update(KhuyenMai km) {
        String sql = "UPDATE khuyenmai SET ten_khuyenmai=?, loai=?, gia_tri=?, mo_ta=?, ngay_bat_dau=?, ngay_ket_thuc=? WHERE id=?";
        return template.update(sql, km.getTenKhuyenMai(), km.getLoai(), km.getGiaTri(), km.getMoTa(), km.getNgayBatDau(), km.getNgayKetThuc(), km.getId());
    }

    // ✅ Xóa khuyến mãi
    public int delete(int id) {
        String sql = "DELETE FROM khuyenmai WHERE id=?";
        return template.update(sql, id);
    }

    // ✅ Lấy danh sách tất cả khuyến mãi
    public List<KhuyenMai> getAll() {
        return template.query("SELECT * FROM khuyenmai", new RowMapper<KhuyenMai>() {
            public KhuyenMai mapRow(ResultSet rs, int rowNum) throws SQLException {
                return new KhuyenMai(
                    rs.getInt("id"),
                    rs.getString("ten_khuyen_mai"),
                    rs.getString("loai"),
                    rs.getBigDecimal("gia_tri"),
                    rs.getString("mo_ta"),
                    rs.getString("ngay_bat_dau"),
                    rs.getString("ngay_ket_thuc")
                );
            }
        });
    }

    // ✅ Lấy khuyến mãi theo ID
    public KhuyenMai getById(int id) {
        String sql = "SELECT * FROM khuyenmai WHERE id=?";
        return template.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper<>(KhuyenMai.class));
    }
}
