public class CelularVolume extends Celular {

    public int volume;

    public CelularVolume(String modelo, String fabricante, String numeroSerie) {
        super(modelo, fabricante, numeroSerie);
        this.volume = 50;
    }

    public void aumentarVolume() {
        if (volume < 100) {
            volume++;
            System.out.println("Volume aumentado para: " + volume);
        } else {
            System.out.println("O volume já está no máximo.");
        }
    }

    public void diminuirVolume() {
        if (volume > 0) {
            volume--;
            System.out.println("Volume diminuído para: " + volume);
        } else {
            System.out.println("O volume já está no mínimo.");
        }
    }

}