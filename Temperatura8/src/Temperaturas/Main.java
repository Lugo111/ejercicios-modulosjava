package Temperaturas;



import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Entrada de datos
            System.out.print("Ingrese el valor de la temperatura: ");
            double valor = scanner.nextDouble();
            scanner.nextLine(); // Limpiar buffer

            System.out.print("Ingrese la unidad de medida (Celsius/Fahrenheit): ");
            String unidad = scanner.nextLine();

            System.out.print("Ingrese la fecha de registro (dd/mm/yyyy): ");
            String fecha = scanner.nextLine();

            // Crear objeto Temperatura
            Temperatura temp = new Temperatura(valor, unidad, fecha);

            // Mostrar información inicial
            System.out.println("\n--- INFORMACIÓN INICIAL ---");
            temp.mostrarInformacion();

            // Evaluar si es extrema
            System.out.println("Evaluando temperatura extrema: " + (temp.esExtrema() ? "SÍ es extrema" : "NO es extrema"));

            // Convertir temperatura
            System.out.println("\n--- CONVERSIÓN DE TEMPERATURA ---");
            temp.convertir();

            // Mostrar información después de la conversión
            System.out.println("\n--- INFORMACIÓN DESPUÉS DE CONVERSIÓN ---");
            temp.mostrarInformacion();


        }
    }


