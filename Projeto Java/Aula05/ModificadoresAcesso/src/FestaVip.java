public class FestaVip {
    int quatidadeCafe = 30;
    int quantidadeSalgados = 50;


   public void entrar(){
        bebercafe();
        comerSalgado();
        bebercafe();
    }

   private void bebercafe(){
        quatidadeCafe -- ;
        System.out.println("Bebeu uma xicara de café");

    }

    private void comerSalgado(){
        quantidadeSalgados--;
        System.out.println("Comeu 5 salgados");
    }
}
