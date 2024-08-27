package new230824;

import java.util.Scanner;

public class operadores {
    public static void main(String[] args) {
        //System.out.println("hola mundo");
        //Creamos nuestra instancia de Scanner para poder solicitar datos por consola
        System.out.println("Bienvenido a  la calculadora de suma");
        Scanner miScanner = new Scanner(System.in);
        System.out.println("Indica primer numero: ");
        Integer numeroUno = miScanner.nextInt();

        System.out.println("Indica segundo numero: ");
        Integer numeroDos = miScanner.nextInt();
        miScanner.nextLine(); //le avisa al scanner que recibira otro dato, de tipo string

        /***Operadores aritmeticos***/
        //suma +
        Integer resultadoSuma = numeroUno + numeroDos;
        System.out.println("El resultado de la suma es: " + resultadoSuma);

        Integer resultadoResta = numeroUno - numeroDos;
        Integer resultadoMultiplicacion = numeroUno * numeroDos;
        Integer resultadoDivision = numeroUno / numeroDos;

        Integer resto = numeroUno % numeroDos;

        System.out.println("resta= " + resultadoResta + '\n' + "multiplicacion= " + resultadoMultiplicacion + '\n' + "division= " + resultadoDivision + '\n' + "el resto de la división es =" + resto);

        /***Operadores de asignación***/
        //= =+ =- =* = ++ --//

        //System.out.println("el Resultado de la asignación es " + (numeroUno + numeroDos));

        //preincremento, sucede al momento de leer la instrucción
        //System.out.println("el preincremento es: " + ++numeroUno);

        //posincremento
        //numeroUno++;
        //System.out.println("el posincremento es: " + numeroUno);

        //operadores de comparación
        // == < > !=
        System.out.println("Inserta tu palabra: ");

        String palabraUno = miScanner.nextLine();
        System.out.println("Inserta otra palabra: ");
        String palabraDos = miScanner.nextLine();

        Boolean igualdad = numeroUno == numeroDos;
        Boolean igualLetras = palabraUno.equals(palabraDos);

        System.out.println("Los numeros son iguales? " + igualdad);
        System.out.println("las letras son iguales? : " + igualLetras);

        Boolean esMayor = numeroUno > numeroDos;
        Boolean esMenor = numeroUno < numeroDos;
        Boolean esDistinto = numeroUno != numeroDos;
        
        System.out.println("la primera comparación da como resultado : " + esMayor + '\n' + "la segunda da como resultado : " + esMenor + '\n' + "la tercera comparación da como resultado : " + esDistinto);

        /***Operadores logicos***/
        boolean combinacionDeCondiciones = ((5 > 6 ) && (10 < 20));
        System.out.println("la expresión es : " + combinacionDeCondiciones);
        boolean combinacionPosibilidades = ((10>20) || (5 < 4));
        System.out.println("la expresión es : " + combinacionPosibilidades);


        /***Operadores de flujo***/
        //if - else if - else

        boolean comprobacion = palabraUno.equals("hola");
        if (comprobacion){
            //bloque a ejecutarse si la condicion se evalua
            System.out.println("las palabras son iguales");
        } else {
            System.out.println("las palabras son diferentes");
        }

        //juego adivinanza
        //Math.random() metodo que genera numero al azar entre 0 y 1
        Integer numAzar = (int) (Math.random() * 10) + 1;

        System.out.println("Adivina el numero del 1 al 10");
        Integer numeroEscogido = miScanner.nextInt();

        if(numAzar == numeroEscogido) {
            System.out.println("felicidades ganaste un patito");
        } else if (numeroEscogido < numAzar) {
            System.out.println("Muy bajo");
        } else {
            System.out.println("Muy alto");
        }

        //dias de semana
        System.out.println("indica numeros del 1 al 7 y te diré que dia de la semana es ");
        Integer numdia = miScanner.nextInt();

        switch (numdia) {
            case 1:
                System.out.println("el lunes es el peor dia de la semana");
                break;
            case 2, 3, 4:
                System.out.println("la mitad de la semana");
                break;
            case 5:
                System.out.println("el viernes es mejor");
                break;
            default:
                System.out.println("los fines de semana son lo máximo");
                break;
        }

        //Operador ternario
        String mensajeaMostrar = numdia == 1 ? "el lunes ya va a terminar" : "es otro dia de la semana";
        System.out.println(mensajeaMostrar);



    }
}
