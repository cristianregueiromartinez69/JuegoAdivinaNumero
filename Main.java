/**
 * Clase main donde ejecutamos el programa
 * @author Cristian Regueiro Martínez
 * @version 1.0
 */

public class Main {



    public static void main(String[]args){
/**
 * instanciamos un objeto de la clase partida y llamamos al metodo crear partida
 */
        Partida objpartida=new Partida();
        objpartida.crearPartida();
/**
 * Creamos un objeto de la clase Record y llamamos al metodo guardar estadistica
 * El objetivo es pedirle el alias y mostrarle la puntuacion obtenida en una estadistica
 */
        Record objrecord=new Record();
        objrecord.guardarEstadistica();








    }












}
