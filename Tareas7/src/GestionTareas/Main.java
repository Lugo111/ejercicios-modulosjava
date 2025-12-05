package GestionTareas;




// Clase Main.java
import java.util.ArrayList;
import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                ArrayList<Tareas> listaTareas = new ArrayList<>();

                // Entrada de datos
                System.out.print("Descripción de la tarea: ");
                String descripcion = scanner.nextLine();

                System.out.print("Prioridad (Baja/Media/Alta): ");
                String prioridad = scanner.nextLine();

                System.out.print("¿Está completada? (true/false): ");
                boolean completada = scanner.nextBoolean();

                // Crear tarea
                Tareas tarea = new Tareas(descripcion, prioridad, completada);
                listaTareas.add(tarea);

                // Mostrar información
                tarea.mostrarInformacion();

                // Probar comportamientos
                System.out.println("Probando método marcarComoCompletada():");
                tarea.marcarComoCompletada();

                System.out.println("\n¿Es urgente?: " + tarea.esUrgente());

                scanner.close();
            }
        }