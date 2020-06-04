
package Interfaces;

import java.util.List;



public interface ConexionPersona {
    
    public void registrar(Persona per) throws Exception;
    public void modificar(Persona per) throws Exception;
    public void eliminar(Persona per) throws Exception;
    public List<Persona> listar()throws Exception;
    
}
