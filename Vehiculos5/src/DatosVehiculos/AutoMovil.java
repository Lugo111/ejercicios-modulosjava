package DatosVehiculos;

public class AutoMovil {

    // Atributos
    private String marca;
    private int anioFabricacion;
    private double velocidadMaxima;

    // Constructor
    public AutoMovil(String marca, int anioFabricacion, double velocidadMaxima) {
        this.marca = marca;
        this.anioFabricacion = anioFabricacion;
        this.velocidadMaxima = velocidadMaxima;
    }

    // Getters y Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    // Comportamiento 1: Encendido
    public String encender() {
        int anioActual = 2025;
        int antiguedad = anioActual - this.anioFabricacion;

        if (antiguedad < 40) {
            return "El vehículo ha encendido correctamente.";
        } else {
            return "El vehículo es demasiado antiguo para encender.";
        }
    }

    // Comportamiento 2: Calcular Antigüedad
    public int calcularAntiguedad() {
        int anioActual = 2025;
        return anioActual - this.anioFabricacion;
    }

    // Método para mostrar información del vehículo
    public void mostrarInformacion() {
        System.out.println("\n========== INFORMACIÓN DEL VEHÍCULO ==========");
        System.out.println("Marca: " + marca);
        System.out.println("Año de fabricación: " + anioFabricacion);
        System.out.println("Velocidad máxima: " + velocidadMaxima + " km/h");
        System.out.println("Antigüedad: " + calcularAntiguedad() + " años");
        System.out.println("=============================================\n");
    }
}


