import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        System.out.println("Seleccione la operación: ");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        int opcion = scanner.nextInt();
        int resultado = 0;
        switch (opcion) {
            case 1:
                resultado = sumar(num1, num2);
                System.out.println("El resultado de la suma es: " + resultado);
                break;
            case 2:
                resultado = restar(num1, num2);
                System.out.println("El resultado de la resta es: " + resultado);
                break;
            case 3:
                resultado = multiplicar(num1, num2);
                System.out.println("El resultado de la multiplicación es: " + resultado);
                break;
            case 4:
                try {
                    resultado = dividir(num1, num2);
                    System.out.println("El resultado de la división es: " + resultado);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                    return;
                }
        }
    }

    private static int sumar(int a, int b) {
        return a + b;
    }

    private static int restar(int a, int b) {
        return a - b;
    }

    private static int multiplicar(int a, int b) {
        return a * b;
    }

    private static int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        } else {
            return a / b;
        }
    }
}
