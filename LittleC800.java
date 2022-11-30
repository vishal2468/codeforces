import java.util.Scanner;

public class LittleC800 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int val=sc.nextInt();
        if(val%3==0){
            System.out.println("1 "+"1 "+(val-2));
        }
        else if(val%2==1){
            System.out.println("1 "+"2 "+(val-3));
        }
        else{
            System.out.println("1 "+"2 "+(val-3));
        }
    }
}
//  good solved under 5 mins
// solution was also nice
