public class PlanoOperadora {
    public static void main(String[] args) {
         // Aplicação de Usabilidade 
        /** 
         * Um cenário que poderiamos adequar o uso do switch/case para melhorar
         * nosso algortimo seria conforme a ilustração abaixo:
         * 
         * Imagina que fomos requisitados a criar um sistema de plano telefônico onde:
         *      - O sistema terá 03 planos: BASIC, MIDIA, TURBO
         *      - BASIC: 100 minutos de ligação
         *      - MIDIA: 100 minutos de ligação  + Whats e Instagram grátis
         *      - TURBO: 100 minutos de ligação  + Whats e Instagram grátis + 5Gb Youtube
         */

        // A ordem dos planos está numa lógica 
         String plano = "T";

         switch (plano) {
            case "T":
                System.out.println("5Gb Youtube");
            case "M":
                System.out.println("Whats e Instagram grátis");
            case "B":
                System.out.println("100 minutos de ligação");
         }
    }
}
