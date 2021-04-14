public class Main {

    public static void main(String[] args) {

/*

        // ---------------- EJERCICIO 1 RECTANGULO ---------------------- //
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

*/

        // ---------------- EJERCICIO 2 EMPLEADO ---------------------- //
        //a. Inicialice un empleado Carlos Gutiérrez, con dni 23456345 y salario inicial de 25000.
        Empleado empleado1= new Empleado("23456345", "Carlos", "Gutierrez", 25000);
        //b. Inicialice un empleado Ana Sánchez, con dni 34234123 y salario inicial de 27500.
        Empleado empleado2= new Empleado("34234123", "Ana", "Sanchez", 27500);
        //c. Imprima ambos objetos por pantalla
        System.out.println("Se han cargado 2 empleados:");
        System.out.println(empleado1.toString());
        System.out.println(empleado2.toString());
       // d. Aumente el salario del empleado Carlos en un 15% e imprima en pantalla el salario anual del mismo*/
        double aux_salario = empleado1.getSalario()*1.15;
        empleado1.setSalario(aux_salario);
        System.out.println("Se le ha aumentado el salario al empleado 2:");
        System.out.println(empleado2.toString());

        // ---------------- EJERCICIO 3 ---------------------- //

        // ---------------- EJERCICIO 4 ---------------------- //

        // ---------------- EJERCICIO 5 ---------------------- //



    }
}
