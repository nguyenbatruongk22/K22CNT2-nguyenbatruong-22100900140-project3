package springmvc.com.dao;

import springmvc.com.beans.KhuyenMai;
import java.util.List;

public interface KhuyenMaiDAOInterface {
    void save(KhuyenMai km);
    void update(KhuyenMai km);
    void delete(KhuyenMai km);
    KhuyenMai findById(int id);
    List<KhuyenMai> findAll();
}
