public class App {
    public static void main(String[] args) throws Exception {
        Personagem heroi = new Personagem();
        heroi.nome = "Zeus";
        heroi.nivel = 2;
        heroi.forca = 8;
        
        heroi.mostrarStatus();
        heroi.atacar("Hydra", "");

        
    }
}
