import java.util.Random;

public class Personagem {
    String nome;
    int nivel;
    int forca;

    //void significa que não está retornando nada
    void mostrarStatus(){
        System.out.format("Personagem: %s (lvl %d) com %d de força.\n", nome, nivel, forca);
    }
    
   int calcularDano(){
    // 1...20
    // nextInt(): 0...19
    // nextInt() + 1: 0+1, 0+19, 1 --> 20
     Random gerador = new Random();
     int dado20Faces = 1 + gerador.nextInt(19);
     int dano = forca + dado20Faces;
     return dano;
   }

    void atacar(String alvo, String habilidade){
        int danoCausado = calcularDano();
        if (habilidade.length() == 0 ) {
            System.out.format("%s atacou %s e causou %d de dano.\n", nome, alvo, danoCausado);
        } else{
            System.out.format("%s usou '%s' contra %s e causou %d de dano.\n", nome, habilidade, alvo, danoCausado);

        }
  
    }
}
