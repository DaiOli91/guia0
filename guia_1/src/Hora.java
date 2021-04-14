/*5. Modele el objeto Hora, teniendo en cuenta sus atributos, hora, minuto y segundo.
Tenga en cuenta el rango de valores aceptados para cada uno de estos.
a. Hora: 0 … 23
b. Minuto: 0 … 59
c. Segundo: 0 … 59
*/


public class Hora {
    private int hora;
    private int minutos;
    private int segundos;

    ////////////////////// CONSTRUCTORS

    public Hora(int hora, int minutos, int segundos) {
        if(checkHora(hora)) {
            this.hora = hora;
        }
        this.minutos = minutos;
        this.segundos = segundos;
    }

    ////////////////////// GETTERS

    public int getHora() {
        return hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    ////////////////////// SETTERS

    public void setHora(int hora) {
        if(checkHora(hora)) {
            this.hora = hora;
        }
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    ////////////////////// OTROS
    private boolean checkHora(int hora){
        boolean flag =  false;
        if (hora>=0 && hora<24){
            flag = true;
        }
        return flag;
    }

    ////////////////////// OVERRIDDEN
    @Override
    public String toString() {
        return "Son las " + hora + " : " + minutos + " : " + segundos;
    }
}
