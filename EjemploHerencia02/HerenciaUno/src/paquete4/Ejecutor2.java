
package paquete4;

public class Ejecutor2 {
    public static void main(String[] args) {
        //1.Crear un objeto de tipo Estudiante Presencial
        String nombre = "René";
        String apellido = "Elizalde";
        String identificacion = "110011";
        int edad = 36;
        EstudiantePresencial estPresencial = new EstudiantePresencial(nombre,
                apellido,identificacion, edad);
        estPresencial.establecerNumeroCreditos(5);
        estPresencial.establecerCostoCredito(150);
        estPresencial.calcularMatriculaPresencial();
        
        System.out.println(estPresencial);
    }
}
