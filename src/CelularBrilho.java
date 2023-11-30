public class CelularBrilho extends Celular {
        
    public int nivelBrilho;

    
    public CelularBrilho(String modelo, String fabricante, String numeroSerie) {
        super(modelo, fabricante, numeroSerie);
        this.nivelBrilho = 50; 
    }

    
    public void aumentarBrilho() {
        if (nivelBrilho < 100) {
            nivelBrilho++;
            System.out.println("Brilho aumentado para: " + nivelBrilho);
        } else {
            System.out.println("O brilho já está no máximo.");
        }
    }

    
    public void diminuirBrilho() {
        if (nivelBrilho > 0) {
            nivelBrilho--;
            System.out.println("Brilho diminuído para: " + nivelBrilho);
        } else {
            System.out.println("O brilho já está no mínimo.");
        }
    }

    
}