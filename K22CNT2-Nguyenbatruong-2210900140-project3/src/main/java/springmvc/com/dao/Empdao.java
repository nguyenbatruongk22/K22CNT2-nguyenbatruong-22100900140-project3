package com.javatpoint.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.javatpoint.beans.Emp;

public class EmpDao {
    private JdbcTemplate template;

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    // Thêm nhân viên mới
    public int save(Emp p) {
        String sql = "INSERT INTO Emp99 (name, salary, designation) VALUES (?, ?, ?)";
        return template.update(sql, p.getName(), p.getSalary(), p.getDesignation());
    }

    // Cập nhật thông tin nhân viên
    public int update(Emp p) {
        String sql = "UPDATE Emp99 SET name=?, salary=?, designation=? WHERE id=?";
        return template.update(sql, p.getName(), p.getSalary(), p.getDesignation(), p.getId());
    }

    // Xóa nhân viên theo ID
    public int delete(int id) {
        String sql = "DELETE FROM Emp99 WHERE id=?";
        return template.update(sql, id);
    }

    // Lấy thông tin nhân viên theo ID
    public Emp getEmpById(int id) {
        String sql = "SELECT * FROM Emp99 WHERE id=?";
        return template.queryForObject(sql, new BeanPropertyRowMapper<>(Emp.class), id);
    }

    // Lấy danh sách tất cả nhân viên
    public List<Emp> getEmployees() {
        String sql = "SELECT * FROM Emp99";
        return template.query(sql, new RowMapper<Emp>() {
            public Emp mapRow(ResultSet rs, int rowNum) throws SQLException {
                Emp e = new Emp();
                e.setId(rs.getInt("id"));
                e.setName(rs.getString("name"));
                e.setSalary(rs.getBigDecimal("salary"));
                e.setDesignation(rs.getString("designation"));
                return e;
            }
        });
    }
}
