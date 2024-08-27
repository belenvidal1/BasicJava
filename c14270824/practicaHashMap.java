package c14270824;

import java.util.HashMap;
import java.util.Map;

public class practicaHashMap {
    public static void main(String[] args) {
        //hashmap es una estructura que implementa la interfaz Map y almacena en pares clave:valor

        Map<String, String> pokemonFavoritos = new HashMap();
        System.out.println(pokemonFavoritos);

        //agregar elementos al hashmap es atraves del metodo .put()
        pokemonFavoritos.put("Belén", "Charizard");
        pokemonFavoritos.put("Lucas", "Pikachu");
        pokemonFavoritos.put("Diego", "Bulbasaur");
        pokemonFavoritos.put("Fabian", "Squirtle");

        System.out.println(pokemonFavoritos);

        //obtener un elemento en particular, podemos obtener el metodo llamando a su clave
       System.out.println(pokemonFavoritos.containsKey("Lucas"));

        //imprimir la longitud de este hashmap esta en el metodo size
        System.out.println(pokemonFavoritos.size());

        //recorrer hashmap
        for (Map.Entry<String, String> entrada : pokemonFavoritos.entrySet()) {
            String clave = entrada.getKey();
            String valor = entrada.getValue();
            System.out.println("el entrenador se llama " + clave + " y su pokemon se llama " + valor);
        }

        for ( String clave : pokemonFavoritos.keySet() ) {
            System.out.println("***** \n el entrenador se llama " + clave + " y su pokemon se llama " + pokemonFavoritos.get(clave));
        }
    }

}
