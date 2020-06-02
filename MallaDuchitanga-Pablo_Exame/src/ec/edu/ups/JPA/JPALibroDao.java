package ec.edu.ups.JPA;


import java.util.List;

import ec.edu.ups.dao.DaoLibro;

import ec.edu.ups.modelo.Libro;

public class JPALibroDao extends JPAGenericDao<Libro, String> implements DaoLibro {

	public JPALibroDao() {
		super(Libro.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Libro findLibro(String codigo) {
		// TODO Auto-generated method stub
		Libro libro = null;
		   
        String jpql = "FROM Libro l WHERE l.codigo = '" + codigo + "' OR l.nombre = '" + codigo + "'";
        libro = (Libro) em.createQuery(jpql).getSingleResult();
 
    return libro;
	}

	

}
