/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reloj;

import javax.swing.JOptionPane;

/**
 *
 * @author klemavilanova
 */

//Aqui tenemos la clase Persona la cual tiene elmain en el cual está reloj inicializado 
//y el boton que es un int que corresponde con cada uno d elos botones del reloj
public class Persona {
    public static void main(String[] args) {
        Reloj reloj = new Reloj();
        int botonPulsado;

//Mientras el reloj este encendido pide un boton al usuario 
        while (reloj.on) {
            botonPulsado = Integer.parseInt(JOptionPane.showInputDialog(""));
            switch (botonPulsado) {
                //En este caso llamamos al reloj y lo apagamos
                case 0:
                    reloj.ApagarReloj();
                    break;
                //Incrementamos la hora y la mostramos por el display
                case 1:
                    reloj.botonIncrementarHora();
                    reloj.display.mostrarHora();
                    break;
                //Incrementamos la min y los mostramos por el display
                case 2:
                    reloj.botonIncrementarMin();
                    reloj.display.mostrarHora();
                    break;
                //El usuario elige una hora y minutos y lo seteamos en el reloj, luego mostramos
                case 3:
                    int hr = Integer.parseInt(JOptionPane.showInputDialog("Hora"));
                    int min = Integer.parseInt(JOptionPane.showInputDialog("Minutos"));
                    reloj.setHora(hr, min);
                    reloj.display.mostrarHora();
                    break;
                //Detenemos alarma
                case 4:
                    reloj.alarma.activada = false;
            }
            //Aqui se comprueba si la hora que tiene el reloj es la misma que la que esta en la alarma, se activa y se muestra una campana en el display
            if (reloj.alarma.hr == reloj.hr) {
                if (reloj.alarma.min == reloj.min) {
                    reloj.alarma.activada = true;
                    reloj.display.mostrarCampanaAlarma();
                }
            }
        }
    }

}
