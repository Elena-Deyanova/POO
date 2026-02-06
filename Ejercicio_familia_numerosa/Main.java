package Ejercicio_familia_numerosa;

public class Main {
    public static void main(String[] args) {
        
        Persona ned = new Persona("Ned", "Stark", 50);
        Persona cat = new Persona("Catelyn", "Tully", 45);
        Persona rob = new Persona("Rob", "Stark", 30);
        Persona jon = new Persona("Jon", "Snow", 28);
        Persona sansa = new Persona("Sansa", "Stark", 20);


        ned.setConyuge(cat);
        ned.addHijo(rob);
        ned.addHijo(jon); //Con esto rob también será hermano de jon
        cat.addHijo(rob);
        cat.addHijo(jon);
        sansa.addHermano(rob);

        ned.printInfoFamilia();
        System.out.println(" ");
        cat.printInfoFamilia();
        System.out.println(" ");
        rob.printInfoFamilia();
        System.out.println(" ");
        jon.printInfoFamilia();
        System.out.println(" ");
        sansa.printInfoFamilia();

    }
}

