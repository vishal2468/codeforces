import java.util.Scanner;

public class SummerCamp800 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str="";
        int i=1;
        while(true){
            str=str+Integer.toString(i);
            if(str.length()>=n){
                System.out.println(str.charAt(n-1));
                break;
            }
            i++;
        }
    }
}
// very poor performance took more than 20 mins.
// took the long way to solve the problem and was unable to coke it work.
