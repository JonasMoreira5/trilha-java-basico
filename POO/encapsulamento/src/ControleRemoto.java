public class ControleRemoto implements Controlador{
     // Atributos
     public int volume;
     private boolean ligado;
     private boolean tocando;

     // Métodos Especiais
     public ControleRemoto() {
          this.volume = 50;
          this.ligado = false;
          this.tocando = false;
     }

     private int getVolume() {
          return volume;
     }

     private void setVolume(int volume) {
          this.volume = volume;
     }

     private boolean getLigado() {
          return ligado;
     }

     private void setligado(boolean ligado) {
          this.ligado = ligado;
     }

     private boolean getTocando() {
          return tocando;
     }

     private void setTocando(boolean tocando) {
          this.tocando = tocando;
     }

      // Métodos abstratos
     @Override
     public void ligar() {
          this.setligado(true);
     }

     @Override
     public void desligar() {
          this.setligado(false);
     }

     @Override
     public void abriMenu() {
          System.out.println("------MENU------");
          System.out.println("Está ligado: " + this.getLigado());
          System.out.println("Está tocando: " + this.getTocando());
          System.out.print("Volume: " + this.getVolume());
          for (int i = 0; i <= this.getVolume(); i+=10){
               System.out.print("|");
          }
          System.out.println("");
     }

     @Override
     public void fecharMenu() {
          System.out.println("Fechando Menu...");
     }

     @Override
     public void maisVolume() {
          if(this.getLigado()){
               this.setVolume(this.getVolume() + 1);
          }else{
               System.out.println("Impossivel aumentar volume");
          }
     }

     @Override
     public void menosVolume() {
          if(this.getLigado()){
               this.setVolume(this.getVolume() - 1);
          }else{
               System.out.println("Impossivel diminuir volume");
          }
     }

     @Override
     public void ligarMudo() {
          if(this.getLigado() && this.getVolume() > 0){
               this.setVolume(0);
          }
     }

     @Override
     public void desligarMudo() {
          if(this.getLigado() && this.getVolume() == 0){
               this.setVolume(50);
          }
     }

     @Override
     public void play() {
          if (this.getLigado() && !(this.getTocando())){
               this.setTocando(true);
          }
     }

     @Override
     public void pause() {
          if (this.getLigado() && this.getTocando()){
               this.setTocando(false);
          }else{
               System.out.println("Não consegui reprodudir");
          }
     }
}
