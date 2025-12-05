package POO;

public class gestionLibros {
    // ATRIBUTOS//

    private String autor;
    private boolean disponible;
    private String id;

    //constructor//
    public gestionLibros(String id, String autor, boolean disponible) {
        this.id = id;
        this.autor = autor;
        this.disponible = disponible;
    }
              //METODO//
    public String getId() {
        return this.id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public void getAutor() {
        this.autor = autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isDisponible() {
        return disponible;
    }
    public void reservar(){
       if (this.disponible) {
           this.disponible = false;
           System.out.println("EL LIBRO HA SIDO RESERVADO");
       }else {
           System.out.println("EL LIBRO NO ESTA RESERVADO");
       }
    }

    public boolean esAptoParaPrestamos(int anioPublicacion) {
        int anioActual = 2025;
        int antiguedad = anioActual - anioPublicacion;
        return antiguedad> 5;

    }
}
