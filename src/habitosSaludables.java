import java.util.Scanner;

public class habitosSaludables {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuántas horas al día duermes? ");
        int horasSueno = scanner.nextInt();
        System.out.print("¿Cuántas horas al día haces ejercicio? ");
        int horasEjercicio = scanner.nextInt();
        System.out.print("¿Cuántas comidas saludables consumes al día? ");
        int comidasSaludables = scanner.nextInt();
        String evaluacion = (horasSueno < 7 ? "Necesitas dormir más horas. " : "Tienes un buen hábito de sueño. ") +
                (horasEjercicio < 1 ? "Deberías hacer más ejercicio. " : "¡Excelente! Haces suficiente ejercicio. ") +
                (comidasSaludables < 3 ? "Intenta consumir más comidas saludables. " : "¡Muy bien! Estás consumiendo suficientes comidas saludables. ");

        System.out.println("Evaluación de tus hábitos saludables: " + evaluacion);
        scanner.close();
    }
}
