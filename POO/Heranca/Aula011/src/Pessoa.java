public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;

    // Metodos
    public void fazerAniv(){
        this.idade++;
    }
    
    // Metodos especiais
    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getSexo(){
        return this.sexo;
    }

    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    public String toString(){
        return "Dados{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + "}";
    }
}
