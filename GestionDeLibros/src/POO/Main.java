package POO;

public class Main {
    public static void main(String[] args){
gestionLibros l = new gestionLibros("LB-100", "Lara",false);

// Imprimir atributos iniciales
        System.out.println("ID del libro: " + l.getId());

        System.out.println("Disponible: " + l.isDisponible());

        // Probar comportamiento 1 (reservar)
        l.reservar();
        System.out.println("Disponible después de reservar: " + l.isDisponible());

        // Probar comportamiento 2 (apto para préstamo)
        System.out.println("¿Apto para préstamo?: " +l .esAptoParaPrestamos(2010));
    }
}
