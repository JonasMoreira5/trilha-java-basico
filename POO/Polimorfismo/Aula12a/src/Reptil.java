public class Reptil extends Animal {
    private String corEscama;

    //Metodos especiais
    public String getCorEscama(){
        return corEscama;
    }

    public void setCorEscama(String cor){
        this.corEscama = cor;
    }

    // Metodos abstratos
    @Override
    public void locomover(){
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar(){
        System.out.println("Comendo Vegetais");
    }

    @Override
    public void emitirSom(){
        System.out.println("Som de reptil");
    }
}
