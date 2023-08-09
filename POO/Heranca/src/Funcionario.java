public class Funcionario extends Pessoa{
    // atributos
    private String setor;
    private boolean trabalhando;
    
    // Metodos
    public void mudarTrabalho(){
        this.trabalhando = ! this.trabalhando;
    }

    // Metodos especiais
    public String getSetor(){
        return setor;
    }

    public void setSetor(String setor){
        this.setor = setor;
    }

    public boolean getTrabalhando(){
        return trabalhando;
    }

    public void setTrabalhando(Boolean trabalhando){
        this.trabalhando = trabalhando;
    }
}
