import javax.lang.model.type.NullType;

public class Luta {
    // atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    // Métodos públicos
    public void marcarLuta(Lutador l1, Lutador l2){
        if ((l1.getCategoria() == l2.getCategoria()) && (l1 != l2)){
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else{
            this.aprovada = false;
            this.desafiado = NullType;
            this.desafiante = NullType;
        }
    }

    // Falta implementar esse trecho
    public void lutar(){
        if (this.aprovada){
            desafiado.apresentar();
            desafiante.apresentar();
            
        }else{
            System.out.println("Luta não pode acontecer");
        }
    }

    // Métodos especiais
    public void setDesafiado(Lutador dd){
        this.desafiado = dd;
    }

    public Lutador getDesafiado(){
        return desafiado;
    }

    public void setDesafiante(Lutador dt){
        this.desafiante = dt;
    }

    public Lutador getDesafiante(){
        return desafiante;
    }

    
}
