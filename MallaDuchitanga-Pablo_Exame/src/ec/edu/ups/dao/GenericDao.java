package ec.edu.ups.dao;

import java.util.List;

public interface GenericDao<T, ID> {


	public boolean create(T entity);

	public boolean update(T entity);

	public boolean delete(T entity);

	public List<T> find();

	public T findById(ID id);

}