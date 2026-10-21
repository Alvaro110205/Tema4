//Escribir una función a la que se le pasen dos enteros y
//muestre todos los números comprendidos entre ellos y la
//suma de todos ellos.
import java.util.Scanner;

public class SumaNum {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
        System.out.println("dame el primer valor");
        int valor1 = scanner.nextInt();
        System.out.println("dame el segundo valor");
        int valor2 = scanner.nextInt();
        int suma=0;
        ComprendidosySuma(valor1,valor2,suma);
    }
    private static int ComprendidosySuma(int valor1, int valor2, int suma) {
        for (int i = valor1; i <= valor2; i++) {
             suma = suma + i;
            System.out.println(i);

        }
        System.out.println(suma);
        return suma;

    } 
}
