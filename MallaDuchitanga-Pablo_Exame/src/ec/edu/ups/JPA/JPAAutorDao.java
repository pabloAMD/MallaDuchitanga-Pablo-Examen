package ec.edu.ups.JPA;

import ec.edu.ups.modelo.Autor;
import ec.edu.ups.dao.DaoAutor;

public class JPAAutorDao extends JPAGenericDao<Autor, String> implements DaoAutor {

	public JPAAutorDao() {
		super(Autor.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Autor findUsuario(String codigo) {
		// TODO Auto-generated method stub
		Autor autor = null;
		   
        String jpql = "FROM Autor a WHERE a.codigo = '" + codigo + "' OR a.nombre = '" + codigo + "'";
        autor = (Autor) em.createQuery(jpql).getSingleResult();
 
    return autor;
	}

}
