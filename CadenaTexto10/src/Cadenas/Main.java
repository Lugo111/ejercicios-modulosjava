package Cadenas;




import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                // Entrada de datos
                System.out.print("Ingrese la cadena de texto: ");
                String cadena = scanner.nextLine();

                System.out.print("Ingrese el identificador de módulo: ");
                String identificador = scanner.nextLine();

                System.out.print("Ingrese la longitud máxima permitida: ");
                int longitudMax = scanner.nextInt();
                scanner.nextLine(); // Limpiar buffer

                // Crear objeto CadenaCaracteres
                Texto texto = new Texto(cadena, identificador, longitudMax);

                // Mostrar información inicial
                texto.mostrarInformacion();

                // Agregar prefijo
                System.out.print("Ingrese el prefijo a añadir: ");
                String prefijo = scanner.nextLine();

                String cadenaConPrefijo = texto.agregarPrefijo(prefijo);
                System.out.println("Cadena con prefijo: \"" + cadenaConPrefijo + "\"");

                // Contar espacios en blanco
                int espacios = texto.contarEspaciosBlanco();
                System.out.println("\nCantidad de espacios en blanco: " + espacios);

                scanner.close();
            }
        }


