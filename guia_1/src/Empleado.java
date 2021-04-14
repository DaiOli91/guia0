/*
* 2. Modele el objeto Empleado que posee las siguientes características, dni, nombre,
apellido y salario. El mismo debe contar con la posibilidad de calcular el salario
anual. A su vez se requiere otro método que permita aumentar el salario
dependiendo del porcentaje que se le pase por parámetro. Considere crear un
método que facilite imprimir por pantalla las características del objeto de la
siguiente forma:
Empleado[dni=?, nombre=?, apellido=?, salario=?]
*/

import java.util.UUID;

public class Empleado {
    private String dni;
    private String nombre;
    private String apellido;
    private double salario;

    ////////////////////// CONSTRUCTORES
    public Empleado() {
        this.setDni();
        this.nombre = "";
        this.apellido = "apellido";
        this.salario = 0;
    }

    public Empleado(String dni, String nombre, String apellido, double salario) {
       // this.setDni();
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    ////////////////////// GETTERS

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double getSalario() {
        return salario;
    }


    ////////////////////// SETTERS

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    ////////////////////// OTROS

    private void setDni(){

        UUID aux_dni;
        aux_dni = UUID.randomUUID();
        this.dni = aux_dni.toString().substring(0, 9); //I just need a 10 digits long string

    }
    ////////////////////// OVERRIDDEN


    @Override
    public String toString() {
        //Empleado[dni=?, nombre=?, apellido=?, salario=?]
        return "Empleado[" +
                "dni=" + dni +
                ", nombre=" + nombre +
                ", apellido=" + apellido +
                ", salario=" + salario +
                ']';
    }
}
