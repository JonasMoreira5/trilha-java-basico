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
            
        } catch (Exception e) {
            // imprimir a mensagem: Os segundo parâmetro dever ser maior que o primeiro
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        // validar se parametoUm é MAIOR que parametroDois e lançar a exeção

        int contagem = parametroDois - parametroDois;
        // realizar o for para imprimir os números com base na variável contagem
    }
}
