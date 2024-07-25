import java.util.Scanner;
public class Board {
    private static byte[][] matrix;
    public Board(byte[][] matrix){
        this.matrix = matrix;
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

    public static void setBoard(byte column, byte line, short round){
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
        for(short i = 0; i < matrix.length; i++){
            for(short j = 0; j < matrix.length; j++){


            }

        }
        return run;

    }


}
