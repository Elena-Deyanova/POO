package Ejercicio_familia_numerosa;

import java.util.*;


public class Persona {
    private String nombre, apellidos; //nombre y apellidos de la persona
    private int edad;  // edad de la persona 
    private Persona conyuge; // Su pareja
    private Persona progenitorA; //Uno de sus padres
    private Persona progenitorB; // el otro padre
    private ArrayList<Persona> hermanos;  // Lista de los hermanos
    private ArrayList<Persona> hijos; // lista de los hijos
    

    //====CONSTRUCTOR====
    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    //====GETTERS====
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public ArrayList<Persona> getHermanos() {
        return hermanos;
    }

    public ArrayList<Persona> getHijos() {
        return hijos;
    }

    public Persona getProgenitorA(){
        return progenitorA; 
    }

    public Persona getProgenitorB(){
        return progenitorB; 
    }

    //====SETTERS====
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    } 

    public void setProgenitorA(Persona a){
        this.setProgenitorA(a);
        
    }

    public void setProgenitorB(Persona b){
        this.setProgenitorB(b);
    }

    public void setConyuge(Persona conyuge) {
        if(this.conyuge == conyuge) return; // setea bien. Pero si cuando ana vuelve se acaba el bucle

        this.conyuge = conyuge; //

        if (conyuge != null && conyuge.conyuge != this) {
            conyuge.setConyuge(this);
            
        }
    }


    ////====METODOS====
    public void addHijo (Persona hijo){
        setProgenitorA(this);


    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " " + apellidos
        + "\nProgenit@r: " + nombrePersona(progenitorA) + ". Progenit@r: " + nombrePersona(progenitorB)
        + "\nHermanos: " + listaNombres(hermanos)
        + "\nHijos: " + listaNombres(hijos);
    }

    public void printInfoFamilia(){
        System.out.println(toString());
    }

    private String nombrePersona(Persona p){
        if (p == null) return "Desconocido"; 
        return p.getNombre() + " " + p.getApellidos(); 
    }

    private String listaNombres(ArrayList<Persona> lista) {
        if (lista == null || lista.isEmpty()) return "Ninguno";

        String res = "";
        for (Persona p : lista) {
            if (p != null)
                res += p.getNombre() + ", ";
        }

        if (res.equals("")) return "Ninguno";

        return res.substring(0, res.length() - 2);
    }

    //====METODOS EXTRA====
    




    


}
