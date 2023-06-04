import java.util.Scanner;

public class Estudiante
{
    //atributo tipo string
    private final String nombre;
    private final double[] calificaciones;

    // Constructor de la clase Estudiante
    public Estudiante(String nombre, double[] calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

    // Método #1 para calcular el promedio de las calificaciones
    public double calcularPromedio() {
        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.length;
    }

    // Método #2 para obtener la calificación final a partir del promedio
    public char obtenerCalificacionFinal(double promedio) {
        if (promedio >= 90) {
            return 'A';
        } else if (promedio >= 81) {
            return 'B';
        } else if (promedio >= 71) {
            return 'C';
        } else if (promedio >= 61) {
            return 'D';
        } else if (promedio >= 51) {
            return 'E';
        } else {
            return 'F';
        }
    }

    // Método para imprimir los resultados de acuerdo a la tabla
    public void imprimirResultados() {
        System.out.println("Nombre del estudiante: " + nombre);
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Calificación " + (i + 1) + ": " + calificaciones[i]);
        }
        double promedio = calcularPromedio();
        System.out.println("Promedio: " + promedio);
        char calificacionFinal = obtenerCalificacionFinal(promedio);
        System.out.println("Calificación final: " + calificacionFinal);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        double[] calificaciones = new double[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingresa tu calificación " + (i + 1) + ": ");
            calificaciones[i] = scanner.nextDouble();
        }

        Estudiante estudiante = new Estudiante(nombre, calificaciones);
        System.out.println();
        estudiante.imprimirResultados();

        scanner.close();
    }
}