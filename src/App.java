public class App {

    public static void main(String[] args) {

        // Criando um objeto Celular
        Celular meuCelular = new Celular("Galaxy S21", "Samsung", "123456789");

        // Imprimindo informações do celular
        System.out.println("Informações iniciais do Celular:");
        System.out.println();
        System.out.println(meuCelular);

        // Criando um objeto CelularBateria
        CelularBateria meuCelularComBateria = new CelularBateria("iPhone 12", "Apple", "987654321");

        // Imprimindo informações do celular com bateria
        System.out.println("Informações do Celular com Bateria:");
        System.out.println(meuCelularComBateria);

        // Carregando a bateria e verificando o nível
        meuCelularComBateria.carregarBateria(30);
        meuCelularComBateria.verificarNivelBateria();

        // Criando um objeto CelularTela
        CelularTela meuCelularComTela = new CelularTela("Galaxy A52", "Samsung", "987-6543");

        // Imprimindo informações do celular com tela
        System.out.println("Informações do Celular com Tela:");
        System.out.println(meuCelularComTela);

        // Ligando e desligando a tela
        meuCelularComTela.ligarTela();
        meuCelularComTela.desligarTela();

        // Criando um objeto CelularVolume
        CelularVolume meuCelularComVolume = new CelularVolume("Pixel 5", "Google", "789-0123");

        // Imprimindo informações do celular com volume
        System.out.println("Informações do Celular com Volume:");
        System.out.println(meuCelularComVolume);

        // Ajustando o volume
        meuCelularComVolume.aumentarVolume();
        meuCelularComVolume.diminuirVolume();

        // Criando um objeto CelularWifi
        CelularWifi meuCelularComWifi = new CelularWifi("Galaxy S21", "Samsung", "123-4567");
    
        // Imprimindo informações do celular com Wi-Fi
        System.out.println("Informações do Celular com Wi-Fi:");
        System.out.println(meuCelularComWifi);

        // Conectando e desconectando o Wi-Fi
        meuCelularComWifi.conectarWifi();
        meuCelularComWifi.desconectarWifi();

        // Criando um objeto CelularBrilho
        CelularBrilho meuCelularComBrilho = new CelularBrilho("Galaxy S22", "Samsung", "987-6543");
    
        // Imprimindo informações do celular com brilho
        System.out.println("Informações do Celular com Brilho:");
        System.out.println(meuCelularComBrilho);

        // Ajustando o brilho
        meuCelularComBrilho.aumentarBrilho();
        meuCelularComBrilho.diminuirBrilho();


    }
}
