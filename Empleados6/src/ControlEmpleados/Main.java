package ControlEmpleados;

public class Main {

    public static void main(String[] args) {

        Empleados control = new Empleados("EMP-01", 12000.0, 10.0);

        System.out.println("Salario mensual: " + control.getSalarioMensual());
        System.out.println("Salario neto: " + control.calcularSalarioNeto());

        control.aplicarAumento(15);
        System.out.println("Salario después del aumento: " + control.getSalarioMensual());
    }
}
