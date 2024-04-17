public class Main {
    public static void main(String[] args) {
        /*
         * Ejemplo de invocación a un método definido como static
         */
        System.out.println(Math.addNumbers(5, 3));
        Main.createStudents();

        /*
         * Se crea un objeto de la clase Example
         */
        Example object = new Example();
        object.showMessage();

    }

    public static void createStudents() {
        /*
         * Ejemplo de invocación a un método definido como non-static
         */
        Student studentCarlos = new Student();
        studentCarlos.study();

        studentCarlos.age = 15;
        studentCarlos.name = "Carlos";
        studentCarlos.dni = "47658678";
        studentCarlos.showName();

        // ana / 21 / 45678925

        Student studentAna = new Student();
        studentAna.age = 21;
        studentAna.name = "Ana";
        studentAna.dni = "45678925";
        studentAna.showName();

    }
}
