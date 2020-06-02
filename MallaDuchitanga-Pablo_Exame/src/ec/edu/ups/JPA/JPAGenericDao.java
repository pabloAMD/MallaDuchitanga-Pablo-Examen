package ec.edu.ups.JPA;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import ec.edu.ups.dao.GenericDao;

public class JPAGenericDao<T, ID> implements GenericDao<T, ID> {

	private Class<T> persistenciaClass;
	protected EntityManager em;
	
	
	public JPAGenericDao(Class<T> persistenciaClass) {
		this.persistenciaClass = persistenciaClass;
		this.em= Persistence.createEntityManagerFactory("JPAexamen").createEntityManager();
	}


	@Override
	public boolean create(T entity) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
        try {
            em.persist(entity);
            em.getTransaction().commit();
            return true;
        } catch (Exception e) {
            System.out.println(">>>>> Error: JPAgenericDao.create "+e);
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            return false;
        }
	
	}


	@Override
	public boolean update(T entity) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
        try {
            em.merge(entity);
            em.getTransaction().commit();
            return true;
        } catch (Exception e) {
            System.out.println(">>>>> Error: JPAgenericDao.update "+e);
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            return false;
        }
	}

	@Override
	public boolean delete(T entity) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
        try {
            em.remove(entity);
            em.getTransaction().commit();
            return true;
        } catch (Exception e) {
            System.out.println(">>>>> Error: JPAgenericDao.delete "+e);
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            return false;
        }
	}
	

	@Override
	public List<T> find() {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
        List<T> lista = null;
        try {
            javax.persistence.criteria.CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(persistenciaClass));
            lista = em.createQuery(cq).getResultList();
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
	}

	@Override
	public T findById(ID id) {
		// TODO Auto-generated method stub
		return em.find(persistenciaClass, id);
	}
}
