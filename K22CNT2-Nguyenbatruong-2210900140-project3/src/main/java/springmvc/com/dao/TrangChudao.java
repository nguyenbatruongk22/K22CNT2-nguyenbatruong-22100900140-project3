package springmvc.com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import spring.com.beans.TrangChu;

public class TrangChudao {
    JdbcTemplate template;

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    public int save(TrangChu tc) {
        String sql = "INSERT INTO trangchu (tieu_de, noi_dung, hinh_anh) VALUES (?, ?, ?)";
        return template.update(sql, tc.getTieuDe(), tc.getNoiDung(), tc.getHinhAnh());
    }

    public int update(TrangChu tc) {
        String sql = "UPDATE trangchu SET tieu_de=?, noi_dung=?, hinh_anh=? WHERE id=?";
        return template.update(sql, tc.getTieuDe(), tc.getNoiDung(), tc.getHinhAnh(), tc.getId());
    }

    public int delete(int id) {
        String sql = "DELETE FROM trangchu WHERE id=?";
        return template.update(sql, id);
    }

    public TrangChu getById(int id) {
        String sql = "SELECT * FROM trangchu WHERE id=?";
        return template.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper<>(TrangChu.class));
    }

    public List<TrangChudao> getAll() {
        return template.query("SELECT * FROM trangchu", new RowMapper<TrangChu>() {
            public TrangChudao mapRow(ResultSet rs, int row) throws SQLException {
                TrangChu tc = new TrangChu();
                tc.setId(rs.getInt("id"));
                tc.setTieuDe(rs.getString("tieu_de"));
                tc.setNoiDung(rs.getString("noi_dung"));
                tc.setHinhAnh(rs.getString("hinh_anh"));
                return tc;
            }
        });
    }
}
