import java.util.Scanner;
public class Horoscop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int dia, mes, annio;
        System.out.println("Introduzca su dia de nacimiento:");
        dia = sc.nextInt();
        System.out.println("Introduzca su mes de nacimiento:");
        mes = sc.nextInt();
        System.out.println("Introduzca su año de nacimiento:");
        annio = sc.nextInt();
        String signZod = obtSign(dia, mes);
        String msjHoros = obtHoros(signZod);

        System.out.println("Tu signo zodiacal es: " + signZod);
        System.out.println(msjHoros);
    }
    private static String obtSign(int dia, int mes) {
        if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            return "Acuario";
        } else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {return "Piscis";
        } else if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {return "Aries";
        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {return "Tauro";
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {return "Géminis";
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {return "Cáncer";
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {return "Leo";
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {return "Virgo";
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {return "Libra";
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {return "Escorpio";
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {return "Sagitario";
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {return "Capricornio";
        }return "Signo no reconocido";
    }
    private static String obtHoros(String signo) {
        if (signo == "Aries") {return "Hoy es un buen día para iniciar nuevos proyectos.";
        } else if (signo == "Tauro") {return "La paciencia te llevará lejos, no te apresures.";
        } else if (signo == "Géminis") {return "Comunícate más, tus ideas son valiosas.";
        } else if (signo == "Cáncer") {return "Familia y amigos pueden ser un gran apoyo hoy.";
        } else if (signo == "Leo") {return "Tu carisma estará en su mejor momento, ¡úsalo!";
        } else if (signo == "Virgo") {return "La organización es clave para el éxito hoy.";
        } else if (signo == "Libra") {return "Busca el equilibrio en tus relaciones personales.";
        } else if (signo == "Escorpio") {return "Tu intuición te guiará en decisiones importantes.";
        } else if (signo == "Sagitario") {return "Aventúrate y no le temas a lo nuevo.";
        } else if (signo == "Capricornio") {return "La disciplina será tu mejor aliada hoy.";
        } else if (signo == "Acuario") {return "Las ideas innovadoras fluirán con facilidad.";
        } else if (signo == "Piscis") {return "Escucha tus emociones y confía en tu instinto.";
        }return "Signo no reconocido";
    }
}
