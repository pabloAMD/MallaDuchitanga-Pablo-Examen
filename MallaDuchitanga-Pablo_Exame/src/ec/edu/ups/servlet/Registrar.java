package ec.edu.ups.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.ups.dao.DaoFactory;
import ec.edu.ups.dao.DaoLibro;
import ec.edu.ups.modelo.Libro;

/**
 * Servlet implementation class Registrar
 */
@WebServlet(name="Registros", urlPatterns = {"/registrar"})
public class Registrar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registrar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		doGet(request, response);
		String nombre = request.getParameter("nombre");
        String isbn = request.getParameter("isbn");
        int numpag = Integer.parseInt(request.getParameter("pag"));
      
        
        
        System.out.println(nombre+isbn+numpag);
        
       
        
        DaoLibro libroDao = DaoFactory.getFactory().getLibroDao();
        Libro libro= new Libro(nombre, isbn, numpag);
        if (libroDao.create(libro)) {

            System.out.println("libro Creado");
            //System.out.println("nombre: "+nombre+" apellido: "+apellido+" cedula: "+cedula+" mail: "+mail+" pass: "+pass);
        }else{
            System.out.println("libro No Creado");
           
        }
	}
	

}
