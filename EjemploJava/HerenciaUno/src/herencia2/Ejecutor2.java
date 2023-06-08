package herencia2;

import java.util.Locale;
import java.util.Scanner;
import herencia1.EstudianteDistancia;

public class Ejecutor2 {

    public static void main(String[] args) {
        // 1. Ingresar un objeto de tipo Estudiante Distancia
        // Por teclado
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        System.out.println("Ingrese nombres");
        String nombres = entrada.nextLine();
        System.out.println("Ingrese apellidos");
        String apellidos = entrada.nextLine();
        System.out.println("Ingrese identificación");
        String identificacion = entrada.nextLine();
        System.out.println("Ingrese edad");
        int edad = entrada.nextInt();
        System.out.println("Ingrese número de asignaturas");
        int asignaturas = entrada.nextInt();
        System.out.println("Ingrese costo asignatura");
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

    }
}
