package ec.edu.ups.dao;
import java.util.List;

import ec.edu.ups.modelo.Autor;
import ec.edu.ups.modelo.Libro;


public interface DaoLibro extends GenericDao<Libro, String>{
	
	public abstract Libro findLibro(String codigo );

}
