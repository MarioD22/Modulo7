
package Persistencia;

import Logica.Persona;
import Persistencia.exceptions.RollbackFailureException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPercistencia {
    
    
 PersonaJpaController perJPA = new PersonaJpaController ();
 
 
 public void crearPesona ( Persona per){
     try {
         perJPA.create(per);
     } catch (Exception ex) {
         Logger.getLogger(ControladoraPercistencia.class.getName()).log(Level.SEVERE, null, ex);
     }
 }
 
 public void eliminarPesona ( int id) {
     try {
         perJPA.destroy(id);
     } catch (RollbackFailureException ex) {
         Logger.getLogger(ControladoraPercistencia.class.getName()).log(Level.SEVERE, null, ex);
     } catch (Exception ex) {
         Logger.getLogger(ControladoraPercistencia.class.getName()).log(Level.SEVERE, null, ex);
     }
 }
 
 public void eliminarPesona ( Persona per) {
     try {
         perJPA.destroy(per.getId());
     } catch (RollbackFailureException ex) {
         Logger.getLogger(ControladoraPercistencia.class.getName()).log(Level.SEVERE, null, ex);
     } catch (Exception ex) {
         Logger.getLogger(ControladoraPercistencia.class.getName()).log(Level.SEVERE, null, ex);
     }
 }
 
 public List<Persona> traerPersona(){
     return perJPA.findPersonaEntities();
 }
 
    
}
