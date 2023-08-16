public class Peixe extends Animal{
    private String corEscama;

    // Metodos especiais
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    // Metodo adicional
    public void soltarbolha(){
        System.out.println("Soltou uma bolha");
    }

    // Metodos abstratos
    @Override
    public void locomover(){
        System.out.println("Nadando");
    }

    @Override
    public void alimentar(){
        System.out.println("Comendo Substancias");
    }

    @Override
    public void emitirSom(){
        System.out.println("Peixe nao faz som");
    }   
}
