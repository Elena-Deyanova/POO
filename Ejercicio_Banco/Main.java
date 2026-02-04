package Ejercicio_Banco;

import java.util.*;

public class Main {
    static Scanner lector = new Scanner(System.in); 
    

    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.agregar_cc("Lionel", 100);
        
        int opcion; 



        System.out.println("BIENVENIDO A TU BANCO!!");
        do{
            Banco.menu(); 
            opcion = lector.nextInt(); 
            lector.nextLine(); 

            switch (opcion) {
                case 1:
                    banco.ver_clientes(); 
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

    

}
