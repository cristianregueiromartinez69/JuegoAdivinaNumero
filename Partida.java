/**
 * clase partida
 * @author cristian Regueiro Martinez
 * @version 1.0
 */

public class Partida {


    /**
     * la ronda actual de la partida
     */
    private int ronda_actual;
    /**
     * la cantidad de rondas que llevamos
     */
    private int ronda_partida;

    /**
     * constructor por defecto
     */
    public Partida() {

    }

    /**
     * constructor parametrizado
     * @param ronda_actual la ronda en la que estamos
     * @param ronda_partida el numero máximo de rondas que tiene el juego
     */
    public Partida(int ronda_actual, int ronda_partida) {
        this.ronda_actual = ronda_actual;
        this.ronda_partida = ronda_partida;
    }

    /**
     * getter y setter de los atributos
     * @return sus atributos correspodientes
     */
    public int getRonda_actual() {
        return ronda_actual;
    }

    public void setRonda_actual(int ronda_actual) {
        this.ronda_actual = ronda_actual;
    }

    public int getRonda_partida() {
        return ronda_partida;
    }

    public void setRonda_partida(int ronda_partida) {
        this.ronda_partida = ronda_partida;
    }

    /**
     * metodo en el que creamos la partida
     */
    public void crearPartida(){

      //creamos la partida
      //el ordenador genera un numero aleatorio del 1 al 10
      //introducimos el numero escogido
      //hacemos un while con la condicion de que el contador intentos no puede llegar a 2
      //las rondas maximas a las que podemnos llegar seran 10
      //si perdemos, le pedimos su alias y mostramos las estadisticas
      //si ganamos, le pedimos su alias y mostramos las estadisticas
    }

}
