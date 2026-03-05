public class Alumno {

    private int id;
    private String nombre;
    private String tituloFP;
    private int edad;

    public Alumno(int id, String nombre, String tituloFP, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.tituloFP = tituloFP;
        this.edad = edad;
    }

    public int getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getTituloFP() {
        return this.tituloFP;
    }

    public int getEdad() {
        return this.edad;
    }

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
