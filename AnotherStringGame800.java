import java.util.Scanner;

public class AnotherStringGame800 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            String s=sc.next();
            char c[]=s.toCharArray();
            for(int j=0;j<s.length();j++){
                if(j%2==0){
                    if(c[j]=='a'){
                        c[j]='b';
                    }
                    else{
                        c[j]='a';
                    }
                }
                else{
                    if(c[j]=='z'){
                        c[j]='y';
                    }
                    else
                    c[j]='z';
                }
            }
            System.out.println(String.valueOf(c));
        }
    }
}
//  7 minutes after reading the code and thinking about the solution
// thinking about the solution also took some time
