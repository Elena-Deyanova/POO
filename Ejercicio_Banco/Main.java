package Ejercicio_Banco;

import java.util.Scanner;

public class Main {
    static Scanner lector = new Scanner(System.in); 

    public static void main(String[] args) {
        int opcion; 


        System.out.println("BIENVENIDO A TU BANCO!!");
        do{
            menu(); 
            opcion = lector.nextInt(); 
            lector.nextLine(); 

            switch (opcion) {
                case 1:
                    //muestra los clientes del banco con toda su informacion. 
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
                case 7:
                    
                    break;
                case 8: 

                    break; 
                case 9: 

                    break;
                case 10:
                    
                    break;
                case 11: 

                    break; 
                case 12: 

                    break; 
                case 0: 

                    break; 
                default:
                    break;
            }

        } while (opcion != 0); 
        
    }

    static void menu(){
        System.out.println("1. Ver clientes.");
        System.out.println("2. Ingresar dinero.");
        System.out.println("3. Retirar dinero");
        System.out.println("4. Transferencia.");
        System.out.println("5. Agregar cliente.");
        System.out.println("6. Eliminar cliente.");
        System.out.println("7. Agregar cuenta a cliente.");
        System.out.println("8. Eliminar cuenta de cliente.");
        System.out.println("9. Mostrar cuenta de cliente.");
        System.out.println("10. Mostrar movimientos de cuenta de cliente.");
        System.out.println("11. Buscar cuenta.");
        System.out.println("12. Mostrar morosos");
        System.out.println("0. Salir");
    }

}
