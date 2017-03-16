/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reloj;

/**
 *
 * @author klemavilanova
 */

//La clase reloj contiene los atributos de hr,min, on si esta encendido o no, la alarma y el display
public class Reloj {
    Boolean on = true;
    public int hr;
    public int min;
    public int count;
    public Alarma alarma = new Alarma();
    public Display display = new Display();
    
    //En este metodo recibimos una hora y unos minutos y los seteamos a la hora del reloj
    public void setHora(int hora, int min) {
        hr = hora;
        this.min = min;
    }
    
    //El metodo incrementa las horas del reloj
    public void botonIncrementarHora() {
        hr++;
        count+=60;
    }
    //El metodo incrementa los minutos del reloj
    public void botonIncrementarMin() {
        min++;
        count+=1;
    }
    
    //Con este metodo apagamos el reloj si esta encendido y viceversa
    public void ApagarReloj() {
        if (on == true) {
            on = false;
        } else {
            on = true;
        }
    }

    
}
