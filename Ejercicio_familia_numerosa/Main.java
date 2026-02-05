package Ejercicio_familia_numerosa;

public class Main {
    public static void main(String[] args) {
        
        Persona juan = new Persona("Juan", "ABC", 20);
        Persona maria = new Persona("Maria", "ABC", 20);

        juan.setConyuge(maria);
        //maria.setConyuge(juan);

    }
}
