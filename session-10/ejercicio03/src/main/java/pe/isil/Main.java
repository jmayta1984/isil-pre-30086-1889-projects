package pe.isil;

public class Main {
    public static void main(String[] args) {
        Persona estudiante = new Estudiante("Jorge Matos", 25, "78445612", "Marketing");
        Persona profesor = new Profesor("Enrique Palacios", 39, "46729198", "Marketing digital");
        System.out.println(estudiante.toString());
        System.out.println(profesor.toString());
        estudiante.comer();
        profesor.comer();
        ((Estudiante) estudiante).estudiar();

        Persona estudianteInternacional = new EstudianteInternacional("Ricardo", 20, "78956214", "Diseño", "Chile");
       System.out.println(estudianteInternacional.toString());
        ((EstudianteInternacional)estudianteInternacional).estudiar();

    }
}