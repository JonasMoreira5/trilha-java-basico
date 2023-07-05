public class Usuario {
    public static void main(String[] args) throws Exception {
        // Criando um novo objeto
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada ? " + smartTv.ligada);
        System.out.println("Canal Atual ? " + smartTv.canal);
        System.out.println("Volume atual ? " + smartTv.volume);
        

        // Testes com os metodos
        /*
        smartTv.mudaCanal(13);
        System.out.println("Novo Canal Atual ? " + smartTv.canal);
        */
        
        //------------------------------------------------------------------
        /*
        smartTv.aumentarVolume();
        System.out.println("Novo volume -> Volume atual ? " + smartTv.volume);
        
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Novo volume -> Volume atual ? " + smartTv.volume);
        */

        //------------------------------------------------------------------
       
        /*
        smartTv.ligar();
        System.out.println("NOVO METODO -> TV ligada ? " + smartTv.ligada);
        
        smartTv.desligar();
        System.out.println("NOVO STATUS -> TV ligada ? " + smartTv.ligada);
        */
       

    }
}
