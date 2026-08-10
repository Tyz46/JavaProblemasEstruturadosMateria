//public class Main {
//
//    public static void main(String[] args) {
//
//        Triangulo triangulo = new Triangulo(10, 5);
//        Retangulo retangulo = new Retangulo(10, 5);
//
//        System.out.println("Área do triângulo: " + triangulo.CalcularArea());
//        System.out.println("Área do retângulo: " + retangulo.CalcularArea());
//    }
//}

public class Main {

    public static void main(String[] args) {

        Forma retangulo = new Retangulo(10, 6);
        Forma triangulo = new Triangulo(10, 6);

        System.out.println("Área do retângulo: " + retangulo.CalcularArea());
        System.out.println("Área do triângulo: " + triangulo.CalcularArea());
    }
}