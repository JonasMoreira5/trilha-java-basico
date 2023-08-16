public class Bolsista extends Aluno{
    private float bolsa;

    public float getBolsa(){
        return bolsa;
    }

    public void setBolsa(float bolsa){
        this.bolsa = bolsa;
    }

    // Metodo
    public void RenovarBolsa(){
        System.out.println("Renovando bolsa de " + this.nome);
    }

    @Override
    public void PagarMensalidade(){
        System.out.println(this.nome + "  eh o bolsista! Pagamento facilitado");
    }

}
