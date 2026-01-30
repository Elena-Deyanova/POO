 package Practica_3_1;

public class Agenda {
    int contador = 0; 
    static final int MAX_CONTACTOS = 100; 
    Contacto[] contactos = new Contacto[MAX_CONTACTOS]; 

    void imprimir(){
        for (int i = 0; i < contador; i++) {
            System.out.print( i + "-");
            contactos[i].imprime();
        }
    }
    void imprimir(int id) {
        if (id >= 0 && id < contador) // hace comprobacion para que el id sea valido
        System.out.print( id + "-");
        contactos[id].imprime(); // printa los nombres 
    }


    boolean agregar(Contacto contacto){
        if (contador == MAX_CONTACTOS) {
            System.out.println("La agenda está llena");

        } else{
            contactos[contador] = contacto; // esta linea es importante y me fallaba. NO estaba agregando el contacto
            contador++; 
            return true; 
        }
        return false; 
    }

    boolean eliminar_contacto (int indice){
        if (indice < 0 || indice >= contador) { // comprueba que la posicion que se pone es correcta y que esta esté en lo que es el largo de todo el count
            System.out.println("Ese contacto no existe");
            return false; 
        }

        for (int i = indice; i < contador -1; i++) { //recorre el count 
            contactos[i] = contactos[i + 1];// cambia todo, sumandole uno, para que la posicion suba hacia arriba
        }
        contactos[contador -1] = null; 
        contador--;  // y resta los contactos
        return true;
    }

    // Imprime por pantalla todos los contactos que contengan el patrón
    void buscarNombre(String patron){
        for (int i = 0; i < contador; i++) {
            if (contactos[i].getNombre().toLowerCase().contains(patron.toLowerCase())) {
                imprimir(i);   
            }
        }
    }

    void buscarTelefono(String numero){
        for (int i = 0; i < contador; i++) {
            if (contactos[i].getNumero().toLowerCase().contains(numero.toLowerCase())) {
                imprimir(i);   
            }
        }
    }

    void buscarCorreo(String correo){
        for (int i = 0; i < contador; i++) {
            if (contactos[i].getCorreo_electronico().toLowerCase().contains(correo.toLowerCase())) {
                imprimir(i);   
            }
        }
    }

    void buscarGlobal(String global){
        for (int i = 0; i < contador; i++) {
            if (contactos[i].getNombre().toLowerCase().contains(global.toLowerCase()) ||
                contactos[i].getNumero().toLowerCase().contains(global.toLowerCase()) ||
                contactos[i].getCorreo_electronico().toLowerCase().contains(global.toLowerCase())) {
                imprimir(i);   
            }
        }
    }

    /*
    print_contactos
    añador contacto
    eliminar contacto 
    buscar contacto
    */
}