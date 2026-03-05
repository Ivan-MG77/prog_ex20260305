public class CentroFP {

    //Atributos de la clase CentroFP tengo un array(ALumno[] alumnos) y un int MAX_ALUMNOS que indica cuantos alumnos van a estar como maximo en el array
    private Alumno[] alumnos;
    private final int MAX_ALUMNOS;
    //el final es por su valor se va quedar asi siempre y no va cambiar

    /**
     * Metodo constructor de la clase CentroFP
     * Aqui se inicializa el array alumnos
     * @param MAX_ALUMNOS
     */
    public CentroFP(int MAX_ALUMNOS) {
        this.MAX_ALUMNOS = MAX_ALUMNOS;

        alumnos = new Alumno[MAX_ALUMNOS]; //inicializacion del array

    }

    /**
     * Metodo buscarAlumno que lo que hace es buscar un alumno segun su id.
     * Iguala el id del parametro de entrado con el getId de la i del array alumnos, si son iguales devuelve una variable resultadoBusqueda que este indica cual es el resultado de la buscqueda
     * @param id
     * @return resultadoBusqueda
     */
    public Alumno buscarAlumno(int id){

        boolean seguirBuscando = false;
        Alumno resultadoBusqueda = null;

        for (int i = 0; i < MAX_ALUMNOS && seguirBuscando; i++) { //bucle que recorre tod0 el array
            if (alumnos[i].getId() == id) {
                seguirBuscando = true;
                resultadoBusqueda = alumnos[i];
            }
        }
        return resultadoBusqueda;
    }

    /**
     * MEtodo buscarPrimerHuecoLibre que busca el Primer hueco en el array para saber si se puede meter algun alumno
     * @return posicionLibre si hay un hueco libre(y la posicion exacta donde hay hueco) y si no devuelve -1
     */
    private int buscarPrimerHuecoLibre() {
        int posicionLibre = -1;  //Empezamos con el valor -1
        boolean seguirBuscando = true;

        for (int i = 0; i < MAX_ALUMNOS && seguirBuscando; i++) {
            if (alumnos[i] == null) {
                posicionLibre = i;
                seguirBuscando = false;
            }
        }
        return posicionLibre;
    }

    /**
     * Metodo registrarAlumno que mete a un alumno en el array
     * @param alumno
     * @return resutadoRegistro que este puede devolver un true si se ha registrado o flase sino
     */
    public boolean registrarAlumno(Alumno alumno){
        boolean resutadoRegistro = false;

        for (int i = 0; i < MAX_ALUMNOS; i++) {
            if (alumnos[i] == null) {  // == null significa que hay un valor en el array que es nulo y que ahi se puede meter a un alumno
                alumnos[i] = alumno;
                resutadoRegistro = true;
            }
        }

        return resutadoRegistro;
    }

    /**
     * Metodo mostrarAlumnos aqui creo un StringBuilder para que el metodo cuando sea llamodo desde otra clase devulva el StringBuilder con los datos de los alumnos
     * @return
     */
    public String mostrarAlumnos() {

        StringBuilder sb = new StringBuilder("ALumnos : {");

        for (int i = 0; i < MAX_ALUMNOS; i++) {
            if (alumnos[i] != null) {
                sb.append(alumnos[i].toString());// sb.append significa que lo que hay dentro se apendiza y mete en el SB

            }
        }
         sb.append("\n }");
        return sb.toString(); //devuelvo tod0 el SB
    }

    /**
     * MEtodo contarAlumnos se inicializa una variable (contadorAlumnos) a 0 y cuando el bucle da vueltas y ve que alumnos[i] != null(significa que hay un alumno metido en una poscion) el contadorAlumnos se va sumando de 1 en 1
     * @return contadorAlumnos Devuelve al fianl el valor de cuanto ha encontrado
     */
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
