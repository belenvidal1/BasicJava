package c14260824;

public class ArreglosEstaticos {
    public static void main(String[] args) {
        //Los arreglos estaticos se pueden inicializar e indicar la longitud maxima
        String[] listavacia = new String[5];
        listavacia[1] = "este es el segundo elemento";
        System.out.println("El segundo elemento es: " + listavacia[1]);

        //a los arreglos estaticos cuando se inicializan, se les pueden indicar elementos dentro de llaves
        String[] alumnos = {"Belén","Nadima", "Daniel", "Branco"};
        //imprime la longitud del arreglo
        System.out.println("la longitud maxima del arreglo es " + alumnos.length);

        //iterar sobre un arreglo con un for
        for (int i = 0; i < alumnos.length; i++) {
            //imprimo el valor de cada alumno en cada iteracion
            System.out.println("integrante n° "+ (i+1)+ " es: " + alumnos[i]);
        }
    }
}
