import java.util.Scanner;
public class costoViaje {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la distancia del viaje en kilómetros: ");
        double distancia = sc.nextDouble();
        System.out.print("Ingrese el consumo de combustible del vehículo en litros por kilómetro: ");
        double consumoLitrosPorKm = sc.nextDouble();
        System.out.print("Ingrese el precio del combustible por litro: ");
        double precioPorLitro = sc.nextDouble();
        double costoTotal = calcularCostoViaje(distancia, consumoLitrosPorKm, precioPorLitro);
        System.out.printf("El costo total del viaje es: %.2f unidades monetarias%n", costoTotal);
    }
    private static double calcularCostoViaje(double distancia, double consumoLitrosPorKm, double precioPorLitro) {return distancia * consumoLitrosPorKm * precioPorLitro;
    }
}
