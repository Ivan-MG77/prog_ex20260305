public class Main {
    public static void main(String[] args) {

        CentroFP centroFP = new CentroFP(20);


        Alumno alumno1 = new Alumno(3,"Julian", "DAM", 39);
        Alumno alumno2 = new Alumno(2,"Ivan", "DAM", 19);
        Alumno alumno3 = new Alumno(55,"Joselu", "DAW", 54);

        System.out.println(centroFP.buscarAlumno(55));

        centroFP.registrarAlumno(alumno1);
        centroFP.registrarAlumno(alumno2);
        centroFP.registrarAlumno(alumno3);

        System.out.println(centroFP.mostrarAlumnos());

        System.out.println("Numero de alumnos en el CENTRO: " + centroFP.contarAlumnos());

        System.out.println(centroFP.buscarAlumno(2));
        System.out.println(centroFP.buscarAlumno(456));

    }
}