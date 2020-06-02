package ec.edu.ups.modelo;

public class Libro {
	
	private String codigo;
	private String nombre;
	private String isbn;
	private int numpag;
	private Capitulos capitulos;
	
	public Libro() {
		
	}
	
	
	

	public Libro(String codigo, String nombre, String isbn, int numpag, Capitulos capitulos) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.isbn = isbn;
		this.numpag = numpag;
		this.capitulos = capitulos;
	}




	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getNumpag() {
		return numpag;
	}

	public void setNumpag(int numpag) {
		this.numpag = numpag;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		return true;
	}
	
	
	
	

}
