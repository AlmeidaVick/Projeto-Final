public class CelularBateria extends Celular {

    public int nivelBateria;

    public CelularBateria(String modelo, String fabricante, String numeroSerie) {
        super(modelo, fabricante, numeroSerie);
        this.nivelBateria = 100;
    }

    public void carregarBateria(int quantidade) {

        if (quantidade > 0) {

            nivelBateria = Math.min(nivelBateria + quantidade, 100);
            System.out.println("Bateria carregada. Nível atual: " + nivelBateria + "%");
        } else {
            System.out.println("A quantidade de carga deve ser positiva.");
        }
    }

    public void verificarNivelBateria() {
        System.out.println("Nível atual da bateria: " + nivelBateria + "%");
    }

}