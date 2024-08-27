package c14260824;

import java.util.Scanner;

public class juegoAdivinanza {
    public static void main(String[] args) {
        Scanner miscanner = new Scanner(System.in);
        Integer numeroAzar = (int) (Math.random() * 10) + 1;
        Integer numeroingresado = 0;

        System.out.println("Adivina el numero misterioro y te ganas un Iphone");
        System.out.println("el numero misterioso esta entre el 1 y el 10");

        while (numeroingresado != numeroAzar) {
            System.out.println("ingresa tu numero");
            numeroingresado = miscanner.nextInt();
            if (numeroingresado < numeroAzar) {
                System.out.println("muy poco, intentalo de nuevo");
            } else if (numeroingresado > numeroAzar) {
                System.out.println("muy alto, intentalo de nuevo");
            }
        }
        System.out.println("te engañamos, no tenemos iphone pero tenemos patito");




        /***Bucle do while***/

        do{
            //Esto se va a ejecutar por lo menos una vez sin verificar la condición
            System.out.println("ingresa un numero");
            numeroingresado = miscanner.nextInt();
            if (!numeroingresado.equals(numeroAzar)) {
                System.out.println("Intentalo de nuevo");
            }
            //condicion a cumplirse para que
        } while (!numeroingresado.equals(numeroAzar));
        System.out.println("Te engañamos, no tenemos Iphone pero tenemos patito");
    }
}
