public class ContaBanco {
    // atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    // Métodos Personalizados
    public void estadoAtual(){
        System.out.println("----------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo da conta: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }

    public void abrirConta(String tipo){
        this.setTipo(tipo);
        this.setStatus(true);
        if(tipo == "CC"){
            this.setSaldo(50);
        }else if(tipo == "CP"){
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }

    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("Conta não pode ser fechada, ainda possui dinheiro");
        }else if (this.getSaldo() < 0){
            System.out.println("Conta não pode ser fechadam, está em débito");
        }
        else{
            this.setStatus(false);
            System.out.print("Conta fechada com sucesso!");
        }
    }

    public void depositar(float valor){
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Deposito realizado na conta de " + this.getDono());
        }else{
            System.out.println("Impossivel depositar em uma conta fechada.");
        }
    }

    public void sacar(float valor){
        if (this.getStatus()){
            if (this.getSaldo() >= valor){
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque realizado na conta de " + this.getDono());
            } else{
                System.out.println("Saldo Insuficiente para saque");
            }
        } else{
            System.out.println("Impossivel sacar de uma conta fechada");
        }
    }
     
    public void pagarMensal(){
        int v = 0;
        if (this.getTipo() == "CC"){
            v = 12;
        } else if(this.getTipo() == "CP"){
            v = 20;
        }

        if (this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso!");               
        } else{
            System.out.println("Impossivel pagar uma conta fechada!");
        }
    }

    // Métodos especiais (Construtor / get e set)
    public ContaBanco(){
        this.setSaldo(0);
        this.setStatus(false);;
    }

    public void setNumConta(int num){
        this.numConta = num;
    }
    
    public int getNumConta(){
        return numConta;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setDono(String dono){
        this.dono = dono;
    }

    public String getDono(){
        return this.dono;
    }

    public void setSaldo(float saldo){
        this.saldo = saldo;
    }

    public float getSaldo(){
        return this.saldo;
    }

    public void setStatus(boolean status){
        this.status = status;
    }

    public boolean getStatus(){
        return this.status;
    }
}
