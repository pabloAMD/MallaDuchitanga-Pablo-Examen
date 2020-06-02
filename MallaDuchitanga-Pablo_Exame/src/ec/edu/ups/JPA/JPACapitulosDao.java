package ec.edu.ups.JPA;

import java.util.List;

import ec.edu.ups.dao.DaoCapitulos;
import ec.edu.ups.modelo.Capitulos;

public class JPACapitulosDao extends JPAGenericDao<Capitulos, String> implements DaoCapitulos{

	public JPACapitulosDao() {
		super(Capitulos.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Capitulos> findCapitulo(String autor) {
		// TODO Auto-generated method stub
		String jpql = "FROM Capitulos p WHERE p.autor_codigo = '" + autor + "'";
        List<Capitulos> capitu = (List<Capitulos>) em.createQuery(jpql).getResultList();
        return capitu;
	}


}
