public class Alumno {

    //Atributos de la clase Alumno, PRIVADOS porque solo quiero que se accedan desde esta clase
    private int id;
    private String nombre;
    private String tituloFP;
    private int edad;

    /**
     * Metodo Constructor de la clase Alumno, donde igualo los atributos de la clase a otros que empiezan por this. para saber que pertenecen a esta clase
     * @param id
     * @param nombre
     * @param tituloFP
     * @param edad
     */
    public Alumno(int id, String nombre, String tituloFP, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.tituloFP = tituloFP;
        this.edad = edad;
    }

    /**
     * Metodo getId de la clase Alumno. LOs pongo en publicos por estos si que quiero que se puedan acceder desde otras clases
     * @return this.id una variable que voy a poder utilizar despues
     */
    public int getId() {
        return this.id;
    }

    /**
     * Metodo getNombre de la clase Alumno.
     * @return this.nombre una variable que voy a poder utilizar despues
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Metodo getTiutuloFP de la clase Alumno.
     * @return this.tituloFP una variable que voy a poder utilizar despues
     */
    public String getTituloFP() {
        return this.tituloFP;
    }

    /**
     * Metodo getEdad de la clase Alumno.
     * @return this.edad una variable que voy a poder utilizar despues
     */
    public int getEdad() {
        return this.edad;
    }

    /**
     * Metodo toString de la clase Alumno. Este le pongo en PUBLIC porque me va a servir luego para mostrar toda la informacion de un alumno
     * @return sb.toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Alumno {");
        sb.append("Id=").append(id);
        sb.append(", Nombre=").append(nombre);
        sb.append(", TituloFP=").append(tituloFP);
        sb.append(", Edad=").append(edad);

        sb.append("}");
        return sb.toString();
    }
}
