package inventario;

public class inventario {

    private double precioUnitario;
    private String referencia;
    private int cantidadStock;

    public inventario(String referencia, double precioUnitario, int cantidadStock) {
        this.cantidadStock = cantidadStock;
        this.precioUnitario = precioUnitario;
        this.referencia = referencia;

    }

    public String getrefereencia() {
        return this.referencia;
    }
    public int getCantidad() {
        return cantidadStock;
    }

    public void setCantidad(int cantidad) {
        this.cantidadStock = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    // Comportamiento 1: Agregar entrada al stock
    public void agregarStock(int entrada) {
        if (entrada > 0) {
            this.cantidadStock += entrada;
        } else {
            System.out.println("La cantidad a agregar debe ser positiva.");
        }
    }

    // Comportamiento 2: Valor total del stock
    public double valorTotal() {
        return this.cantidadStock * this.precioUnitario;
    }
}

