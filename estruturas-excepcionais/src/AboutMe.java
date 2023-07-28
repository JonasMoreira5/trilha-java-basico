import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class AboutMe {
    public static void main(String[] args) throws Exception {
        try {
            // Criando um novo obejto apartir da entrada do user
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome: ");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome: ");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura: ");
            double altura = scanner.nextDouble();

            // imprimindo os dados obtidos pelo usuario
            System.out.println("Olá, me chamo " + nome.toLowerCase() + " " + sobrenome);
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é " + altura + " cm");

            // fechando a leitura de dados
            scanner.close();
        } catch (InputMismatchException e) {
            System.out.println("Os campos idade e altura precisam ser numericos");
        }
    }
}
