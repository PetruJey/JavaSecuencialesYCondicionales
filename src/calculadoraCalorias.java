import java.util.Scanner;
public class calculadoraCalorias {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su peso en kilogramos: ");
        double peso = sc.nextDouble();

        System.out.print("Ingrese la duración del ejercicio en minutos: ");
        int duracion = sc.nextInt();

        System.out.print("Ingrese el tipo de ejercicio: \n1)correr \n2)nadar \n3)bicicleta\n");
        int tipoEjercicio = sc.nextInt();

        double caloriasQuemadas = calcularCalorias(tipoEjercicio, peso, duracion);

        if (caloriasQuemadas >= 0) {System.out.printf("Calorías quemadas: %.2f kcal%n", caloriasQuemadas);
        } else {System.out.println("Tipo de ejercicio no reconocido.");
        }
    }
    private static double calcularCalorias(int tipo, double peso, int minutos) {
        double tasaCaloriasPorMinuto;

        switch (tipo) {
            case 1:
                tasaCaloriasPorMinuto = 0.15;
                break;
            case 2:
                tasaCaloriasPorMinuto = 0.13;
                break;
            case 3:
                tasaCaloriasPorMinuto = 0.10;
                break;
            default: return -1;
        }return tasaCaloriasPorMinuto * peso * minutos;
    }
}
