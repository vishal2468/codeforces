import java.util.Scanner;

public class Chess800 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            char board[][]=new char[8][8];
            for(int j=0;j<8;j++){
                board[j]=sc.next().toCharArray();
            }
            for(int j=1;j<7;j++){
                for(int k=1;k<7;k++){
                    if(board[j-1][k-1]=='#'&&board[j-1][k+1]=='#'&& board[j+1][k-1]=='#'&&board[j-1][k-1]=='#'&&board[j][k]=='#')
                    System.out.println(j+1+" "+(k+1));
                }
            }
        }
    }
}

// 13 mins to code up the solution  very poor