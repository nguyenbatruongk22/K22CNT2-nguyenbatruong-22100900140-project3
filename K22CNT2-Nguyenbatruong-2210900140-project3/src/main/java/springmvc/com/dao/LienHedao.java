package springmvc.com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import springmvc.com.beans.LienHe;

public class LienHedao {
    private JdbcTemplate template;

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    // Thêm mới liên hệ
    public int save(LienHe lh) {
        String sql = "INSERT INTO lienhe (ho_ten, email, so_dien_thoai, noi_dung, ngay_gui) VALUES (?, ?, ?, ?, ?)";
        return template.update(sql, lh.getHoTen(), lh.getEmail(), lh.getSoDienThoai(), lh.getNoiDung(), lh.getNgayGui());
    }

    // Cập nhật thông tin liên hệ
    public int update(LienHe lh) {
        String sql = "UPDATE lienhe SET ho_ten=?, email=?, so_dien_thoai=?, noi_dung=?, ngay_gui=? WHERE id=?";
        return template.update(sql, lh.getHoTen(), lh.getEmail(), lh.getSoDienThoai(), lh.getNoiDung(), lh.getNgayGui(), lh.getId());
    }

    // Xóa liên hệ theo ID
    public int delete(int id) {
        String sql = "DELETE FROM lienhe WHERE id=?";
        return template.update(sql, id);
    }

    // Lấy danh sách tất cả liên hệ
    public List<LienHe> getAll() {
        String sql = "SELECT * FROM lienhe";
        return template.query(sql, new RowMapper<LienHe>() {
            @Override
            public LienHe mapRow(ResultSet rs, int rowNum) throws SQLException {
                LienHe lh = new LienHe();
                lh.setId(rs.getInt("id"));
                lh.setHoTen(rs.getString("ho_ten"));
                lh.setEmail(rs.getString("email"));
                lh.setSoDienThoai(rs.getString("so_dien_thoai"));
                lh.setNoiDung(rs.getString("noi_dung"));
                // Chuyển đổi TIMESTAMP sang String
                java.sql.Timestamp ngayGui = rs.getTimestamp("ngay_gui");
                lh.setNgayGui(ngayGui != null ? ngayGui.toString() : null);
                return lh;
            }
        });
    }

    // Lấy liên hệ theo ID
    public LienHe getById(int id) {
        String sql = "SELECT * FROM lienhe WHERE id=?";
        return template.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper<>(LienHe.class));
    }
}
