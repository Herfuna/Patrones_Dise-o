/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.umg.observer;

/**
 *
 * @author fuent
 */
public class Luz {
    private Observador observador;
    private String estado = "apagada";

    public void agregarObservador(Observador observador) {
        this.observador = observador;
    }

    public void encender() {
        estado = "encendida";
        notificar();
    }

    public void apagar() {
        estado = "apagada";
        notificar();
    }

    private void notificar() {
        if (observador != null) {
            observador.actualizar(estado);
        }
    }
}
