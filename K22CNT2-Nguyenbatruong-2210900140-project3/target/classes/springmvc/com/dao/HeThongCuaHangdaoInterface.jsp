package springmvc.com.dao;

import springmvc.com.beans.HeThongCuaHang;
import java.util.List;

public interface HeThongCuaHangdaoInterface {
    void save(HeThongCuaHang heThongCuaHang);
    void update(HeThongCuaHang heThongCuaHang);
    void delete(HeThongCuaHang heThongCuaHang);
    HeThongCuaHang findById(int id);
    List<HeThongCuaHang> findAll();
}
