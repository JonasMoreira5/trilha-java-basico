
public class Lutador {
    // Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias, derrotas, empates;

    // Métodos Construtor
    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em){
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    // Métodos especiais
    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNacionalidade(){
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public float getAltura(){
        return altura;
    }

    public void setAltura(float altura){
        this.altura = altura;
    }

    public float getPeso(){
        return peso;
    }

    public void setPeso(float peso){
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria(){
        return this.categoria;
    }

    private void setCategoria(){
        if (this.peso<52.2){
            this.categoria = "Invalido";
        } else if (this.peso <= 70.3){
            this.categoria = "leve";
        } else if (this.peso <= 83.9){
            this.categoria = "Médio";
        } else if (this.peso <= 120.2){
            this.categoria = "Pesado";
        } else{
            this.categoria = "Inválido";
        }
    }

    public int getVitorias(){
        return this.vitorias;
    }

    public void setVitorias(int vitorias){
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return this.derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return this.empates;
    }

    public void setEmpate(int empates) {
        this.empates = empates;
    }


    // Métodos públicos
    public void apresentar(){
        System.out.println("------------------------------------");
        System.out.println("Apresentamos o Lutador " + this.getNome());
        System.out.println("Diretamente de " + this.getNacionalidade());
        System.out.println("Com "+ this.getIdade() + " Anos");
        System.out.println("E " + this.getAltura() + "m de altura");
        System.out.println("Pesando: " + this.getPeso() + "Kg");
        System.out.println(this.getVitorias() + " Vitórias");
        System.out.println(this.getDerrotas() + " derrotas e");
        System.out.println(this.getEmpates() + " empates");
    }

    public void Status(){
        System.out.println(this.getNome() + "é um peso " + this.categoria);
        System.out.println("Ganhou " + this.getVitorias() + " vezes");
        System.out.println("Perdeu " + getDerrotas() + " vezes");
        System.out.println("Empatou " + getEmpates() + " vezes");
    }

    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta(){
        this.setEmpate(this.getEmpates() + 1);
    }
}
