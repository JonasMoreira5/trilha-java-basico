public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    // Metodos  que manipulam esses estados
    public void mudaCanal(int novoCanal){
        canal = novoCanal;
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    /*
    public void aumentarVolume(){
        volume++;
    }

    public void diminuirVolume(){
        volume--;
    }
    */
    
    /*
    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }
    */
    



}
