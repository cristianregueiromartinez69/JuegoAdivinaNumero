/**
 * clase Record
 * @author cristian Regueiro Martinez
 * @version v1.0
 */

public class Record {

    /**
     * el alias que nos pedirá una vez finalicemos la partida
     */
    private String alias;
    /**
     * nuestrea puntuacion obtenida en la partida
     */
    private int puntuacion;

    /**
     * constructor por defecto dre la clase Record
     */
    public Record(){


}

    /**
     * constructor parametrizado de la clase record
     * @param alias el nombre del jugador
     * @param puntuacion la puntuacion obtenida
     */
    public Record(String alias, int puntuacion) {
        this.alias = alias;
        this.puntuacion = puntuacion;
    }

    /**
     * los getter y setter de los atributos de la clase Record
     * @return sus atributos correspondientes
     */
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    /**
     * metodo en el que guardamos las estadisticas del usuario
     */
    public void guardarEstadistica(){

    //metodo que será llamado para guardar el record del usuario en la partida
        //las estadisticas seran:
        //numero de aciertos
        //numero de fallos
        //ronda a la que llegaste

    }

}
