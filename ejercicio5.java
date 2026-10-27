/*Escribe una función a la que se le pase un número entero y
devuelva el número de divisores primos que tiene.*/

import java.util.Scanner;
public  class ejercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero: ");
        int num = sc.nextInt();
        int divisoresPrimos = contarDivisoresPrimos(num);
        System.out.println("El número de divisores primos de " + num + " es: " + divisoresPrimos);
    }
    public static int contarDivisoresPrimos(int num) {
        int contador = 0;
        for (int i = 2; i <= num; i++) {
            if (num % i == 0 && esPrimo(i)) {
                contador++;
            }
        }
        return contador;
    }
    public static boolean esPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}