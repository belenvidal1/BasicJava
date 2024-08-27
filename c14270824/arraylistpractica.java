package c14270824;

import java.text.CollationKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class arraylistpractica {

    //los arraylist son un arreglo dinamico, tienen metodos para agregar o eliminar elementos y no tienen una longitud fija
    public static void main(String[] args) {
        //la sintaxis para crear arraylist es la siguiente
        //interfaz "list" + <tipodedato> nombre variable = inicializacion como nueva instancia vacia de la clase arraylist();

        List<Integer> numeros = new ArrayList<>();
        System.out.println("este es mi caja de numeros: " + numeros);

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        //la otra manera de utilizar el .add() es indicandole el indice antes del elemento
        numeros.add(4,5);

        System.out.println("mi nueva caja de numeros: " + numeros);

        //para remover un elemento esta el metodo .remove ()
        numeros.remove(2);
        System.out.println("despues de eliminar el indice 2 " + numeros);

        //conocer la longitud del arraylist
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println("el numero " + numeros.get(i));
        }

        //si deseo conocer si un elemento existe, tengo el metodo constains()
        System.out.println("el numero esta presente: " + numeros.contains(2));

        numeros.set(2, 8);
        System.out.println(numeros);

        //obtener el minimo y el maximo elemento llamamos a la clase colections()
        System.out.println("el numero mas alto: " + Collections.max(numeros));
        System.out.println("el numero menor: " + Collections.min(numeros));

        Collections.sort(numeros);
        System.out.println(numeros);

        Collections.reverse(numeros);
        System.out.println(numeros);


        /***********************************************/

        List<String> mascotas = new ArrayList<>();
        mascotas.add("Bowy");
        mascotas.add("Leon");
        mascotas.add("Luna");
        mascotas.add("bestia");

        System.out.println("Aquí guardo mis mascotas: " + mascotas);

        for (int i = 0; i < mascotas.size(); i++) {
            System.out.println(mascotas.get(i));
        }

        mascotas.remove(2);
        System.out.println("estas si son mis mascotas: " + mascotas);

        Collections.sort(mascotas);
        System.out.println(mascotas);

        Collections.reverse(mascotas);
        System.out.println(mascotas);


    }
}
