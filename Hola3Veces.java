public class Hola3Veces {
    static int valor = 3;

    public static void main(String[] args) {
        imprimirHola3Veces();
    }
//void no devuoeve ningun parametro, es decir no devuelve nada

    private static void imprimirHola3Veces() {
        for (int i = 0; i < valor; i++) {
            System.out.println("Hola");
        }
    }
}
