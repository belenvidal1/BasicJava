package c14260824;

import java.util.Scanner;

public class ComisionAPP {
    public static void main(String[] args) {
        System.out.println("Calculador de comisiones");
        Scanner nuevscan = new Scanner(System.in);
        System.out.println("Ingrese el numero de ventas");
        Integer Ventas = nuevscan.nextInt();
        String comision;

        if (Ventas <= 10000 ) {
            comision = "no aplica comisión";
        } else if (Ventas > 10000 && Ventas <= 50000) {
                comision = "tienes comisión de 10%";
        } else if (Ventas > 50000 && Ventas <100000) {
            comision = "tienes comision de un 20%";
        } else {
            comision = "tienes una comisión del 30%";
        }
        System.out.println(comision);

    }
}
