import java.util.Scanner;

/*Diseñar una función que recibe como parámetros dos
números enteros y devuelve el mayor de ambos*/

    public class SobrecargaFunciones {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("dime el numero 1");
            int num1 = sc.nextInt();
            System.out.println("dime el numero 2");
            int num2 = sc.nextInt();
            mayor( num1,  num2);
        }
        private static int mayor (int num1, int num2){
            System.out.println("el numero mayor es " + (num1 > num2 ? num1 : num2));
            return  num1 > num2 ? num1 : num2;
        }
    }

