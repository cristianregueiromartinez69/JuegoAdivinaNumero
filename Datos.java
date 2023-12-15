     /**
     * clase Datos
     * @author Cristian Regueiro Martínez
     * @version 1.0
     */

    public class Datos {

        /**
         * el numero a adivinar
         */
        private int num_adivinar;
        /**
         * el nuemro escogido para adivinar el numero
         */
        private int num_escogido;
        /**
         * el numero de aciertos que llevamos
         */
        private int num_aciertos;
        /**
         * el numero de fallos que llevamos
         */
        private int num_fallos;
        /**
         * el numero máximo de intentos que tenemos para acertar el numero
         */
        private final int NUM_MAX_INTENTOS=2;
        /**
         * nuestro atributo estatico para hacer el singleton
         */
        private static Datos instance=null;

        /**
         * contructor privado por defecto
         */
        private Datos(){

        }

        /**
         * constructor parametrizado privado
         * @param num_adivinar el numero a adivinar
         * @param num_escogido el numero escogido
         * @param num_aciertos el numero de aciertos
         * @param num_fallos el numero de fallos
         */

         public Datos(int num_adivinar, int num_escogido, int num_aciertos, int num_fallos) {
             this.num_adivinar = num_adivinar;
             this.num_escogido = num_escogido;
             this.num_aciertos = num_aciertos;
             this.num_fallos = num_fallos;
         }

         /**
         * los getter y setter
         * @return los atributos correspondientes
         */
        public int getNum_adivinar() {
            return num_adivinar;
        }

        public void setNum_adivinar(int num_adivinar) {
            this.num_adivinar = num_adivinar;
        }

        public int getNum_escogido() {
            return num_escogido;
        }

        public void setNum_escogido(int num_escogido) {
            this.num_escogido = num_escogido;
        }

        public int getNum_aciertos() {
            return num_aciertos;
        }

        public void setNum_aciertos(int num_aciertos) {
            this.num_aciertos = num_aciertos;
        }

        public int getNum_fallos() {
            return num_fallos;
        }

        public void setNum_fallos(int num_fallos) {
            this.num_fallos = num_fallos;
        }


        public int getNUM_MAX_INTENTOS() {
            return NUM_MAX_INTENTOS;
        }

        /**
         * metodo para devolver el objeto y unico creado
         * @return objeto que será unico
         */
        public static Datos getInstance(){

            if(instance==null){

                instance=new Datos();
            }


            return instance;
        }

    }








































