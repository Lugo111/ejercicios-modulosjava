package CuentaBanco;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            // Crear cuenta de ahorros
            CuentaBancaria cuenta = new CuentaBancaria("1111", "yenn", 3);
            
            // Realizar depósito
            System.out.print("Ingrese la cantidad a depositar: $");
            double cantidadDeposito = scanner.nextDouble();
            cuenta.depositar(cantidadDeposito);
            System.out.println("Saldo actual: $" +  cuenta.getSaldo());
            System.out.println();

            // Realizar retiro
            System.out.print("Ingrese la cantidad a retirar: $");
            double cantidadRetiro = scanner.nextDouble();
            cuenta.retirar(cantidadRetiro);
            System.out.println("Saldo actual: $" + ( cuenta.getSaldo()));

            // Mostrar información final
            System.out.println("\n========== INFORMACIÓN FINAL ==========");
            System.out.println("Número de cuenta: " + cuenta.getNumeroCuenta());
            System.out.println("Titular: " + cuenta.getTitular());
            System.out.println("Saldo final: $" + ( cuenta.getSaldo()));
            System.out.println("=======================================");
        }
    }



