public class BombaCombustivel {
    public String tipoCombustivel;
    private float valorLitro;
    private int quantidadeCombustivel;

    public BombaCombustivel(String tipoCombustivel, float valorLitro, int quantidadeCombustivel){
        this.tipoCombustivel = tipoCombustivel;
        this.valorLitro = valorLitro;
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    public void abastecerPorValor(float valor){
        int qtdLitro = (int) (this.quantidadeCombustivel - (valor * valorLitro));
        this.quantidadeCombustivel = qtdLitro;
    }

    public void abastecerPorLitro(float litro){
        float valorPagamento = (litro * valorLitro);
        System.out.println("Valor a ser pago: " + valorPagamento);
    }

    public float getAlteraValor(){
        return this.valorLitro;
    }

    public void setAlteraValor(float valor){
        this.valorLitro = valor;
    }

    public String getMostrarTipoCombustivel(){
        return this.tipoCombustivel;
    }
    public void setAlteraTipoCombustivel(String combustivel){
        this.tipoCombustivel = combustivel;
    }

    public int getMostrarQuantidadeCombustivel(){
        return this.quantidadeCombustivel;
    }

    public int alteraQuantidadeCombustivel(int quantidade){
        return this.quantidadeCombustivel = quantidade;
    }

    public void status(){
        System.out.println("Tipo de combustivel: " + this.getMostrarTipoCombustivel());
        System.out.println("Valor do litro: " + this.getAlteraValor());
        System.out.println("Quantidade de combustivel: " + this.getMostrarQuantidadeCombustivel());
    }
}