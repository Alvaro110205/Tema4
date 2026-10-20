import java.util.Scanner;

public class CalcularPerimetroAreaRectangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la base del rectángulo: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese la altura del rectángulo: ");
        double altura = scanner.nextDouble();
        double perimetro = calcularPerimetro(base, altura);
        double area = calcularArea(base, altura);
        System.out.println("El perímetro del rectángulo es: " + perimetro);
        System.out.println("El área del rectángulo es: " + area);
    }

    private static double calcularPerimetro(double base, double altura) {
        return 2 * (base + altura);
    }

    private static double calcularArea(double base, double altura) {
        return base * altura;
    }
}
