package Ejercicio_Banco;

import java.util.*;

public class Main {
    static Scanner lector = new Scanner(System.in); 

    

    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.agregar_cuenta("Lionel", 100);
        banco.agregar_cuenta("elena", 10);
        banco.agregar_cuenta("adriana", 200);
        banco.agregar_cuenta("tati", 150);

        String nombre, nombre2; 

        double dinero; 
        int opcion; 



        System.out.println("BIENVENIDO A TU BANCO!!");
        do{
            Banco.menu(); 
            opcion = lector.nextInt(); 
            lector.nextLine(); 

            switch (opcion) {
                case 1:
                    banco.ver_cuentas(); 
                    break;
                case 2: 
                    banco.ver_cuentas();
                    System.out.print("Dime el nombre de la cuenta que buscas: ");
                    nombre = lector.nextLine(); 

                    do{
                        System.out.print("Dime la cantidad de diero que vas a ingresar dinero: ");
                        dinero = lector.nextDouble(); 
                    } while (banco.dineroCorrecto(dinero)); 
                    
                    banco.ingresar_dinero(nombre, dinero);
                    break; 
                case 3: 
                    banco.ver_cuentas();
                    
                    System.out.print("Dime el nombre de la cuenta de la que vas a retirar dinero: ");
                    nombre = lector.nextLine(); 

                    do{
                        System.out.print("Dime la cantidad de diero que quieres retirar: ");
                        dinero = lector.nextDouble(); 
                    } while (banco.dineroCorrecto(dinero)); 
                    
                    banco.retirar_dinero(nombre, dinero);
                    break;
                case 4:
                    System.out.print("Dime el nombre de la cuenta de origen: ");
                    nombre = lector.nextLine(); 
                    System.out.print("Dime el nombre de la cuenta destino: ");
                    nombre2 = lector.nextLine(); 

                    System.out.print("Dime cuanto dinero quieres transferir: ");
                    dinero = lector.nextInt(); 

                    banco.transferencia(nombre, nombre2, dinero); 

                    break; 
                case 5: 
                    System.out.print("Dime el nombre del titular de la cuenta: ");
                    nombre = lector.nextLine(); 
                    System.out.print("Dime el dinero inicial de la cuenta: ");
                    dinero = lector.nextDouble(); 

                    banco.agregar_cuenta(nombre, dinero); 
                    break; 
                case 6: 
                    System.out.print("Dime el nombre de la cuenta que quieres eliminar: ");
                    nombre = lector.nextLine(); 

                    banco.eliminar_cuenta(nombre); 
                    break;
                case 7:
                //buscar
                    break;
                case 8: 
                //morosos
                    break; 
                case 9: 
                    System.out.println("Hasta luego!!");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }

        } while (opcion != 0); 
        
    }

    

}
