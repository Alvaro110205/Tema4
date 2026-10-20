public class Hola3Veces {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int valor = scanner.nextInt();
        SaludarVariasVeces(valor);
        SaludarVariasVeces(5);
        SaludarVariasVeces(10);

    }
//void no devuoeve ningun parametro, es decir no devuelve nada

    private static void SaludarVariasVeces(int valor) {
        System.out.println("Te voy a saludar " + valor + " veces:");
        for (int i = 0; i < valor; i++) {
            System.out.println("Hola");
        }
    }
}
