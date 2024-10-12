/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.umg.observer;

/**
 *
 * @author fuent
 */
class Usuario implements Observador {
    public void actualizar(String estado) {
        System.out.println("La luz está " + estado);
    }
}