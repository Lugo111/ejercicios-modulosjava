package DatosVehiculos;

public class Main {


        public static void main(String[] args) {

            AutoMovil a = new AutoMovil("", 0, 0.0);

            a = new AutoMovil("Nissan", 2010, 220.0);

            // Mostrar datos del coche
            System.out.println("Marca: " + a.getMarca());
            System.out.println("Año de fabricación: " + a.getAnioFabricacion());
            System.out.println("Velocidad máxima: " + a.getVelocidadMaxima() + " km/h");

            // Probar funciones
            System.out.println(a.encender());
            System.out.println("Antigüedad del vehículo: " + a.calcularAntiguedad() + " años");
        }

        }



