package Ejercicio_Banco;

import java.util.ArrayList;

public class Banco {
    
    ArrayList<Cuenta> cuentas = new ArrayList<>(); // se inician las cuentas

    static void menu(){ // menu del banco. El cual se va a printar 
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

    public void ver_cuentas(){ // metodo para printar las cuentas usando un foreach
        int contador = 1; 
        for (Cuenta c : cuentas) {
            System.out.print(contador + ". ");
            c.imprimir();
            contador++; // se usa el contador, para que haya un contador de todas las cuentas
        }   
    }

    boolean ingresar_dinero(String nombre, double dinero){ // metodo para ingresar dinero
        boolean ingresado = false;  // se crea un boolean para luego mostrar resultados correctos   

        for (int i = 0; i < cuentas.size(); i++) { // 
            if (cuentas.get(i).getTitular().equalsIgnoreCase(nombre)) {
                if (dineroCorrecto(dinero)) {
                    cuentas.get(i).setSaldo(cuentas.get(i).getSaldo() + dinero);
                    ingresado = true; 
                    return true; 
                }
                ingresado = false; 
            }
        }
        if (ingresado == false) {
                System.out.println("No se han encontrado cuentas con ese nombre. ");
                return false; 
            }
        return true; 
    }

    boolean retirar_dinero(String nombre, double dinero){
        int pos = -1; 
        boolean encontrado = false; 
        double saldo_ultimo = 0; 

        for (int i = 0; i < cuentas.size(); i++) {
            if (cuentas.get(i).getTitular().equalsIgnoreCase(nombre)) {
                pos = i; 
                saldo_ultimo = cuentas.get(i).getSaldo() - dinero; 
                encontrado = true; 
            } 
        }
        if (!encontrado) {
            System.out.println("No se ha encontrado ninguna cuenta con ese nombre.");
            return false; 
        }
        if (saldo_ultimo < -100) {
            System.out.println("La cuenta no se puede quedar en un saldo menor a -100. ");
            return false; 
        }
        

        cuentas.get(pos).setSaldo(saldo_ultimo);
        return true;
        
    }

    boolean transferencia(String nombre1, String nombre2,double dinero ){
        int pos = -1, pos2 = -1; 

        if (nombre1.equalsIgnoreCase(nombre2)) {
            System.out.println("No se puede poner el mismo nombre en las cuentas. ");
            return false; 
        }

        if (!dineroCorrecto(dinero)) {
            System.out.println("No se puede introducir una cantidad negativa. ");
            return false; 
        }


        for (int i = 0; i < cuentas.size(); i++) {
            if (cuentas.get(i).getTitular().equalsIgnoreCase(nombre1)) { // se mira la posicion del nombre de la cuenta origen
                pos = i;  // se guarda la posicion
            }
            if (cuentas.get(i).getTitular().equalsIgnoreCase(nombre2)) { // se mira la posicion del nombre de la cuenta desitno
                pos2 = i;  // se guarda la posicion 2
            }
        }
        if (pos == -1 || pos2 == -1) {
            System.out.println("No se han encontrado las cuentas correspondientes.");
            return false;
        } 

        if (cuentas.get(pos).getSaldo() - dinero < -100) {
            System.out.println("No se puede hacer la tranferencia en la cuenta origen. ");
            return false; 
        }

        cuentas.get(pos).setSaldo(cuentas.get(pos).getSaldo() - dinero);
        cuentas.get(pos2).setSaldo(cuentas.get(pos2).getSaldo() + dinero);
             
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

    void buscar_cuenta(String nombre){
        String nombreLower = nombre.toLowerCase(); 
        boolean encontrado = false; 
         for (Cuenta c : cuentas) {
            if (c.getTitular().toLowerCase().contains(nombreLower)) {
                c.imprimir();
                encontrado = true; 
            }
        }

        if (!encontrado) {
            System.out.println("No se han encontrado cuentas que contengan " + nombre);
        }

    }

    void mostrar_morosos(){
        boolean morosos = false; 
        for (Cuenta c : cuentas) {
            if (c.getSaldo() < 0) {
                c.imprimir();
                morosos = true; 
            }
        }

        if (!morosos) {
            System.out.println("No hay ningun moroso");
        }

    }

    boolean dineroCorrecto (double dinero){
        if (dinero <= 0) {
            System.out.println("La cantidad no puede ser menor o igual a 0");
            return false; 
        } 
        return true; 
    }
    
}
