package Practica_3_1;

public class Contacto {
    private String nombre, correo_electronico, numero; 

    


    public Contacto(String nombre, String numero,  String correo_electronico) {
        this.nombre = nombre;
        this.numero = numero;
        this.correo_electronico = correo_electronico;
    }

    //getters y setters 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.isEmpty()) {
            System.err.println("No se puede dejar el nombre vacío");
        } else {
            this.nombre = nombre;
        }
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        if (numero = ) {
            
        }
        this.numero = numero;
    }
    
    //Metodos 

   

    @Override
    public String toString() {
        return "Contacto = " + nombre + ", correo= " + correo_electronico + ", numero= " + numero ;
    }

     public void imprime (){
       System.out.println(toString());
    }

    



}
