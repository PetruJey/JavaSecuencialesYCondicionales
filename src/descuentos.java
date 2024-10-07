import java.util.Scanner;

public class descuentos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el precio del producto: ");
        double precioProducto = scanner.nextDouble();
        System.out.print("Introduce la categoría del cliente:\n1)Estudiante\n2)Adulto\n3)Jubilado\n");
        int categoriaCliente = scanner.nextInt();
        double descuento;
        switch (categoriaCliente) {
            case 1:
                descuento = 0.10;
                break;
            case 2:
                descuento = 0.05;
                break;
            case 3:
                descuento = 0.15;
                break;
            default:
                System.out.println("Categoría no reconocida. No se aplicará descuento.");
                descuento = 0.0;
                break;
        }
        double precioFinal = precioProducto - (precioProducto * descuento);
        System.out.printf("El precio final después del descuento es: %.2f%n", precioFinal);
        scanner.close();
    }
}
