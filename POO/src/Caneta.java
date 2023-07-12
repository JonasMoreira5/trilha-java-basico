public class Caneta {
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	private boolean tampada;
	
	public void status() {
        System.out.println("Modelo: " + this.modelo);
		System.out.println("Uma caneta " + this.cor);
        System.out.println("Esta tampada? " + this.tampada);
        System.out.println("Tamanho da ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
	}
	protected void rabiscar() {
		if(this.tampada == true){
            System.out.println("ERRO! Caneta tampada!");
        }else{
            System.out.print("Estou rabiscando...");
        }
	}
	
	public void tampar() {
		this.tampada = true;
	}
	
	public void destampar() {
		this.tampada = false;
	}
}
