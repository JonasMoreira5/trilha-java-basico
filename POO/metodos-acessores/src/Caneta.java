public class Caneta {
    public String modelo;
    private float ponta;

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String m){
        this.modelo = m;
    }

    public float getPonta(){
        return this.ponta;
    }

    public void setPonta(float p){
        this.ponta = 0.5f;
    }

    public void status(){
        System.out.println("SOBRE A CANETA:");
        System.out.print("Modelo: " + this.getModelo());
        System.out.print("\nPonta: " + this.getPonta());
    }
}
