package ec.edu.ups.dao;
import ec.edu.ups.modelo.Autor;

public interface DaoAutor extends GenericDao<Autor, String> {

	public abstract Autor findUsuario(String nombre);
	
}
