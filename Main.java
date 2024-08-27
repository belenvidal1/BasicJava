import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //punto de entrada al programa, jvm buscará esta clase
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hola mundo, soy Belén!");
        //creo una variable de clase tipo Scanner, lo declaro:
        Scanner sc = new Scanner(System.in);
        //tipo de dato (clase ) + nombre de la variable = nueva instancia de la clase (recibe datos de entrada con system.in)


        //para hacer uso de mi scanner sc lo llamo en la inicialización de otra variable
        //declarar e inicializar una variable
        System.out.println(" Indica tu nombre: ");
        String nombre = sc.nextLine();
        System.out.println("¡Mucho gusto " + nombre + "!");

    }
}