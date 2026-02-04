package Ejercicio_Banco;

import java.util.ArrayList;

public class Banco {
    
    ArrayList<Cuenta> cuentas = new ArrayList<>();

    static void menu(){
        System.out.println("1. Ver cuentas.");
        System.out.println("2. Ingresar dinero.");
        System.out.println("3. Retirar dinero");
        System.out.println("4. Transferencia.");
        System.out.println("5. Agregar cuenta.");
        System.out.println("6. Eliminar cuenta.");
        System.out.println("7. Buscar cuenta.");
        System.out.println("8. Mostrar morosos");
        System.out.println("0. Salir\n");

        System.out.print("Tu opcion: ");
    }

    public void ver_clientes(){
        for (Cuenta c : cuentas) {
            c.imprimir();
            //System.out.println(c);
        }
        
    }

    void ingresar_dinero(){

    }

    void retirar_dinero(){

    }

    void transferencia(){

    }

    boolean agregar_cuenta(String nombre, boolean saldo){
        for(Cuenta c : cuentas){
            if (c.getTitular().equalsIgnoreCase(nombre)) {
                System.err.println("Un titular con este nombre ya existe. ");
                return false; 
            }
        }

        cuentas.add(new Cuenta(nombre, saldo)); 
        //contador++; 

        return true; 
    }

    void eliminar_cliente(){

    }

    void agregar_cc(String nombre, int saldo){
        Cuenta c = new Cuenta(nombre, saldo);
        cuentas.add(c);
    }

    void eliminar_cc(){

    }

    void mostrar_cc(){

    }

    void mostrar_movimientos_cc(){

    }

    void buscar_cuenta(){

    }

    void mostrar_morosis(){

    }
    
}
