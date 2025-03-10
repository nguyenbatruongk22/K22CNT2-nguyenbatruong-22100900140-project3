package springmvc.com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import springmvc.com.beans.baiviet;

public class baivietdao {
    private JdbcTemplate template;

    // Setter để inject JdbcTemplate
    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    // Thêm bài viết mới vào database
    public int save(baiviet bv) {
        String sql = "INSERT INTO baiviet (tieude, noidung, hinhanh, ngaydang, tacgia) VALUES (?, ?, ?, ?, ?)";
        return template.update(sql, bv.getTieuDe(), bv.getNoiDung(), bv.getHinhAnh(), bv.getNgayDang(), bv.getTacGia());
    }

    // Cập nhật bài viết
    public int update(baiviet bv) {
        String sql = "UPDATE baiviet SET tieude=?, noidung=?, hinhanh=?, ngaydang=?, tacgia=? WHERE id=?";
        return template.update(sql, bv.getTieuDe(), bv.getNoiDung(), bv.getHinhAnh(), bv.getNgayDang(), bv.getTacGia(), bv.getId());
    }

    // Xóa bài viết theo ID
    public int delete(int id) {
        String sql = "DELETE FROM baiviet WHERE id=?";
        return template.update(sql, id);
    }

    // Lấy bài viết theo ID
    public baiviet getBaiVietById(int id) {
        String sql = "SELECT * FROM baiviet WHERE id=?";
        return template.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper<BaiViet>(BaiViet.class));
    }

    // Lấy danh sách tất cả bài viết
    public List<baiviet> getAllBaiViet() {
        return template.query("SELECT * FROM baiviet", new RowMapper<BaiViet>() {
            public baiviet mapRow(ResultSet rs, int rowNum) throws SQLException {
            	baiviet bv = new baiviet();
                bv.setId(rs.getInt("id"));
                bv.setTieuDe(rs.getString("tieude"));
                bv.setNoiDung(rs.getString("noidung"));
                bv.setHinhAnh(rs.getString("hinhanh"));
                bv.setNgayDang(rs.getString("ngaydang"));
                bv.setTacGia(rs.getString("tacgia"));
                return bv;
            }
        });
    }
}
