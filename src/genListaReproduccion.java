import java.util.Scanner;
public class genListaReproduccion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione su estado de ánimo:\n1)Feliz\n2)Triste\n3)Energetico\n4)Relajado");
        int estadoAnimo = sc.nextInt();
        generarListaReproduccion(estadoAnimo);
    }

    private static void generarListaReproduccion(int estado) {
        switch (estado) {
            case 1:
                System.out.println("Lista de reproducción para estado de ánimo: Feliz");
                System.out.println("- 'Happy' - Pharrell Williams");
                System.out.println("- 'Good Vibrations' - The Beach Boys");
                System.out.println("- 'Walking on Sunshine' - Katrina and the Waves");
                break;
            case 2:
                System.out.println("Lista de reproducción para estado de ánimo: Triste");
                System.out.println("- 'Someone Like You' - Adele");
                System.out.println("- 'The Night We Met' - Lord Huron");
                System.out.println("- 'Tears Dry on Their Own' - Amy Winehouse");
                break;
            case 3:
                System.out.println("Lista de reproducción para estado de ánimo: Enérgico");
                System.out.println("- 'Uptown Funk' - Mark Ronson ft. Bruno Mars");
                System.out.println("- 'Can't Stop the Feeling!' - Justin Timberlake");
                System.out.println("- 'Stronger' - Kanye West");
                break;
            case 4:
                System.out.println("Lista de reproducción para estado de ánimo: Relajado");
                System.out.println("- 'Weightless' - Marconi Union");
                System.out.println("- 'Cold Little Heart' - Michael Kiwanuka");
                System.out.println("- 'River' - Leon Bridges");
                break;
            default:
                System.out.println("Por favor, elige un número entre 1 y 4.");
        }
    }
}
