package EvaluadorDeClases;

import java.util.Scanner;

public class Evaluador {
    public static void main(String[] args) {
        System.out.println("Bienvenido a tu evaluador de clases \n Recuerda solo numeros entre 0 y 10");
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa tu nota de matematicas: ");
        int mat = sc.nextInt();
        System.out.println("Ingresa tu nota de lenguaje: ");
        int leng = sc.nextInt();
        System.out.println("Ingresa tu nota de ingles: ");
        int ingl = sc.nextInt();

        Integer nota = (ingl + leng + mat) / 3;
        if (nota < 0 || nota > 10 ) {
            System.out.println("No valido");

        } else if (nota <= 3){
            System.out.println("No aprobado, echale ganas mijo ");
        }else if (nota >= 3 && nota < 5) {
            System.out.println("Tu promedio es Insuficiente");
        } else if (nota >= 5 && nota <= 8) {
            System.out.println("Tu promedio es Aceptable");
        } else if (nota >= 8 && nota <= 10) {
            System.out.println("¡Felicidades! tu promedio es Excelente");
        } else {

        }
    }
}
