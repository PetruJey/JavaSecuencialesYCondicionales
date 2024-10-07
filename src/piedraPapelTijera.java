import java.util.Random;
import java.util.Scanner;

public class piedraPapelTijera {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Elige una opción: 1 - Piedra, 2 - Papel, 3 - Tijera: ");
        int eleccionUsuario = scanner.nextInt();
        int eleccionComputadora = random.nextInt(3) + 1; // Genera un número entre 1 y 3
        System.out.println("Tu elección: " + eleccionUsuario);
        System.out.println("Elección de la computadora: " + eleccionComputadora);
        if (eleccionUsuario == eleccionComputadora) {System.out.println("¡Es un empate!");
        } else if ((eleccionUsuario == 1 && eleccionComputadora == 3) ||
                (eleccionUsuario == 2 && eleccionComputadora == 1) ||
                (eleccionUsuario == 3 && eleccionComputadora == 2)) {
            System.out.println("¡Tú ganas!");
        } else {System.out.println("¡La computadora gana!");
        }
        scanner.close();
    }
}
