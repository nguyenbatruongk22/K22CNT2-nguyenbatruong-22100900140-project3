package springmvc.com.dao;

import org.springframework.stereotype.Repository;
import springmvc.com.beans.LienHe;
import springmvc.com.dao.LienHeDAO;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class LienHeDAOImpl implements LienHeDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void save(LienHe lienHe) {
        entityManager.persist(lienHe);
    }

    @Override
    public void update(LienHe lienHe) {
        entityManager.merge(lienHe);
    }

    @Override
    public void delete(LienHe lienHe) {
        entityManager.remove(lienHe);
    }

    @Override
    public LienHe findById(int id) {
        return entityManager.find(LienHe.class, id);
    }

    @Override
    public List<LienHe> findAll() {
        return entityManager.createQuery("FROM LienHe", LienHe.class).getResultList();
    }
}
