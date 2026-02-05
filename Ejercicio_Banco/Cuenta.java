package Ejercicio_Banco;

public class Cuenta {
    String titular; 
    double saldo = 0;

    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo < -100) {
            System.out.println("No se puede tener un saldo negativo");
        } else{
            this.saldo = saldo;
        }
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }



    @Override
    public String toString() {
        return titular + " Saldo: " + saldo + "€";
    } 

    public void imprimir(){
        System.out.println(toString());
    }

}
