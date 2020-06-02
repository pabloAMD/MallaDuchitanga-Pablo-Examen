package ec.edu.ups.dao;

import ec.edu.ups.JPA.JPAAutorDao;
import ec.edu.ups.JPA.JPACapitulosDao;
import ec.edu.ups.JPA.JPALibroDao;

public class JPADAOFactory extends DaoFactory {


	
	@Override
	public DaoAutor getAutorDao() {
		// TODO Auto-generated method stub
		return new JPAAutorDao();
	}

	@Override
	public DaoLibro getLibroDao() {
		// TODO Auto-generated method stub
		return new JPALibroDao();
	}

	@Override
	public DaoCapitulos getCapitulosDao() {
		// TODO Auto-generated method stub
		return new JPACapitulosDao();
	}


	
}
