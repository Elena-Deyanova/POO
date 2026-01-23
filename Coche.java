public class Coche {
    private String modelo, color, matricula; 
    private boolean esMetalizado; 
    private int añoFabricacion; 
    public enum TipoCoche {
         MINI, UTILITARIO, FAMILIAR, DEPORTIVO
    }
    public enum TipoSeguro {
        TERCEROS, TODO_RIESGO
    }
    public Coche(String modelo, String color, String matricula, boolean esMetalizado, int añoFabricacion) {
        this.modelo = modelo;
        this.color = color;
        this.matricula = matricula;
        this.esMetalizado = esMetalizado;
        this.añoFabricacion = añoFabricacion;
    }
    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setEsMetalizado(boolean esMetalizado) {
        this.esMetalizado = esMetalizado;
    }
   
    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    public boolean isEsMetalizado() {
        return esMetalizado;
    }

    private TipoCoche tipoC; 

    public TipoCoche getCoche(){
        return tipoC; 
    }
    public void setTipoC (TipoCoche tipoC) {
        this.tipoC = tipoC; 
    }

    private TipoSeguro tipoS; 

    public TipoSeguro getSeguro(){
        return tipoS; 
    }
    public void setTipoS (TipoSeguro tipoS) {
        this.tipoS = tipoS; 
    }

    public void imprime(){
        System.out.println(modelo + " " + matricula + " " + color + " metaliado: " + esMetalizado + " " + añoFabricacion + " " + tipoC + " " + tipoS);
    }
    

    
}   
