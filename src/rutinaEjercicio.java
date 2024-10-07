import java.util.Scanner;

public class rutinaEjercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su nivel de condición física: \n1: Principiante\n2: Intermedio\n3: Avanzado\n ");
        int nivel = sc.nextInt();

        generarRutina(nivel);
    }

    private static void generarRutina(int nivel) {
        String[] ejerciciosPrincipiante = {
                "Caminata - 30 minutos",
                "Yoga - 30 minutos",
                "Entrenamiento de fuerza (cuerpo completo) - 20 minutos",
                "Nadar - 20 minutos",
                "Ciclismo suave - 30 minutos"
        };

        String[] ejerciciosIntermedio = {
                "Correr - 30 minutos",
                "Entrenamiento de circuito - 40 minutos",
                "Yoga - 30 minutos",
                "Nadar - 30 minutos",
                "Ciclismo - 45 minutos"
        };

        String[] ejerciciosAvanzado = {
                "Correr - 60 minutos",
                "Entrenamiento de fuerza (musculación) - 60 minutos",
                "HIIT - 30 minutos",
                "Natación intensa - 40 minutos",
                "Ciclismo de montaña - 60 minutos"
        };

        System.out.println("Tu rutina de ejercicios semanal:");
        switch (nivel) {
            case 1:
                for (String ejercicio : ejerciciosPrincipiante) {
                    System.out.println("- " + ejercicio);
                }
                break;
            case 2:
                for (String ejercicio : ejerciciosIntermedio) {
                    System.out.println("- " + ejercicio);
                }
                break;
            case 3:
                for (String ejercicio : ejerciciosAvanzado) {
                    System.out.println("- " + ejercicio);
                }
                break;
            default:
                System.out.println("Nivel de condición física no reconocido. Por favor, introduce un número entre 1 y 3.");
        }
    }
}
