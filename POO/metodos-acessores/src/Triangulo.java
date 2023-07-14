public class Triangulo {
    public double ladoA;
    public double ladoB;
    public double ladoC;

    
    public Triangulo(double ladoA2, double ladoB2, double ladoC2){
        this.ladoA = ladoA2;
        this.ladoB = ladoB2;
        this.ladoC= ladoC2;
    }

    public double calcularPerimetro(){
        double perimetro = (ladoA+ladoB+ladoC);
        return perimetro;
    }

    public String getMaiorLado(){
        if((ladoA >= ladoB) && (ladoA >= ladoC)){
            return "Lado A";
        }else if((ladoB >= ladoA) && (ladoB >= ladoC)){
            return "Lado B";
        }else{
            return "Lado C";
        }
    }
}
