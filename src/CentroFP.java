public class CentroFP {

    private Alumno[] alumnos;
    private final int MAX_ALUMNOS;

    public CentroFP(int MAX_ALUMNOS) {
        this.MAX_ALUMNOS = MAX_ALUMNOS;

        alumnos = new Alumno[MAX_ALUMNOS];

    }

    public Alumno buscarAlumno(int id){

        boolean seguirBuscando = false;
        Alumno resultadoBusqueda = null;

        for (int i = 0; i < MAX_ALUMNOS && seguirBuscando; i++) {
            if (alumnos[i].getId() == id) {
                seguirBuscando = true;
                resultadoBusqueda = alumnos[i];
            }
        }
        return resultadoBusqueda;
    }

    private int buscarPrimerHuecoLibre() {
        int posicionLibre = -1;
        boolean seguirBuscando = true;

        for (int i = 0; i < MAX_ALUMNOS && seguirBuscando; i++) {
            if (alumnos[i] == null) {
                posicionLibre = i;
                seguirBuscando = false;
            }
        }
        return posicionLibre;
    }

    public boolean registrarAlumno(Alumno alumno){
        boolean resutadoRegistro = false;

        for (int i = 0; i < MAX_ALUMNOS; i++) {
            if (alumnos[i] == null) {
                alumnos[i] = alumno;
                resutadoRegistro = true;
            }
        }

        return resutadoRegistro;
    }

    public String mostrarAlumnos() {

        StringBuilder sb = new StringBuilder("ALumnos : {");

        for (int i = 0; i < MAX_ALUMNOS; i++) {
            if (alumnos[i] != null) {
                sb.append(alumnos[i].toString());

            }
        }
         sb.append("\n }");
        return sb.toString();
    }

    public int contarAlumnos(){
        int contadorAlumnos = 0;

        for (int i = 0; i < MAX_ALUMNOS; i++) {
            if (alumnos[i] != null) {
                contadorAlumnos++;
            }
        }
        return contadorAlumnos;

    }













}
