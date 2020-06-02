package ec.edu.ups.dao;


import java.util.List;

import ec.edu.ups.modelo.Capitulos;

public interface DaoCapitulos extends GenericDao<Capitulos, String> {
	
	public abstract List<Capitulos> findCapitulo(String autor);
}
