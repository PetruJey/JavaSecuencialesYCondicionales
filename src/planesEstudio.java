import java.util.Scanner;

public class planesEstudio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántas horas al día puedes estudiar? ");
        int horasPorDia = sc.nextInt();

        generarPlanEstudio(horasPorDia);
    }

    private static void generarPlanEstudio(int horasPorDia) {
        String[] materias = {
                "Matemáticas",
                "Ciencias",
                "Historia",
                "Literatura",
                "Inglés",
                "Programación",
                "Arte"
        };

        int diasDeLaSemana = 7;
        int horasTotales = horasPorDia * diasDeLaSemana;

        System.out.println("\nPlan de estudio semanal:");
        for (int i = 0; i < diasDeLaSemana; i++) {
            System.out.printf("Día %d: %s - %d horas%n", i + 1, materias[i % materias.length], horasPorDia);
        }
    }
}
