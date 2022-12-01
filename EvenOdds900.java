import java.util.Scanner;

public class EvenOdds900 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long k=sc.nextLong();
        long ans=0;
        if(k<=(n+1)/2){
            System.out.println(((k-1)*2)+1);
        }
        else{
            System.out.println((k-((n+1)/2))*2);
        }
    }
}
// took more than 15 mins 
// interpreted the problem wrong and also took time to formulate the solution