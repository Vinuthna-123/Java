
import java.util.Scanner;
public class TicTacToe {
    public static void main(String[] args) {
    char[] Board = { '1','2','3','4','5','6','7','8','9'};
    int numberofsquaresplayed = 0;
    char whoseturnitis = 'x';
    String endingmessage = "Ohh Shut you had an Tie!!!";
    while(numberofsquaresplayed < 9){
        printBoard(Board);
        System.out.printf("Choose the square player %c : " , whoseturnitis);
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        Board[input-1]=whoseturnitis;

        if((Board[0] + Board[1] + Board[2] == (whoseturnitis * 3))
        || (Board[3] + Board[4] + Board[5] == (whoseturnitis * 3))
        ||(Board[6] + Board[7] + Board[8] == (whoseturnitis * 3))
        ||(Board[0] + Board[3] + Board[6] == (whoseturnitis * 3))
        ||(Board[1] + Board[4] + Board[7] == (whoseturnitis * 3))
        ||(Board[2] + Board[5] + Board[8] == (whoseturnitis * 3))
        ||(Board[0] + Board[4] + Board[8] == (whoseturnitis * 3))
        ||(Board[2] + Board[4] + Board[6] == (whoseturnitis * 3))
        )
        {
            printBoard(Board);
            endingmessage = "Congratulations !! You Won !!";
            System.out.println(endingmessage);
            break;
        }else{
            numberofsquaresplayed++;
            whoseturnitis = (whoseturnitis =='x') ? 'o' : 'x' ;
        }

    }
    }
    private static void printBoard(char[] Board){
      System.out.println(Board[0] + " | " + Board[1] + " | " + Board[2]);
      System.out.println(" - + - + - ");
      System.out.println(Board[3] + " | " + Board[4] + " | " + Board[5]);
      System.out.println(" - + - + - ");
      System.out.println(Board[6] + " | " + Board[7] + " | " + Board[8]);
      System.out.println(" - + - + - ");

    }
}
