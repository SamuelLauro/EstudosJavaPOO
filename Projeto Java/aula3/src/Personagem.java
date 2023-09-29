public class Personagem {
    String nome;
    int nivel;
    int força;

    //void significa que não está retornando nada
    void mostrarStatus(){
        System.out.format("Personagem: %s (lvl %d) com %d de força.\n", nome, nivel, força);
    }
    
    
    void atacar(String alvo){
        System.out.format("%s atacou e causou %d de dano.\n", nome, força);
    }
}
