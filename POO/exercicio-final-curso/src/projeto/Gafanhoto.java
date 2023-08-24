package projeto;

public class Gafanhoto extends Pessoa {
    private String login;
    private int totAssistido;

    // metodo contrutor
    public Gafanhoto(String nome, int idade, String sexo, String login){
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }

    // metodos especiais
    public String getLogin(){
        return login;
    }

    public void setlogin(String login){
        this.login = login;
    }

    public int getTotAssistido(){
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido){
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString(){
        return "Gafanhoto{" + super.toString() +  "\nlogin = " + login + " totAssistido = " + totAssistido + "}";
    }
}
