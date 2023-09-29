public class App {
    public static void main(String[] args) throws Exception {
        // Iphone 12, tela de 6,1" , 256gb
        // Galaxy Note 20 Ultra, telas de 6,9", 256gb
        // Xiaomi Mi 12, telas de 6,81", 128gb

        // Declarando um objeto do tipo Celular = Instanciando um objeto
        Celular celularA = new Celular();
        celularA.nome = "Iphone 12";
        celularA.tamanhoDaTela = 6.1f;
        celularA.espacoArmazenamento = 256;
        celularA.sistemaOperacional = "iOS";

        Celular celularB = new Celular(); // Declarando um objeto celularB
        celularB.nome = "Galaxy Note 20 Ultra";
        celularB.tamanhoDaTela = 6.9f;
        celularB.espacoArmazenamento = 256;
        celularB.sistemaOperacional = "Android";

        Celular celularC;
        celularC = new Celular();
        celularC.nome = "Xiaomi Mi 12";
        celularC.tamanhoDaTela = 6.81f;
        celularC.espacoArmazenamento = 128;
        celularC.sistemaOperacional = "Android";

        
        System.out.format("Celular %s com tela de %.1f polegadas, com %dGb de memória e com Sistema Operacional %s \n",celularA.nome, celularA.tamanhoDaTela, celularA.espacoArmazenamento, celularA.sistemaOperacional);
        System.out.format("Celular %s com tela de %.1f polegadas, com %dGb de memória e com Sistema Operacional %s \n",celularB.nome, celularB.tamanhoDaTela, celularB.espacoArmazenamento, celularB.sistemaOperacional);
        System.out.format("Celular %s com tela de %.1f polegadas, com %dGb de memória e com Sistema Operacional %s \n",celularC.nome, celularC.tamanhoDaTela, celularC.espacoArmazenamento, celularC.sistemaOperacional);

    }
}
