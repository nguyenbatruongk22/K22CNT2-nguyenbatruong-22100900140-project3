package springmvc.com.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import springmvc.com.beans.HeThongCuaHang;
import java.util.List;

@Repository
public class HeThongCuaHangDAO implements HeThongCuaHangDAOInterface {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void save(HeThongCuaHang heThongCuaHang) {
        entityManager.persist(heThongCuaHang);
    }

    @Override
    public void update(HeThongCuaHang heThongCuaHang) {
        entityManager.merge(heThongCuaHang);
    }

    @Override
    public void delete(HeThongCuaHang heThongCuaHang) {
        entityManager.remove(entityManager.contains(heThongCuaHang) ? heThongCuaHang : entityManager.merge(heThongCuaHang));
    }

    @Override
    public HeThongCuaHang findById(int id) {
        return entityManager.find(HeThongCuaHang.class, id);
    }

    @Override
    public List<HeThongCuaHang> findAll() {
        return entityManager.createQuery("SELECT h FROM HeThongCuaHang h", HeThongCuaHang.class).getResultList();
    }
}
