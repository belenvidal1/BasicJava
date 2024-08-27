package c14260824;

public class BucleWhile {
    public static void main(String[] args) {
        //el bucle se ejecuta indefinidamente siempre y cuando la condicion se evalie como verdadera
        //evitar el bucle infinito.. bucle while puede ser de riesgo

        /***contador de despegue***/

        System.out.println("El cohete despega en: ");
        Integer variableacumuladora = 10;

        //while significa que "mientras" la condicion sea true, va a seguir iterando
        while (variableacumuladora >= 0){
            //imprimo el valor de variable acumuladora
            System.out.println(variableacumuladora);
            //le resto uno a variableacumuladora
            variableacumuladora--;
        }
        System.out.println("¡Despegue!");
    }
}
