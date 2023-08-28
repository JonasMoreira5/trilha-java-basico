package candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
       String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};

       for(String candidato : candidatos){
            entrandoEmContato(candidato);
       }

    }

    // entradndo em contato
    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuatentando = true;
        boolean atendeu=false;

        do{
            atendeu = atender();
            continuatentando = !atendeu;
            if(continuatentando){
                tentativasRealizadas++;
            } else{
                System.out.println("CONTATO REALIZADO COM SUCESSO!");
            }

        }while(continuatentando && tentativasRealizadas < 3);

        if(atendeu)
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA");
        else
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + " NUMERO MAXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADA");



    }


    // método auxiliar
    static boolean atender(){
        return new Random().nextInt(3) == 1;
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        System.out.println("Imprimindo a lista de candiadtos informando o indice do elemento");
        
        for(int indice=0; indice < candidatos.length; indice++){
            System.out.println("O candidato de n° " + (indice+1) + " e " + candidatos[indice]);
        }
        
        // Forma abreviada
        System.out.println("Forma abrevida de interação for each");
        for (String candidato : candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }

    static void selecaoCandidatos(){
        // Array com a lista de candidatos
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};
        
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + "Solicitou este valor de salário " + salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("O cadidato " + candidato + "foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analizarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if(salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTRA");
        }
        else{
             System.out.println("AGUARDANDO O RESULATADO DOS DEMAIS CANDIDATOS");
        }
    }
}
