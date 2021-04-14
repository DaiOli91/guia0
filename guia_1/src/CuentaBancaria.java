/*4. Modele el objeto que representa la cuenta de un banco, con identificador, nombre
y balance. Considere los getters, setters y constructores necesarios. Tenga en
cuenta los siguientes métodos.
a. El método crédito que representa un depósito de dinero en la cuenta. Este
método debe devolver el balance luego de la operación.
b. El método débito que representa una sustracción de dinero de la cuenta.
Este método debe devolver el balance luego de la operación. Si el dinero en
la cuenta no es suficiente para cubrir la sustracción, se debe imprimir por
pantalla un aviso.
c. Un método que imprima por pantalla las características del objeto.
*/

import java.util.UUID;

public class CuentaBancaria {
    private String id;
    private String nombre; //mejor si tuviese una clase cliente como atributo....o un id cliente
    private double balance; //siempre se retorna como String


    ////////////////////// CONSTRUCTORES
    public CuentaBancaria() {
        this.setId();
        this.nombre = "";
        this.balance = 0;
    }

    public CuentaBancaria(String nombre, double balance) {
        this.setId();
        this.nombre = nombre;
        this.balance = balance;
    }

    ////////////////////// GETTER

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getBalance() {
        return String.valueOf(this.balance);
    }

    ////////////////////// SETTERS
    private void setId(){

        UUID aux_id;
        aux_id = UUID.randomUUID();
        this.id = aux_id.toString().substring(0, 12); //I just need a 10 digits long string

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    ////////////////////// OTROS
    public String credito(double monto){
        this.balance+= monto;
        return this.getBalance();
    }

    public String debito(double monto){
        String message = "El monto en su cuenta no es suficiente para realizar esta extraccion.";
        if(this.balance>monto){
            this.balance-=monto;
            message = this.getBalance();
        }
        return message;
    }
    ////////////////////// OVERRIDDEN

    public String toString() {
        return "Cuenta Bancaria" + '\n' +
                "Nro: " + id + '\n' +
                "Nombre: " + nombre + '\n' +
                "Balance: " + balance;
    }
}
