public class Aereas {


    // Atributos
    private String codigoVuelo;
    private int capacidadMaxima;
    private int asientosReservados;

    // Constructor
    public Aereas (String codigoVuelo, int capacidadMaxima, int asientosReservados) {
        this.codigoVuelo = codigoVuelo;
        this.capacidadMaxima = capacidadMaxima;
        this.asientosReservados = asientosReservados;
    }

    // Getters y Setters
    public String getCodigoVuelo() {
        return codigoVuelo;
    }

    public void setCodigoVuelo(String codigoVuelo) {
        this.codigoVuelo = codigoVuelo;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getAsientosReservados() {
        return asientosReservados;
    }

    public void setAsientosReservados(int asientosReservados) {
        this.asientosReservados = asientosReservados;
    }


    // Comportamiento 1: Realizar una reserva
    public boolean realizarReserva(int numeroAsientos) {
        int asientosDisponibles = capacidadMaxima - asientosReservados;

        if (asientosDisponibles >= numeroAsientos) {
            asientosReservados += numeroAsientos;
            System.out.println("Reserva exitosa de " + numeroAsientos + " asiento(s).");
            return true;
        } else {
            System.out.println("No se puede realizar la reserva. Capacidad insuficiente.");
            System.out.println("Asientos disponibles: " + asientosDisponibles);
            return false;
        }
    }

    // Comportamiento 2: Calcular y retornar porcentaje de ocupación
    public double calcularPorcentajeOcupacion() {
        if (capacidadMaxima == 0) {
            return 0.0;
        }
        return (asientosReservados * 100.0) / capacidadMaxima;
    }
}





