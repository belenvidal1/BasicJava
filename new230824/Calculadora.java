package new230824;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        System.out.println("***Bienvenido a tu Calculadora***");
        Scanner nuevoScanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int n1 = nuevoScanner.nextInt();
        System.out.println("Ingrese un numero: ");
        int n2 = nuevoScanner.nextInt();

        Integer adi = n1 + n2;
        Integer sus = n1 - n2;
        Integer mult = n1 * n2;
        Integer div = n1 / n2;
        Integer rest = n1 % n2;

        System.out.println("- La suma de los números es: " + adi);
        System.out.println("- El resultado de la resta es: " + sus);
        System.out.println("- El resultado de la mult es: " + mult);
        System.out.println("- El resultado de la div es: " + div);
        System.out.println("- El resto de la división es: " + rest);


    }
}
