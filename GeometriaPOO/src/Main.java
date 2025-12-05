//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        GeometriaBasica GeometriaBasica = new GeometriaBasica(0.0, 0.0, "");

       
        GeometriaBasica rectangulo = new GeometriaBasica(5.0, 3.0, "Rectángulo A");

        // Mostrar resultados
        System.out.println("Etiqueta: " + rectangulo.getEtiqueta());
        System.out.println("Base: " + rectangulo.getBase());
        System.out.println("Altura: " + rectangulo.getAltura());
        System.out.println("Área: " + rectangulo.calcularArea());
        System.out.println("Perímetro: " + rectangulo.calcularPerimetro());


        }
    }


