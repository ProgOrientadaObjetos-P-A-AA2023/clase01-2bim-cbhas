package herencia2;

import java.util.Locale;
import java.util.Scanner;
import herencia1.EstudianteDistancia;
import herencia1.EstudiantePresencial;

public class Ejecutor3 {

    public static void main(String[] args) {
        // Ingresar por teclado
        // un objeto de tipo Estudiante Distancia si el usuario ingresa 1 como 
        // opción
        // un objeto de tipo Estudiante Presencial si el usuario ingresa 2 como 
        // opción
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int opcion;

        System.out.println("Ingresa 1 si eres Estudiante Distancia\n"
                + "Ingresa 2 si eres Estudiante Presencial");
        opcion = entrada.nextInt();

        if (opcion == 1) {
            entrada.nextLine();
            System.out.println("Ingrese nombres:");
            String nombres = entrada.nextLine();
            System.out.println("Ingrese apellidos:");
            String apellidos = entrada.nextLine();
            System.out.println("Ingrese identificación:");
            String identificacion = entrada.nextLine();
            System.out.println("Ingrese edad:");
            int edad = entrada.nextInt();
            System.out.println("Ingrese número de asignaturas:");
            int asignaturas = entrada.nextInt();
            System.out.println("Ingrese costo asignatura:");
            double costoAsignatura = entrada.nextDouble();

            EstudianteDistancia estudiante = new EstudianteDistancia();

            estudiante.establecerNombresEstudiante(nombres);
            estudiante.establecerApellidoEstudiante(apellidos);
            estudiante.establecerEdadEstudiante(edad);
            estudiante.establecerIdentificacionEstudiante(identificacion);
            estudiante.establecerNumeroAsginaturas(asignaturas);
            estudiante.establecerCostoAsignatura(costoAsignatura);
            estudiante.calcularMatriculaDistancia();

            System.out.printf("%s\n", estudiante);

        } else if (opcion == 2) {

            entrada.nextLine();
            System.out.println("Ingrese nombres:");
            String nombres = entrada.nextLine();
            System.out.println("Ingrese apellidos:");
            String apellidos = entrada.nextLine();
            System.out.println("Ingrese identificación:");
            String identificacion = entrada.nextLine();
            System.out.println("Ingrese edad:");
            int edad = entrada.nextInt();
            System.out.println("Ingrese el número de créditos:");
            int numCreditos = entrada.nextInt();
            System.out.println("Ingrese costo del crédito:");
            double costoCredito = entrada.nextDouble();

            EstudiantePresencial estudiante = new EstudiantePresencial();

            estudiante.establecerNombresEstudiante(nombres);
            estudiante.establecerApellidoEstudiante(apellidos);
            estudiante.establecerEdadEstudiante(edad);
            estudiante.establecerIdentificacionEstudiante(identificacion);
            estudiante.establecerNumeroCreditos(numCreditos);
            estudiante.establecerCostoCredito(costoCredito);
            estudiante.calcularMatriculaPresencial();

            System.out.printf("%s\n", estudiante);
        } else {
            System.out.println("Opción Incorrecta");
        }

    }

}
