import java.util.Arrays;
import java.util.Scanner;
public class Board {
    private static byte[][] matrix;
    private static byte[][] reset;
    public Board(byte[][] matrixes){
        this.matrix = new byte[matrixes.length][];
        for (int i = 0; i < matrixes.length; i++){
            this.matrix[i] = Arrays.copyOf(matrixes[i], matrixes[i].length);

        }

    }

    public static Byte varLimiter(Scanner scanner){
        byte value;
        do{
            value = scanner.nextByte();
            if (value > 3 || value < 1){
                System.out.print("Este valor não representa uma casa do tabuleiro! Digite novamente: ");

            }
        } while(value > 3 || value < 1);
        value--;
        return value;

    }

    public static void setBoard(byte column, byte line, int round){
        System.out.println("Round = " + (round % 2));
        if ((round % 2) == 0){
            matrix[line][column] = 1;

        } else{
            matrix[line][column] = 0;

        }

    }

    public static void showBoard(){
        for(short i = 0; i < matrix.length; i++){
            String spaceI = " ";
            String spaceII = " ";
            String spaceIII = " ";
            if(matrix[i][0] > 3){spaceI = " ";}else if(matrix[i][0] == 0){spaceI = "X";} else{spaceI = "0";}
            if(matrix[i][1] > 3){spaceII = " ";}else if(matrix[i][1] == 0){spaceII = "X";}else{spaceII = "0";}
            if(matrix[i][2] > 3){spaceIII = " ";}else if(matrix[i][2] == 0){spaceIII = "X";}else{spaceIII = "0";}
            System.out.printf("%s | %s | %s \n", spaceI, spaceII, spaceIII);


        }

    }

    public static boolean verifyWinner(boolean run){
        int sum = matrix[0][0] + matrix[1][0] + matrix[2][0];
        run = verifySum(sum, run);
        sum = matrix[0][1] + matrix[1][1] + matrix[2][1];
        run = verifySum(sum, run);
        sum = matrix[0][2] + matrix[1][2] + matrix[2][2];
        run = verifySum(sum, run);

        sum = matrix[0][0] + matrix[0][1] + matrix[0][2];
        run = verifySum(sum, run);
        sum = matrix[1][0] + matrix[1][1] + matrix[1][2];
        run = verifySum(sum, run);
        sum = matrix[2][0] + matrix[2][1] + matrix[2][2];
        run = verifySum(sum, run);

        sum = matrix[0][0] + matrix[1][1] + matrix[2][2];
        run = verifySum(sum, run);
        sum = matrix[0][2] + matrix[1][1] + matrix[2][0];
        run = verifySum(sum, run);


        return run;

    }


    private static boolean verifySum(int sum, boolean run){
        if (sum == 3 || sum == 0) {
            System.out.println("YOSHI");
            run = false;
            return run;

        }
        return run;

    }

    public static boolean over(Scanner scanner){
        String continueGame = scanner.nextLine();
        if(continueGame.toUpperCase().equals("S")){
            return true;

        } else if(continueGame.toUpperCase().equals("N")){
            return false;

        } else{
            System.out.println("Por favor, digite somente 'S' ou 'N'.");
            return over(scanner);

        }

    }

    public static void resetMatrix(byte[][] matrixes){
        matrix = matrixes;

    }

}