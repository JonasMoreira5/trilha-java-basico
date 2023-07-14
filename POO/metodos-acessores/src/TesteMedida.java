import java.util.Scanner;

public class TesteMedida {
    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            double ladoA;
            double ladoB;
            double ladoC;

            System.out.println("Informe a medida do lado A: ");
            ladoA = ler.nextDouble();

            System.out.println("Informe a medida do lado B ");
            ladoB = ler.nextDouble();

            System.out.println("Informe a medida do lado C: ");
            ladoC = ler.nextDouble();

            Triangulo c1 = new Triangulo(ladoA, ladoB, ladoC);
            
            System.out.println("Maior lado: " + c1.getMaiorLado());
            System.out.println("Sua área é: " + c1.calcularPerimetro());
        }
        
    }
}
