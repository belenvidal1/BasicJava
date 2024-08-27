package c14260824;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        //los multiplos de 3 son "fizz", multiplos de 5 son buzz" y cuando son multiplos de ambos es "fizzbuzz"

        Scanner miscanner = new Scanner(System.in);
        System.out.println("ingresa el numero maximo");
        Integer numeromax = miscanner.nextInt();
        for (int i = 1; i <= numeromax; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }

    }
}
