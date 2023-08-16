public class Tecnico extends Aluno{
    private String registroProfissional;

    public String getRegistroProf(){
        return registroProfissional;
    }

    public void setRegistroProfissional(String registro){
        this.registroProfissional = registro;
    }

    // metodos
    public void praticar(){
        System.out.println(this.nome + " esta concertando um computador");
    }
}
