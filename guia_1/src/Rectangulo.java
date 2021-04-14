/*
  * 1. Modele el objeto Rectángulo con sus propiedades, ancho y alto. Ambas con valor
1,0 por defecto. Este objeto debe exponer los getters y setters necesarios. También
debe contar con un método para calcular el área y perímetro del mismo. Ejecute las
siguientes pruebas:
a. Inicializar un objeto Rectángulo estableciendo ancho y alto.
b. Imprimir por pantalla el alto y ancho.
c. Imprimir por pantalla el área y perímetro.
d. Modificar el alto y el ancho de la instancia.
e. Imprimir por pantalla nuevamente el cálculo del área y perímetro.
f. Inicializar un objeto Rectángulo con los valores por defecto y verificar.
* */

public class Rectangulo {

    private double ancho;
    private double alto;


    ////////////////////// CONSTRUCTORES
    public Rectangulo() { ///por defecto se inicializa en 1.0
        this.ancho = 1.0;
        this.alto = 1.0;
    }

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    ////////////////////// GETTERS & SETTERS
    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    ////////////////////// OTROS
    public double getArea(){
        double area = this.ancho*this.alto;
        return Double.valueOf(area); ///casteo por las dudas- a veces lo requiere el IDE
    }

    public double getPerimetro(){
        double perimetro = (2*this.alto) + (2*this.ancho);
        return Double.valueOf(perimetro);

    }

    ////////////////////// OVERRIDDEN


    @Override
    public String toString() {
        return "Este rectangulo tiene " + ancho +
                " cm de ancho y " + alto +
                " cm de alto";
    }
}
