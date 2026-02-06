package Ejercicio_familia_numerosa;

public class Main {
    public static void main(String[] args) {
        
        Persona juan = new Persona("Juan", "ABC", 20);
        Persona maria = new Persona("Maria", "ABC", 20);
        Persona pablo = new Persona("Pablo", "ABC", 20);
        Persona malena = new Persona("Malena", "ABC", 20);


        juan.setConyuge(maria);
        juan.serProgenitorB(pablo);
        juan.addHijo(pablo);

        juan.printInfoFamilia();
    }
}

