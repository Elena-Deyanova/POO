

public class MainCoche {
    public static void main(String[] args) {
        Coche coche = new Coche("Renault Clio 2025", "gris", "7775MLV", false, 2024); 

        coche.setTipoC(Coche.TipoCoche.DEPORTIVO);
        coche.setTipoS(Coche.TipoSeguro.TODO_RIESGO);

        coche.imprime();
    }
}
