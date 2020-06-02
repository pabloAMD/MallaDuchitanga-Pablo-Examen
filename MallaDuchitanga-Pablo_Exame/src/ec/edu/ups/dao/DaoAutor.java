package ec.edu.ups.dao;

public class DaoAutor {

	protected static DaoFactory factory = new JPADAOFactory();

	public static DaoFactory getFactory() {
		return factory;
	}


	public abstract DaoUsuario getUsuarioDAO();

	public abstract DaoTelefono getTelefonoDAO();
}
