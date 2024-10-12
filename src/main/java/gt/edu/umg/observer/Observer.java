/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package gt.edu.umg.observer;

/**
 *
 * @author fuent
 */
public class Observer {

    public static void main(String[] args) {
        Luz luz = new Luz();
        Usuario usuario = new Usuario();

       
        luz.agregarObservador(usuario);

        
        luz.encender();  
        luz.apagar();    
    }
}
