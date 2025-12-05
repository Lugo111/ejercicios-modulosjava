
import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                // Entrada de datos
                System.out.print("Ingrese el código del vuelo: ");
                String codigo = scanner.nextLine();

                System.out.print("Ingrese la capacidad máxima de asientos: ");
                int capacidad = scanner.nextInt();

                System.out.print("Ingrese el número actual de asientos reservados: ");
                int reservados = scanner.nextInt();

                // Crear objeto Vuelo
                Aereas vuelo = new Aereas(codigo, capacidad, reservados);



               



                // Intentar realizar una reserva
                System.out.println("--- INTENTANDO REALIZAR RESERVA ---");
                System.out.print("Número de asientos a reservar: ");
                int numeroAsientos = scanner.nextInt();



                // Mostrar porcentaje de ocupación
                double porcentaje = vuelo.calcularPorcentajeOcupacion();
                System.out.println("\nPorcentaje de ocupación actual: " + ( porcentaje) + "%");


                scanner.close();
            }
        }

