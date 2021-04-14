/*
* 3. Modele el objeto Ítem de Venta con las siguientes propiedades, identificador,
descripción, cantidad y precio unitario. Cree los métodos para calcular el precio
total teniendo en cuenta el precio unitario y cantidad. Un método que permita
imprimir por pantalla los atributos del objeto de la siguiente forma:
ItemVenta[id=?, descripción=?, cantidad=?, pUnitario=?, pTotal=?]
*/

import java.util.UUID;

public class ItemVenta {
    private String id;
    private String descripcion;
    private int cantidad;
    private double precioUnitario;

    ////////////////////// CONSTRUCTORES

    public ItemVenta() {
        this.setId();
        this.descripcion = "";
        this.cantidad = 0;
        this.precioUnitario = 0;
    }

    public ItemVenta(String descripcion, int cantidad, double precioUnitario) {
        this.setId();
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    ////////////////////// GETTERS

    public String getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    ////////////////////// SETTERS
    private void setId(){

        UUID aux_id;
        aux_id = UUID.randomUUID();
        this.id = aux_id.toString().substring(0, 12); //I just need a 10 digits long string

    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    ////////////////////// OTROS
    public double getPrecioTotal(){

        return Double.valueOf(this.precioUnitario*this.cantidad);

    }

    ////////////////////// OVERRIDDEN

    @Override
    public String toString() {
        //ItemVenta[id=?, descripción=?, cantidad=?, pUnitario=?, pTotal=?]
        return "ItemVenta[" +
                "id=" + id +
                ", descripcion=" + descripcion +
                ", cantidad=" + cantidad +
                ", precioUnitario=" + precioUnitario +
                ", precioTotal=" + this.getPrecioTotal() +
                ']';
    }
}
