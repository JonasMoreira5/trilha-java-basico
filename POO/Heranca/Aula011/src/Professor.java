public class Professor extends Pessoa{
    private String especialidade;
    private float salario;

    public String getEspecialidade(){
        return especialidade;
    }

    public void setEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }

    public float getSalario(){
        return salario;
    }

    public void setSalario(float salario){
        this.salario = salario;
    }

    // metodo
    public void receberAumento(){
        System.out.println(this.nome + " recebeu um aumento ");
    }
}
