package EvaluadorDeClases;

import java.util.*;

public class LibretaDeNotas {
    public static void main(String[] args) {
        Map<String, Integer> libreta = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de alumnos: ");
        int alumnos = sc.nextInt();


        for (int i = 0; i < alumnos; i++) {
            System.out.println("Ingrese el nombre del alumno: ");
            String nombre = sc.next();
            System.out.println("Ingrese la cantidad del notas para " + nombre + ": ");
            int cantidadNotas = sc.nextInt();

            List<Integer> notas  = new ArrayList<>();
            for (int j = 0; j <cantidadNotas; j++) {
                int nota;
                do {
                    System.out.println("Ingrese la nota " + (j + 1) + " para " + nombre + ": ");
                    nota = sc.nextInt();
                    if (nota < 0 || nota > 10){
                        System.out.println("nota no válida, ingresa una nota entre 0 y 10");
                    }
                } while (nota < 0 || nota > 10);
                notas.add(nota);
            }

            //calculo promedio
            int suma = 0;
            for (int nota : notas) {
                suma += nota;
            }
            int promedio = suma / cantidadNotas;
            libreta.put(nombre, promedio);
            System.out.println("La nota más alta es: " + Collections.max(notas));
            System.out.println("La nota más baja es: " + Collections.min(notas));
        }


        int opcion = 0;
        do {
            System.out.println("Ingrese la opcion: \n 1. Mostrar promedio de estudiantes \n 2. Revisa si apruebas o repruebas \n 3. compara la nota con el promedio del curso \n 4. salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese nombre del estudiante:");
                    String nombre = sc.next();
                    if (libreta.containsKey(nombre)) {
                        System.out.println("Promedio de " + nombre + " es: " + libreta.get(nombre));
                    } else {
                        System.out.println("Estudiante no encontrado");
                    }
                    break;
                case 2:
                    System.out.println("Ingrese nombre del estudiante");
                    nombre = sc.next();
                    if (libreta.containsKey(nombre)) {
                        int promedio = libreta.get(nombre);
                        String resultado = (promedio >= 5) ? "Aprobado" : "Reprobado";
                        System.out.println("La nota es: " + resultado);
                    } else {
                        System.out.println("Estudiante no encontrado");
                    }
                    break;
                case 3:
                    int sumapromedios = 0;
                    for (int promedio : libreta.values()) {
                        sumapromedios += promedio;
                    }
                    int promediocurso = sumapromedios / libreta.size();
                    System.out.println("El promedio del curso es: " + promediocurso);

                    System.out.println("Ingrese nombre del estudiante: ");
                    nombre = sc.next();
                    if (libreta.containsKey(nombre)) {
                        int promedio = libreta.get(nombre);
                        if (promedio > promediocurso) {
                            System.out.println("La nota de " + nombre + " está por encima del promedio del curso.");
                        } else {
                            System.out.println("La nota de " + nombre + " no está por encima del promedio del curso.");
                        }
                    } else {
                        System.out.println("Estudiante no encontrado");
                    }
                    break;
                case 4:
                    System.out.println("Adiós");
                    break;
                default:
                    System.out.println("opcion no valida");
                    break;
            }
        } while (opcion != 4);
        sc.close();
    }
}
