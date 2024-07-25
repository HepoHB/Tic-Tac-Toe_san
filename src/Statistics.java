public class Statistics{

    private static String playerName;

    public void setName(String playerName){
        this.playerName = playerName;

    }
    public String getName(){
        return this.playerName;

    }

    public static void Wilkommen(String playerOne){
        System.out.printf("Boas vindas ao jogo, %s! \n",playerOne);

    }

}
