package springmvc.com.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import springmvc.com.beans.KhuyenMai;
import java.util.List;

@Repository
public class KhuyenMaidao implements KhuyenMaidaoInterface {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void save(KhuyenMai km) {
        entityManager.persist(km);
    }

    @Override
    public void update(KhuyenMai km) {
        entityManager.merge(km);
    }

    @Override
    public void delete(KhuyenMai km) {
        entityManager.remove(km);
    }

    @Override
    public KhuyenMai findById(int id) {
        return entityManager.find(KhuyenMai.class, id);
    }

    @Override
    public List<KhuyenMai> findAll() {
        return entityManager.createQuery("FROM KhuyenMai", KhuyenMai.class).getResultList();
    }
}
