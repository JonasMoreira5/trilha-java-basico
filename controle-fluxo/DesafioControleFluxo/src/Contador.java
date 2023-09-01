import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parametro: ");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo parametro: ");
        int parametroDois = terminal.nextInt();

        try {
            // chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException e) {
            // imprimir a mensagem: Os segundo parâmetro dever ser maior que o primeiro
            e.printStackTrace();
            System.out.println("O segundo parametro dever ser maior que o primeiro");
        }

        terminal.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        int contagem;
        
        // validar se parametoUm é MAIOR que parametroDois e lançar a exeção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        } else {
            contagem = parametroDois - parametroUm;

            // realizar o for para imprimir os números com base na variável contagem
            for (int i = parametroUm+1 ; i <= parametroDois; i++) {
                System.out.println("Imprimindo o numero " + i);
            }
        }
        System.out.println("Fim da contagem.");
        System.out.println("\nNumero de ocorrencias: " + contagem);
    }
}
