public class Reloj {
    private int hora, minuto, segundo;

    public Reloj(int hora, int minuto, int segundo) {
        if (hora <= 24 && minuto <= 59 && segundo <= 59) {
            this.hora = hora; 
            this.minuto = minuto; 
            this.segundo = segundo;     
        } else{
            System.err.println("Los formatos del reloj no son correctos.");
        }
    }

    public Reloj() {
         this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (hora > 24) {
            System.err.println("La hora es incorrecta");
        } else{
            this.hora = hora;
        }
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        if (minuto > 59) {
            System.err.println("La hora es incorrecta");
        } else{
            this.minuto = minuto;
        }
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        if (segundo > 59) {
            System.err.println("La hora es incorrecta");
        } else{
            this.segundo = segundo;
        }
    } 

    public void setReloj(int hora, int minuto, int segundo){
        if (hora <= 24 && minuto <= 59 && segundo <= 59) {
            this.hora = hora; 
            this.minuto = minuto; 
            this.segundo = segundo;     
        } else{
            System.err.println("Los formatos del reloj no son correctos.");
        }
        
    }

    public String dimeHora(){
        return hora + ":" + minuto + ":" + segundo;
    }

    public void imprimeHora(){
        System.out.println(dimeHora());
    }

    public String dimeHora12(){
        if (hora >= 12) {
            return (hora-12) + "pm:" + minuto + ":" + segundo;         
        } else{
            return hora + "am:" + minuto + ":" + segundo;
        }
    }

    public void imprimeHora12(){
        System.out.println(dimeHora12());
    }

    public String tick(){
        segundo += 1; 
        if (segundo == 60) {
            segundo = 0; 
            minuto += 1; 
            if( minuto == 60){
                minuto = 0; 
                hora += 1; 
                if (hora > 24) {
                    hora = 0; 
                }
            }
        }

        return hora + ":" + minuto + ":" + segundo;
    }

    public void imprimetick(){
        System.out.println(tick());
    }



    
}
