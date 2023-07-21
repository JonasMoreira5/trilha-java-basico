import java.util.Random;

public class Luta {
    // atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    // Métodos públicos
    public void marcarLuta(Lutador l1, Lutador l2){
        if ((l1.getCategoria().equals(l2.getCategoria())) && l1 != l2){
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else{
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    // Falta implementar esse trecho
    public void lutar(){
        if (this.aprovada){
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();
            
            // Escolhendo um numero aleatorio
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); // 0 1 2
            
            // adicionar Switch case  
        }else{
            System.out.println("Luta não pode acontecer");
        }
    }

    // Métodos especiais
    public void setDesafiado(Lutador desafiado){
        this.desafiado = desafiado;
    }

    public Lutador getDesafiado(){
        return desafiado;
    }

    public void setDesafiante(Lutador desafiante){
        this.desafiante = desafiante;
    }

    public Lutador getDesafiante(){
        return desafiante;
    }

    public void setAprovada(boolean aprovada){
        this.aprovada = aprovada;
    }

    public boolean getAprovada(){
        return aprovada;
    }

    public void setRounds(int rounds){
        this.rounds = rounds;
    }

    public int getRounds(){
        return rounds;
    }
}
