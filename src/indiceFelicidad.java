import java.util.Scanner;

public class indiceFelicidad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Evaluación de felicidad:");

        // Solicitar factores de felicidad
        System.out.print("Nivel de satisfacción con la vida (1-10): ");
        int satisfaccionVida = sc.nextInt();

        System.out.print("Nivel de estrés (1-10, donde 1 es bajo y 10 es alto): ");
        int estres = sc.nextInt();

        System.out.print("Nivel de salud (1-10): ");
        int salud = sc.nextInt();

        System.out.print("Nivel de relaciones personales (1-10): ");
        int relaciones = sc.nextInt();

        // Calcular índice de felicidad
        double indiceFelicidad = calcularIndiceFelicidad(satisfaccionVida, estres, salud, relaciones);

        // Imprimir el resultado
        System.out.printf("Tu índice de felicidad es: %.2f%n", indiceFelicidad);
    }

    private static double calcularIndiceFelicidad(int satisfaccionVida, int estres, int salud, int relaciones) {
        // Fórmula simple para calcular el índice de felicidad
        return (satisfaccionVida + (10 - estres) + salud + relaciones) / 4.0; // Inverso del estrés
    }
}
