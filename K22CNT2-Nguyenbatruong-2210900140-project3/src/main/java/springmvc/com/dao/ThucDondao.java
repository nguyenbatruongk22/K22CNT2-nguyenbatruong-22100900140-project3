package springmvc.com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import springmvc.com.beans.ThucDon;

public class ThucDondao {
	@Autowired
	private JdbcTemplate template;
;

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    public int save(ThucDon td) {
        String sql = "INSERT INTO thucdon (ten_mon, hinh_anh, mo_ta) VALUES (?, ?, ?)";
        return template.update(sql, td.getTenMon(), td.getHinhAnh(), td.getMoTa());
    }

    public int update(ThucDon td) {
        String sql = "UPDATE thucdon SET ten_mon=?, hinh_anh=?, mo_ta=? WHERE id=?";
        return template.update(sql, td.getTenMon(), td.getHinhAnh(), td.getMoTa());
    }

    public int delete(int id) {
        String sql = "DELETE FROM thucdon WHERE id=?";
        return template.update(sql, id);
    }

    public ThucDon getById(int id) {
        String sql = "SELECT * FROM thucdon WHERE id=?";
        return template.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper<>(ThucDon.class));
    }

    public List<ThucDon> getAll() {
        return template.query("SELECT * FROM thucdon", new RowMapper<ThucDon>() {
            public ThucDon mapRow(ResultSet rs, int row) throws SQLException {
                ThucDon td = new ThucDon();
                
                td.setTenMon(rs.getString("ten_mon"));
                td.setHinhAnh(rs.getString("hinh_anh"));
                td.setMoTa(rs.getString("mo_ta"));
                return td;
            }
        });
    }
}
