import java.util.Scanner;

public class CalcularPerimetroAreaRectangulo {

    private static final double FI = (1 + Math.sqrt(5)) / 2; // 1.6180339...
    private static final double TOL = 0.02;

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
            System.out.println("3-Aureo");
            System.out.println("0. Salir");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    calcularPerimetro(base, altura);
                    calcularArea(base, altura);
                    break;
                case 2:
                    calcularP2(base2, altura2);
                    calcularA2(base2, altura2);
                    break;
                case 3:
                    double perimetro1 = 2 * (base + altura);
                    double perimetro2 = 2 * (base2 + altura2);
                    System.out.println(esAureo(base, perimetro1, base2, perimetro2));
                    break;
                case 0:
                    System.out.println("Adiós");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (opcion != 0);
        scanner.close();
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

    private static boolean rectanguloAureo(double base, double perimetro) {
        double altura = perimetro / 2 - base;
        if (base <= 0 || altura <= 0) {
            return false; // no es un rectángulo válido
        }
        double mayor = Math.max(base, altura);
        double menor = Math.min(base, altura);
        return Math.abs(mayor / menor - FI) < TOL;
    }

    private static String esAureo(double base, double perimetro, double base2, double perimetro2) {
        boolean r1 = rectanguloAureo(base, perimetro);
        boolean r2 = rectanguloAureo(base2, perimetro2);

        if (r1 && r2) {
            return "Ambos rectángulos son áureos";
        } else if (r1) {
            return "Solo el primer rectángulo es áureo";
        } else if (r2) {
            return "Solo el segundo rectángulo es áureo";
        } else {
            return "Ninguno es áureo";
        }
    }
}