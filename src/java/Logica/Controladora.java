
package Logica;

import Persistencia.ControladoraPercistencia;
import java.util.List;

public class Controladora {
    
   ControladoraPercistencia ControlPersis = new ControladoraPercistencia();
   
    public void crearPersona ( Persona pers) {
        ControlPersis.crearPesona(pers);
    }
    
    public void eliminarPersona ( int id) {
        ControlPersis.eliminarPesona(id);
    }
    
    public void eliminarPersona ( Persona pers) {
        ControlPersis.eliminarPesona(pers);
    }
    
    public List<Persona> traerPersonas(){
        return ControlPersis.traerPersona();
    }
    
    
    
}
    
   