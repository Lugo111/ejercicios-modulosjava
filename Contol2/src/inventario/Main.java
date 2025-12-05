package inventario;

public class Main {

    public static void main(String[] args) {

        // Crear el objeto p
        inventario producto = new inventario("A100", 10, 255);

        // Imprimir atributos iniciales
        System.out.println("Referencia: " + producto.getrefereencia());
        System.out.println("Cantidad inicial: " + producto.getCantidad());
        System.out.println("Precio unitario: " + producto.getPrecioUnitario());

        // Probar comportamiento 1
        producto.agregarStock(5);
        System.out.println("Cantidad después de agregar stock: " + producto.getCantidad());

        // Probar comportamiento 2
        System.out.println("Valor total del stock: " + producto.valorTotal());
    }
}


