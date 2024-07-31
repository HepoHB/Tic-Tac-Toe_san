public class Statistics{

    private String playerName;

    public void setName(String playerName){
        this.playerName = playerName;

    }
    public String getName(){
        return this.playerName;

    }

    public static void Wilkommen(){
        System.out.println("Vocês jogarão um 'Jogo da Velha', também conhecido como 'Tic Tac Toe'.");
        System.out.println("Para vencer, vocês deverão alinhar 3 peças na diagonal, vertical ou horizontal e impedir a pessoa adversária de fazer o mesmo.");
        System.out.println("Tudo certo para começar? Pressione Enter para continuar!");

    }

    public static void Wilkommen(String player){
        System.out.printf("Boas vindas ao jogo, %s! \n",player);

    }

}
