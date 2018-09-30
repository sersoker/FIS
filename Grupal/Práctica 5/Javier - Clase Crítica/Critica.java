/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decine;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author javiyo90
 */
public class Critica {
    
    // Definición de atributos 
    private Date fecha;
    private String titulo;
    private String comentario;
    

    // Inicialización del sistema 
    public void crear(UsuarioVIP usuariovip, String titulo, String comentario){
        critica.new(usuariovip, titulo, comentario, fecha.getdate());

    }
    
    // Obtener todos los id (key) de una lista de objetos.
    public Set<String> obtenerDatosCritica(UsuarioVIP usuariovip){
     return  comentario.keySet();    
    }
}