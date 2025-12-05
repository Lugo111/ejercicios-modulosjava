package ControlEmpleados;

public class Empleados {

    private String claveEmpleado;
    private double salarioMensual;
    private double porcentajeRetencion;

    public Empleados(String claveEmpleado, double salarioMensual, double porcentajeRetencion) {
        this.claveEmpleado = claveEmpleado;
        this.salarioMensual = salarioMensual;
        this.porcentajeRetencion = porcentajeRetencion;
    }

    public String getClaveEmpleado() {
        return claveEmpleado;
    }

    public void setClaveEmpleado(String claveEmpleado) {
        this.claveEmpleado = claveEmpleado;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    public double getPorcentajeRetencion() {
        return porcentajeRetencion;
    }

    public void setPorcentajeRetencion(double porcentajeRetencion) {
        this.porcentajeRetencion = porcentajeRetencion;
    }

    // Comportamiento 1: Calcular salario neto
    public double calcularSalarioNeto() {
        double retencion = salarioMensual * (porcentajeRetencion / 100);
        return salarioMensual - retencion;
    }

    // Comportamiento 2: Aplicar aumento
    public void aplicarAumento(double porcentajeAumento) {
        if (porcentajeAumento > 0) {
            salarioMensual += salarioMensual * (porcentajeAumento / 100);
        } else {
            System.out.println("El porcentaje de aumento debe ser positivo.");
        }
    }
}

