package Cadenas;

public class Texto {

    private String cadenaTexto;
    private String identificadorModulo;
    private int longitudMaxima;

    // Constructor
    public Texto(String cadenaTexto, String identificadorModulo, int longitudMaxima) {
        this.cadenaTexto = cadenaTexto;
        this.identificadorModulo = identificadorModulo;
        this.longitudMaxima = longitudMaxima;
    }

    // Getters y Setters
    public String getCadenaTexto() {
        return cadenaTexto;
    }

    public void setCadenaTexto(String cadenaTexto) {
        this.cadenaTexto = cadenaTexto;
    }

    public String getIdentificadorModulo() {
        return identificadorModulo;
    }

    public void setIdentificadorModulo(String identificadorModulo) {
        this.identificadorModulo = identificadorModulo;
    }

    public int getLongitudMaxima() {
        return longitudMaxima;
    }

    public void setLongitudMaxima(int longitudMaxima) {
        this.longitudMaxima = longitudMaxima;
    }

    // Comportamiento 1: Añadir prefijo
    public String agregarPrefijo(String prefijo) {
        String resultado = prefijo + cadenaTexto;

        if (resultado.length() > longitudMaxima) {
            System.out.println("Advertencia: La cadena con prefijo excede la longitud máxima (" + longitudMaxima + ")");
        }

        return resultado;
    }

    // Comportamiento 2: Contar espacios en blanco
    public int contarEspaciosBlanco() {
        int contador = 0;
        for (int i = 0; i < cadenaTexto.length(); i++) {
            if (cadenaTexto.charAt(i) == ' ') {
                contador++;
            }
        }
        return contador;
    }

    public void mostrarInformacion() {


            System.out.println("\n========== INFORMACIÓN DE LA CADENA ==========");
            System.out.println("Cadena de texto: \"" + cadenaTexto + "\"");
            System.out.println("Identificador de módulo: " + identificadorModulo);
            System.out.println("Longitud actual: " + cadenaTexto.length());
            System.out.println("Longitud máxima permitida: " + longitudMaxima);
            System.out.println("Espacios en blanco: " + contarEspaciosBlanco());
            System.out.println("=============================================\n");
        }
    }






