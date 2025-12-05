package GestionTareas;

public class Tareas {

    private String descripcion;
    private String prioridad; // "Baja", "Media", "Alta"
    private boolean completada;

    // Constructor
    public Tareas(String descripcion, String prioridad, boolean completada) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.completada = completada;
    }

    // Getters y Setters
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    // Comportamiento 1: Cambiar estado a Completada
    public void marcarComoCompletada() {
        this.completada = true;
        System.out.println("La tarea '" + descripcion + "' ha sido marcada como completada.");
    }

    // Comportamiento 2: Determinar si la tarea es Urgente
    public boolean esUrgente() {
        return this.prioridad.equalsIgnoreCase("Alta") && !this.completada;
    }

    // Método para mostrar información de la tarea
    public void mostrarInformacion() {
        System.out.println("\n========== INFORMACIÓN DE LA TAREA ==========");
        System.out.println("Descripción: " + descripcion);
        System.out.println("Prioridad: " + prioridad);
        System.out.println("Estado: " + (completada ? "Completada" : "Pendiente"));
        System.out.println("¿Es urgente?: " + (esUrgente() ? "SÍ" : "NO"));
        System.out.println("============================================\n");
    }
}

