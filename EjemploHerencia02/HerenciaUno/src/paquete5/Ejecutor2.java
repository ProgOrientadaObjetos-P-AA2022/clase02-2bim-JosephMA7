
package paquete5;


public class Ejecutor2 {
    public static void main(String[] args) {
        String nombre = "René";
        String apellido = "Elizalde";
        String identificacion = "110011";
        int edad = 36;
        int numeroCreditos= 5;
        double costoCreditos=250.50;
        
        EstudiantePresencial estPresencial = new EstudiantePresencial(nombre,
                apellido,identificacion, edad,numeroCreditos,costoCreditos);
        estPresencial.calcularMatriculaPresencial();
        
        System.out.println(estPresencial);
        
    }
}
