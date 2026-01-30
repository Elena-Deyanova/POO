package Practica_3_1;

import java.util.*;

public class Main {
    static Scanner lector = new Scanner(System.in); 
    public static void main(String[] args) {

        Agenda agenda = new Agenda();
        System.out.println("Bienvenido a tu agenda de contactos!");
        int opcion; 
        String n, t, c;
        String  buscar; 
        int pos; 

        do{
            menu();
            opcion = lector.nextInt(); 
            lector.nextLine(); 

            switch (opcion) {
            case 1:
                agenda.imprimir();
                break;
            case 2: 
                System.out.println("Dime el nombre del contacto");
                n = pedirString(); 
                System.out.println("Dime el numero de telefono del contacto ");
                t = pedirString(); 
                System.out.println("Dime el correo electronico del contacto");
                c = pedirString(); 
                
                Contacto nuevo = new Contacto(n, t, c); 
                agenda.agregar(nuevo); 
                break; 
            case 3: 
                System.out.println("Dime la posicion del contacto que quieres eliminar: ");
                pos = lector.nextInt(); 
                agenda.eliminar_contacto(pos); 
                break; 
            case 4: 
                System.out.print("¿Nombre? ");
                buscar = pedirString();
                agenda.buscarNombre(buscar);
                break; 
            case 5: 
                System.out.print("¿Teléfono? ");
                buscar = pedirString();
                agenda.buscarTelefono(buscar);
                break; 
            case 6:
                System.out.print("¿Correo? ");
                buscar = pedirString();
                agenda.buscarCorreo(buscar);
                break; 
            case 7: 
                System.out.print("¿Término a buscar globalmente? ");
                buscar = pedirString();
                agenda.buscarGlobal(buscar);
                break; 
            case 0: 
                System.out.println("Hasta luegooo ");
                break; 
            default:
                System.out.println("Porfavor elige una opcion válida ");
                break;
            }
        } while (opcion != 0);
        
    }   
    
    static void menu (){
        System.out.println("1. Ver contactos");
        System.out.println("2. Agregar contacto");
        System.out.println("3. Eliminar contacto");
        System.out.println("4. Buscar por nombre");
        System.out.println("5. Buscar por télefono");
        System.out.println("6. Buscar por correo");
        System.out.println("7. Busqueda globar");
        System.out.println("0. Salir");
    }
    public static String pedirString() {
        return lector.nextLine();
    }
}
