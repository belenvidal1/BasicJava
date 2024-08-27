package c14260824;

import java.util.Scanner;

public class tablademultiplicar {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        System.out.println("indica un numero para conocer su tabla de multiplicar del 1 al 10");
        Integer numeroIngresado = miScanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numeroIngresado + "x" + i + " = " + (numeroIngresado * i));
        }
    }
}
