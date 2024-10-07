import java.util.Scanner;

public class recomendacionLibro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce tu género de libro favorito:\n1)Fantasía\n2)Misterio\n3)Romance\n4)Ciencia ficción\n");
        int generoFavorito = scanner.nextInt();
        String recomendacion;
        switch (generoFavorito) {
            case 1:
                recomendacion = "Te recomendamos 'El Señor de los Anillos' de J.R.R. Tolkien.";
                break;
            case 2:
                recomendacion = "Te recomendamos 'El Código Da Vinci' de Dan Brown.";
                break;
            case 3:
                recomendacion = "Te recomendamos 'Orgullo y Prejuicio' de Jane Austen.";
                break;
            case 4:
                recomendacion = "Te recomendamos 'Dune' de Frank Herbert.";
                break;
            default:
                recomendacion = "Género no reconocido. No tenemos recomendaciones para ti.";
                break;
        }
        System.out.println(recomendacion);
        scanner.close();
    }
}
