/*Diseña una función con el siguiente prototipo:

static boolean esPrimo(int n)

que devolverá true si n es primo y false si no lo es.*/

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("dime un numero");
        int num1 = sc.nextInt();
        System.out.println(esPrimo(num1));
    }

    static boolean esPrimo (int num1){
        if (num1 < 2) {
            return false;
        }
        for (int i = 2; i <= num1 / i; i++) {
            if (num1 % i == 0) {
                return false;
            }
        }
        return true;
    }
}
