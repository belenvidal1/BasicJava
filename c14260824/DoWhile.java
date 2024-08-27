package c14260824;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        //el bucle do while ejecurara el bloque de codigos al menos una vez, incluso si la condición se evalua como false

        //Menu para calculadora
        Scanner miScanner = new Scanner(System.in);
        Integer opcion;
        do {
            System.out.println("ingresa una opción");
            System.out.println(" 0 - salir \n 1 - sumar \n 2 - restar \n 3 - multiplicar \n 4 - dividir" );
            opcion = miScanner.nextInt();
            switch (opcion) {
                case 0:
                    System.out.println("saliste de la calculadora");
                    break;
                case 1:
                    System.out.println("la suma es: ");
                    break;
                case 2:
                    System.out.println("la resta es: ");
                    break;
                case 3:
                    System.out.println("la multiplicacion es: ");
                    break;
                case 4:
                    System.out.println("la division es: ");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            };
        } while (opcion < 0 || opcion > 4);
    }
}
