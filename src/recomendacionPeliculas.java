import java.util.Scanner;

public class recomendacionPeliculas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuál es tu género de película favorito?\n1)Acción\n2)Comedia\n3)Drama\n4)Ciencia ficción\n");
        int genero = sc.nextInt();
        recomendarPelicula(genero);
    }

    private static void recomendarPelicula(int genero) {
        switch (genero) {
            case 1:
                System.out.println("Te recomendamos ver: 'Mas dura será la caída'.");
                break;
            case 2:
                System.out.println("Te recomendamos ver: 'Click'.");
                break;
            case 3:
                System.out.println("Te recomendamos ver: 'La isla Siniestra'.");
                break;
            case 4:
                System.out.println("Te recomendamos ver: 'Inception'.");
                break;
            default:
                System.out.println("Por favor, ingrese un número del 1 al 4.");
        }
    }
}
