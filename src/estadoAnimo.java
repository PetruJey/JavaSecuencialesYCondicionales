import java.util.Scanner;

public class estadoAnimo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuál es tu estado de ánimo?:\n1)Feliz\n2)Triste\n3)Enérgico\n4)Relajado\n ");
        int estadoAnimo = scanner.nextInt();
        String recomendacion;
        switch (estadoAnimo) {
            case 1:
                recomendacion = "¡Disfruta de una salida con amigos!";
                break;
            case 2:
                recomendacion = "Escucha tu música favorita o mira una buena película.";
                break;
            case 3:
                recomendacion = "Haz ejercicio o sal a correr.";
                break;
            case 4:
                recomendacion = "Practica meditación o lee un libro.";
                break;
            default:
                recomendacion = "Estado de ánimo no reconocido. Intenta otra vez.";
                break;
        }
        System.out.println("Recomendación: " + recomendacion);
        scanner.close();
    }
}
