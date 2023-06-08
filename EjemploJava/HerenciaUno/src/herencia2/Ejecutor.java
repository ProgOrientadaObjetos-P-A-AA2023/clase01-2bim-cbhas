package herencia2;

import herencia1.EstudiantePresencial;

public class Ejecutor {

    public static void main(String[] args) {
        // Objeto de tipo Estudiante Presencial
        EstudiantePresencial e1 = new EstudiantePresencial();

        e1.establecerNombresEstudiante("René Rolando");
        e1.establecerApellidoEstudiante("Elizalde Solano");
        e1.establecerIdentificacionEstudiante("1104111111");
        e1.establecerEdadEstudiante(38);
        e1.establecerNumeroCreditos(30);
        e1.establecerCostoCredito(15);
        e1.calcularMatriculaPresencial();

        System.out.printf("Nombres: %s\n"
                + "Apellidos: %s\n"
                + "Identificación: %s\n"
                + "Edad: %d\n"
                + "Número de crédito: %d\n"
                + "Costo Crédito: %.1f\n"
                + "Costo matrícula: %.1f\n",
                e1.obtenerNombresEstudiante(),
                e1.obtenerApellidoEstudiante(),
                e1.obtenerIdentificacionEstudiante(),
                e1.obtenerEdadEstudiante(),
                e1.obtenerNumeroCreditos(),
                e1.obtenerCostoCredito(),
                e1.obtenerMatriculaPresencial());

    }
}
