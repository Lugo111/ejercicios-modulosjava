package Temperaturas;

public class Temperatura {


    // Atributos
    private double valor;
    private String unidadMedida; // "Celsius" o "Fahrenheit"
    private String fechaRegistro;

    // Constructor
    public Temperatura(double valor, String unidadMedida, String fechaRegistro) {
        this.valor = valor;
        this.unidadMedida = unidadMedida;
        this.fechaRegistro = fechaRegistro;
    }

    // Getters y Setters
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    // Comportamiento 1: Convertir temperatura
    public void convertir() {
        if (unidadMedida.equalsIgnoreCase("Celsius")) {
            // Convertir de Celsius a Fahrenheit
            double nuevoValor = (valor * 9/5) + 32;
            this.valor = nuevoValor;
            this.unidadMedida = "Fahrenheit";
            System.out.println("Temperatura convertida a Fahrenheit: " + nuevoValor + "°F");
        } else if (unidadMedida.equalsIgnoreCase("Fahrenheit")) {
            // Convertir de Fahrenheit a Celsius
            double nuevoValor = (valor - 32) * 5/9;
            this.valor = nuevoValor;
            this.unidadMedida = "Celsius";
            System.out.println("Temperatura convertida a Celsius: " + nuevoValor + "°C");
        } else {
            System.out.println("Unidad de medida no válida.");
        }
    }

    // Comportamiento 2: Evaluar si la temperatura es extrema
    public boolean esExtrema() {
        if (unidadMedida.equalsIgnoreCase("Celsius")) {
            return valor > 40;
        } else if (unidadMedida.equalsIgnoreCase("Fahrenheit")) {
            return valor > 104; // Equivalente a 40°C
        }
        return false;
    }

    // Método para mostrar información
    public void mostrarInformacion() {
        System.out.println("\n========== INFORMACIÓN DE TEMPERATURA ==========");
        System.out.println("Valor: " + valor + "°" + (unidadMedida.equalsIgnoreCase("Celsius") ? "C" : "F"));
        System.out.println("Unidad de medida: " + unidadMedida);
        System.out.println("Fecha de registro: " + fechaRegistro);
        System.out.println("¿Es extrema?: " + (esExtrema() ? "SÍ" : "NO"));
        System.out.println("===============================================\n");
    }
}


