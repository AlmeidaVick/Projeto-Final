public class Celular {
    
        // Atributos da classe
        private String marca; 
        private String modelo; 
        private boolean ligado; 
    
        // Construtor da classe
        public Celular(String marca, String modelo) {
          this.marca = marca;
          this.modelo = modelo; 
          this.ligado = false;
        }
      

    


        public String getMarca() {
            return marca;
        }
        public void setMarca(String marca) {
            this.marca = marca;
        }

        public String getModelo() {
            return modelo;
        }
        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        
        // Métodos da classe
        // Um método para ligar o celular
        public void ligar() {
          if (!this.ligado) { // se o celular não está ligado
            this.ligado = true; // muda o atributo ligado para verdadeiro
            System.out.println("O celular " + this.marca + " " + this.modelo + " foi ligado.");
          } else { // se o celular já está ligado
            System.out.println("O celular " + this.marca + " " + this.modelo + " já está ligado.");
          }
        }
      
        // Um método para desligar o celular
        public void desligar() {
          if (this.ligado) { // se o celular está ligado
            this.ligado = false; // muda o atributo ligado para falso
            System.out.println("O celular " + this.marca + " " + this.modelo + " foi desligado.");
          } else { // se o celular já está desligado
            System.out.println("O celular " + this.marca + " " + this.modelo + " já está desligado.");
          }
        }
    
      

}
