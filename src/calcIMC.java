import java.util.Scanner;

public class calcIMC {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce tu peso en kilogramos: ");
        double peso = scanner.nextDouble();
        System.out.print("Introduce tu altura en centímetros: ");
        double alturaCm = scanner.nextDouble();
        double altura = alturaCm / 100;
        double imc = peso / (altura * altura);
        String recomendacion;
        if (imc < 18.5) {recomendacion = "Bajo peso";
        } else if (imc >= 18.5 && imc < 24.9) {recomendacion = "Peso normal";
        } else if (imc >= 25 && imc < 29.9) {recomendacion = "Sobrepeso";
        } else {recomendacion = "Obesidad";
        }
        System.out.printf("Tu IMC es: %.2f%n", imc);
        System.out.println("Recomendación: " + recomendacion);
        scanner.close();
    }
}
