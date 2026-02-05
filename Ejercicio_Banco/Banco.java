package Ejercicio_Banco;

import java.util.ArrayList;

public class Banco {
    
    ArrayList<Cuenta> cuentas = new ArrayList<>();
    
    /*
    Falla que cuando pones el nombre de la cuenta la cual quieres hacer la operacion. Esta no cuena con el nombre. Sino que lo hace al primero que hay almacenado
    */

    static void menu(){
        System.out.println("\n1. Ver cuentas.");
        System.out.println("2. Ingresar dinero.");
        System.out.println("3. Retirar dinero");
        System.out.println("4. Transferencia.");
        System.out.println("5. Agregar cuenta.");
        System.out.println("6. Eliminar cuenta.");
        System.out.println("7. Buscar cuenta.");
        System.out.println("8. Mostrar morosos");
        System.out.println("9. Salir\n");

        System.out.print("Tu opcion: ");
    }

    public void ver_cuentas(){
        int contador = 0; 
        for (Cuenta c : cuentas) {
            System.out.print(contador + ". ");
            c.imprimir();
            contador++; 
        }   
    }

    boolean ingresar_dinero(String nombre, double dinero){

        for (int i = 0; i < cuentas.size(); i++) {
            if (cuentas.get(i).getTitular().equalsIgnoreCase(nombre)) {
                if (!dineroCorrecto(dinero)) {
                     cuentas.get(i).setSaldo(cuentas.get(i).getSaldo() + dinero);
                } else{
                    System.out.println("No se ha encontrado ninguna cuenta con ese nombre.");
                }
            }
        }
        return false; 
    }

    boolean retirar_dinero(String nombre, double dinero){


        for (int i = 0; i < cuentas.size(); i++) {
            if (cuentas.get(i).getTitular().equalsIgnoreCase(nombre)) {
                 double dinero_actualizado = cuentas.get(i).getSaldo() - dinero; 
                        if (dinero_actualizado < -100) {
                            System.out.println("La cantidad final es menor a -100. No se ha podido realizar la operacion. ");
                            return false; 
                        }
                        
                        cuentas.get(i).setSaldo(dinero_actualizado);
                        System.out.println("Dinero actualizado");
                        return true;
            } else{
                System.out.println("No se ha encontrado ninguna cuenta con ese nombre.");
            }
        }
        return false; 
    }

    boolean transferencia(String nombre1, String nombre2,double dinero ){
        int pos = 0, pos2 = 0; 


        for (int i = 0; i < cuentas.size(); i++) { // se recorre el arrayList
            if (cuentas.get(i).getTitular().equalsIgnoreCase(nombre1)) { // se mira la posicion del nombre de la cuenta origen
                pos = i;  // se guarda la posicion
            } else {
                System.out.println("No se encuentran cuentas con ese nombre.");
                return false; 
            }
            if (cuentas.get(i).getTitular().equalsIgnoreCase(nombre2)) { // se mira la posicion del nombre de la cuenta desitno
                pos2 = i;  // se guarda la posicion 2
            }else {
                System.out.println("No se encuentran cuentas con ese nombre.");
                return false; 
            }
        }

            if (!dineroCorrecto(dinero) && (!nombre1.equalsIgnoreCase(nombre2))) {
                double saldo_final_origen = cuentas.get(pos).getSaldo() - dinero; 
                cuentas.get(pos).setSaldo(saldo_final_origen);

                double saldo_final_destino = cuentas.get(pos2).getSaldo() + dinero; 

                cuentas.get(pos2).setSaldo(saldo_final_destino);
            } else{
                return false; 
            }
        
     return true; 

    }

    boolean agregar_cuenta(String nombre, double saldo){
        for(Cuenta c : cuentas){
            if (c.getTitular().equalsIgnoreCase(nombre)) {
                System.err.println("Un titular con este nombre ya existe. ");
                return false; 
            }
        }
        cuentas.add(new Cuenta(nombre, saldo));
        return true; 
    }

    boolean eliminar_cuenta(String nombre){
        for (int i = 0; i < cuentas.size(); i++) {
                if (cuentas.get(i).getTitular().equalsIgnoreCase(nombre)) {
                    cuentas.remove(i); 
                    return true; 
                } else{
                    System.out.println("No se ha encontrado ninguna cuenta con ese nombre.");
                }
        }
        return false; 
    }

    void buscar_cuenta(String nombre, int saldo){
         
    }

    void mostrar_morosos(){

    }

    boolean dineroCorrecto (double dinero){
        if (dinero < 0) {
            System.out.println("La cantidad no puede ser menor o igual a 0");
            return true; 
        } 
        return false; 
    }
    
}
