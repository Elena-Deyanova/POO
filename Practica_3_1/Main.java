package Practica_3_1;

import java.util.*;

public class Main {
    static Scanner lector = new Scanner(System.in); 
    public static void main(String[] args) {
        System.out.println("Bienvenido a tu agenda de contactos!");
        int opcion; 

        do{
            menu();
            opcion = lector.nextInt(); 

            switch (opcion) {
            case 1:
                
                break;
            case 2: 

                break; 
            case 3: 

                break; 
            case 4: 

                break; 
            case 5: 

                break; 
            case 6:

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
        System.out.println("0. Salir");
    }
}
