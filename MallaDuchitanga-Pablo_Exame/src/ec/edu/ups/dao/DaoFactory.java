package ec.edu.ups.dao;

public abstract class DaoFactory {

	protected static DaoFactory factory = new JPADAOFactory();

	public static DaoFactory getFactory() {
		return factory;
	}


	public abstract DaoAutor getAutorDao();

	public abstract DaoLibro getLibroDao();
	
	public abstract DaoCapitulos getCapitulosDao();
}
