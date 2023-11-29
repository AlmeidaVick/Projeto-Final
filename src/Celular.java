public class Celular {

    // Atributos
    private String modelo;
    private String fabricante;
    private String numeroSerie;

    // Construtor
    public Celular(String modelo, String fabricante, String numeroSerie) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.numeroSerie = numeroSerie;
    }

    // Métodos getters e setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    // Método toString para imprimir informações do celular
    @Override
    public String toString() {
        return "Celular{" +
                "modelo='" + modelo + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", numeroSerie='" + numeroSerie + '\'' +
                '}';
    }

  

}
