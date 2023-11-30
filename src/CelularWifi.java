public class CelularWifi extends Celular {

    public boolean wifiConectado;

    
    public CelularWifi(String modelo, String fabricante, String numeroSerie) {
        super(modelo, fabricante, numeroSerie);
        this.wifiConectado = false; 
    }

    
    public void conectarWifi() {
        if (!wifiConectado) {
            wifiConectado = true;
            System.out.println("Conexão Wi-Fi estabelecida.");
        } else {
            System.out.println("O Wi-Fi já está conectado.");
        }
    }

    
    public void desconectarWifi() {
        if (wifiConectado) {
            wifiConectado = false;
            System.out.println("Conexão Wi-Fi desconectada.");
        } else {
            System.out.println("O Wi-Fi já está desconectado.");
        }
    }

    
}