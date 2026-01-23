public class Asignatura {
    private String nombre; 
    private int codigoNumerico, curso;

    //constructor
    public Asignatura(String nombre, int codigoNumerico, int curso) {
        this.nombre = nombre;
        this.codigoNumerico = codigoNumerico;
        this.curso = curso;
    }

    // getters 
    public String getNombre() {
        return nombre;
    }

    public int getCodigoNumerico() {
        return codigoNumerico;
    }

    public int getCurso() {
        return curso;
    }

    //setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigoNumerico(int codigoNumerico) {
        this.codigoNumerico = codigoNumerico;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    } 

    public void imprime(){
        System.out.println("-" + nombre + " curso: " + curso + "- Codigo: " + codigoNumerico);
    }

    
}