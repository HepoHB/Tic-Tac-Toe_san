import com.sun.jdi.Value;

import java.util.Scanner;

public class Main{
    static Scanner scanner = new Scanner(System.in);
    static Statistics playerOne = new Statistics();
    static Statistics playerTwo = new Statistics();

    public static void main(String[] args){
        byte[][] matrix = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };
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
            System.out.print("Digite a linha em que deseja marcar: ");
            byte line = VarLimiter();
            System.out.print("Agora digite a coluna: ");
            byte column = VarLimiter();
            if(matrix[line][column] > 3){
                matrix[line][column] = 1;

            } else{
                System.out.println("Esta casa já está ocupada! Tente novamente.");

            }
            System.out.println(matrix[line][column]);


        } while(run);


    }

    public static byte VarLimiter(){
        byte value;
        do{
            value = scanner.nextByte();
            if (value >= 4 || value < 1){
                System.out.print("Este valor não representa uma casa do tabuleiro! Digite novamente: ");

            }
        } while(value >= 3 || value < 1);
        value--;
        System.out.println(value);
        return value;
    }

}