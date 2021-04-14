public class Main {

    public static void main(String[] args) {



        // ---------------- EJERCICIO 1 ---------------------- //
        //a. Inicializar un objeto Rectángulo estableciendo ancho y alto.
        Rectangulo rectanguloVar = new Rectangulo(2.5, 6.0);

        //b. Imprimir por pantalla el alto y ancho.
        System.out.println(rectanguloVar.toString());

        //c. Imprimir por pantalla el área y perímetro.
        System.out.println("El area del rectangulo mide " + rectanguloVar.getArea() + " y el perimetro es de " + rectanguloVar.getPerimetro());

        //d. Modificar el alto y el ancho de la instancia.
        rectanguloVar.setAlto(5.3);
        rectanguloVar.setAncho(8.2);
        System.out.println("Se han modificado las medidas del rectangulo. Ahora: ");
        System.out.println(rectanguloVar.toString());

        //e. Imprimir por pantalla nuevamente el cálculo del área y perímetro.
        System.out.println("El area del rectangulo mide " + rectanguloVar.getArea() + " y el perimetro es de " + rectanguloVar.getPerimetro());


        //f. Inicializar un objeto Rectángulo con los valores por defecto y verificar.
        Rectangulo rectanguloPorDefecto = new Rectangulo();
        System.out.println("Se muestran las propiedades generadas por defecto del rectangulo.");
        System.out.println(rectanguloPorDefecto.toString());



    }
}
