package springmvc.com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import springmvc.com.beans.ThucDon;

public class ThucDondao {
    private JdbcTemplate template;

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    // Thêm món ăn
    public int save(ThucDon td) {
        String sql = "INSERT INTO thucdon (ten_mon, loai, gia, mo_ta, hinh_anh) VALUES (?, ?, ?, ?, ?)";
        return template.update(sql, td.getTenMon(), td.getDanhMuc(), td.getGia(), td.getMoTa(), td.getHinhAnh()); 
    }

    // Cập nhật món ăn
    public int update(ThucDon td) {
        String sql = "UPDATE thucdon SET "
                + "ten_mon = ?, "
                + "loai = ?, "
                + "gia = ?, "
                + "mo_ta = ?, "
                + "hinh_anh = ? "
                + "WHERE id = ?";

        return template.update(sql, td.getTenMon(), td.getDanhMuc(),td.getLoai(), td.getGia(), td.getMoTa(), td.getHinhAnh(), td.getId())
        		;
    }

    // Xóa món ăn
    public int delete(int id) {
        String sql = "DELETE FROM thucdon WHERE id=?";
        return template.update(sql, id);
    }

    // Lấy danh sách tất cả món ăn
    public List<ThucDon> getAll() {
        return template.query("SELECT * FROM thucdon", new RowMapper<ThucDon>() {
            public ThucDon mapRow(ResultSet rs, int rowNum) throws SQLException {
                ThucDon td = new ThucDon();
                td.setId(rs.getInt("id"));
                td.setTenMon(rs.getString("ten_mon"));
                td.setDanhMuc(rs.getString("danh_muc"));
                
                td.setMoTa(rs.getString("mo_ta"));
                td.setHinhAnh(rs.getString("hinh_anh"));
               
                return td;
            }
        });
    }

    // Lấy món ăn theo ID
    public ThucDon getById(int id) {
        String sql = "SELECT * FROM thucdon WHERE id=?";
        return template.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper<>(ThucDon.class));
    }
}
