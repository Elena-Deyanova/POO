 package Practica_3_1;

public class Agenda {
    int contador = 0; 
    static final int MAX_CONTACTOS = 100; 
    Contacto[] contactos = new Contacto[MAX_CONTACTOS]; 


    boolean añadir_contacto(String nombre, String numero, String correo){
        if (contador == MAX_CONTACTOS) {
            System.out.println("La agenda está llena");
            return false; 
        } else{
            Contacto nuevo = new Contacto(nombre, numero, correo); 
            contador++; 
            return true; 
        }
    }

    boolean eliminar_contacto (int indice){
        if (indice > contador) {
            System.err.println("No se ha podido eliminar por que ese numero no existe en la lista");
            return false; 
        } else{

        }
    }
    /*
    print_contactos
    añador contacto
    eliminar contacto 
    buscar contacto
    */
}