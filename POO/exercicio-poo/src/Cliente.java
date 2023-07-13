public class Cliente {
    public static void main(String[] args) throws Exception {
        BombaCombustivel c1 = new BombaCombustivel("Gasolina", 5 , 100);
        c1.status();
        BombaCombustivel c2 = new BombaCombustivel("Etanol", 2, 100);
        c2.status();
    }
}