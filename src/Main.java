import com.sun.jdi.Value;

import java.util.Scanner;

public class Main{
    static Scanner scanner = new Scanner(System.in);
    static Statistics playerOne = new Statistics();
    static Statistics playerTwo = new Statistics();
    static short round = 1;
    static byte[][] matrix = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
    };
    static Board board = new Board(matrix);

    public static void main(String[] args){
        //Initializer();
        Game(matrix);

    }

    public static void Initializer(){
        System.out.print("Digite seu nome: ");
        playerOne.setName(scanner.nextLine());
        Statistics.Wilkommen(playerOne.getName());
        System.out.print("Digite o nome da pessoa adversária: ");
        playerTwo.setName(scanner.nextLine());
        Statistics.Wilkommen(playerTwo.getName());

    }

    public static void Game(byte[][] matrix){
        boolean run = true;
        do{
            System.out.print("Digite a coluna em que deseja marcar: ");
            byte line = board.varLimiter(scanner);
            System.out.print("Agora digite a linha: ");
            byte column = board.varLimiter(scanner);
            board.setBoard(line, column, round);
            board.showBoard();
            run = board.verifyWinner(run);
            round++;

        } while(run);


    }

}