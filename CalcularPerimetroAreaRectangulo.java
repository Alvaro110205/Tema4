import java.util.Scanner;

public class CalcularPerimetroAreaRectangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la base del rectángulo: ");
        double base = scanner.nextDouble();
        System.out.println("Ingrese la altura del rectángulo: ");
        double altura = scanner.nextDouble();
        System.out.println("Ingrese la base del segundo rectangulo");
        double base2 = scanner.nextDouble();
        System.out.println("Ingrese la altura del segundo rectangulo");
        double altura2 = scanner.nextDouble();
        double perimetro = calcularPerimetro(base, altura);
        double area = calcularArea(base, altura);
        double perimetro2 = calcularPerimetro(base2, altura2);
        double area2 = calcularArea(base2, altura2);
        System.out.println("El perímetro del rectángulo es: " + perimetro);
        System.out.println("El área del rectángulo es: " + area);
        System.out.println("El perímetro del segundo rectángulo es: " + perimetro2);
        System.out.println("El área del segundo rectángulo es: " + area2);
    }

    private static double calcularPerimetro(double base, double altura) {
        return 2 * (base + altura);
    }

    private static double calcularArea(double base, double altura) {
        return base * altura;
    }
}
