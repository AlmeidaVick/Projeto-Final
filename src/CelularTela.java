public class CelularTela extends Celular{

    private boolean telaLigada;


    public CelularTela(String modelo, String fabricante, String numeroSerie) {
        super(modelo, fabricante, numeroSerie);
        this.telaLigada = false; 
    }

   
    public void ligarTela() {
        if (!telaLigada) {
            telaLigada = true;
            System.out.println("Tela ligada.");
        } else {
            System.out.println("A tela já está ligada.");
        }
    }

   
    public void desligarTela() {
        if (telaLigada) {
            telaLigada = false;
            System.out.println("Tela desligada.");
        } else {
            System.out.println("A tela já está desligada.");
        }
    }

    
}