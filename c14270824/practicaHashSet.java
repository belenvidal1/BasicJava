package c14270824;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class practicaHashSet {
    public static void main(String[] args) {
        //HashSet es implementación de interfaz Set y no permite el ingreso de duplicados y no tiene un orden en especifico por el hecho de ser Hash

        Set<String> peliculasFavoritas = new HashSet();
        System.out.println(peliculasFavoritas);

        peliculasFavoritas.add("Avengers: Age of Ultron");
        peliculasFavoritas.add("Shrek");
        peliculasFavoritas.add("Una Esposa de Mentira");
        peliculasFavoritas.add("Moana");
        System.out.println(peliculasFavoritas);

        //remover elemento
        peliculasFavoritas.remove("Moana");
        System.out.println(peliculasFavoritas);

        //obtener longitud
        /*System.out.println("este conjunto tiene: " + peliculasFavoritas.size() + " elementos");
        peliculasFavoritas.forEach(pelicula -> System.out::println(pelicula));

        List<String> listaOrdenadaPeliculas = peliculasFavoritas.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(listaOrdenadaPeliculas);*/



    }
}
