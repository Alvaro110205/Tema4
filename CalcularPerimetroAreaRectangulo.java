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
        int opcion;
        do {
            System.out.println("Elige una opción:");
            System.out.println("1-Primer rectangulo");
            System.out.println("2-Segundo rectangulo");
            System.out.println("3-Resumen");
            System.out.println("0. Salir");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    double perimetroFinal = calcularPerimetro(base, altura);
                    double areaFinal = calcularArea(base, altura);
                    break;
                case 2:
                    double perimetro2Final = calcularP2(base2, altura2);
                    double area2Final = calcularA2(base2, altura2);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (opcion != 0);
    }

    private static double calcularPerimetro(double base, double altura) {
        System.out.println("El perimetro es " + 2 * (base + altura));
        return 2 * (base + altura);
    }

    private static double calcularArea(double base, double altura) {
        System.out.println("El area es " + base * altura);
        return base * altura;
    }

    private static double calcularP2(double base2, double altura2) {
        System.out.println("El perimetro del segundo es " + 2 * (base2 + altura2));
        return 2 * (base2 + altura2);
    }

    private static double calcularA2(double base2, double altura2) {
        System.out.println("El area del segundo es " + base2 * altura2);
        return base2 * altura2;
    }
}
