
package Servlets;

import Logica.Controladora;
import Logica.Persona;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "SvPersona", urlPatterns = {"/SvPersona"})
public class SvPersona extends HttpServlet {
    
    Controladora Control = new Controladora ();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       
    }

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
     String dni = request.getParameter("dni");
     String nombre = request.getParameter("nombre");
     String apellido = request.getParameter("apellido");
     String telefono = request.getParameter("telefono");
        
     System.out.println("DNI :"+ dni);
     System.out.println("Nombre :"+ nombre);
     System.out.println("apellido :"+ apellido);
     System.out.println("Telefono :"+ telefono);
     
     Persona pers = new Persona (1,dni,nombre,apellido,telefono);
     Control.crearPersona(pers);
     
     
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
