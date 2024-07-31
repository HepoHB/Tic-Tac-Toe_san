import java.util.Scanner;
import java.util.Random;

public class Main{
    static Scanner scanner = new Scanner(System.in);
    static Statistics playerOne = new Statistics();
    static Statistics playerTwo = new Statistics();
    static Random random = new Random();
    static int round = random.nextInt(2);
    static final byte[][] MATRIX = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
    };
    static Board board = new Board(MATRIX);

    public static void main(String[] args) {
        Initializer();
        Game(MATRIX);

    }

    public static void Initializer() {
        System.out.print("Digite seu nome: ");
        playerOne.setName(scanner.nextLine());
        Statistics.Wilkommen(playerOne.getName());
        System.out.print("Digite o nome da pessoa adversária: ");
        playerTwo.setName(scanner.nextLine());
        Statistics.Wilkommen(playerTwo.getName());
        Statistics.Wilkommen();
        scanner.nextLine();

    }

    public static void Game(byte[][] matrix) {
        boolean game = true;
        do{
            boolean run = true;
            do {
                board.showBoard();
                byte line;
                byte column;
                boolean writeAXIS = true;

                if(round % 2 == 0) {
                    System.out.printf("Sua vez de jogar, %s! \n", playerOne.getName());

                } else{
                    System.out.printf("Sua vez de jogar, %s! \n", playerTwo.getName());


                }

                do{
                    System.out.print("Digite a coluna em que deseja marcar: ");
                    line = board.varLimiter(scanner);
                    System.out.print("Agora digite a linha: ");
                    column = board.varLimiter(scanner);
                    if(board.blockRepeat(line, column)){
                        writeAXIS = false;

                    } else{
                        System.out.println("Esta casa já foi ocupada! Tente novamente.");

                    }

                } while(writeAXIS);
                board.setBoard(line, column, round);
                run = board.verifyWinner(run);
                round++;

            } while(run);
            if((round - 1) % 2 == 0){
                System.out.printf("Parabéns, %s! Você venceu! \n", playerOne.getName());

            } else{
                System.out.printf("Parabéns, %s! Você venceu! \n", playerTwo.getName());

            }
            System.out.println("Ainda querem continuar jogando? Pressione 'S' para Sim e 'N' para não.");
            game = board.over(scanner);
            board.resetMatrix(MATRIX);
            round = random.nextInt(2);

        } while(game);


    }

}