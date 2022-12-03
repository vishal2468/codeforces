import java.util.Scanner;

public class ABCString900 {
    public static boolean isValid(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') count++;
            else count--;
            if(count<0) return false;
        }
        if(count==0) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            String s=sc.next();
            if(isValid(s.replace('A','(').replace('B','(').replace('C', '('))){
                System.out.println("YES");
            }
            else if(isValid(s.replace('A','(').replace('B','(').replace('C', ')'))){
                System.out.println("YES");
            }
            else if(isValid(s.replace('A','(').replace('B',')').replace('C', '('))){
                System.out.println("YES");
            }
            else if(isValid(s.replace('A','(').replace('B',')').replace('C', ')'))){
                System.out.println("YES");
            }
            else if(isValid(s.replace('A',')').replace('B','(').replace('C', '('))){
                System.out.println("YES");
            }
            else if(isValid(s.replace('A',')').replace('B','(').replace('C', ')'))){
                System.out.println("YES");
            }
            else if(isValid(s.replace('A',')').replace('B',')').replace('C', '('))){
                System.out.println("YES");
            }
            else if(isValid(s.replace('A',')').replace('B',')').replace('C', ')'))){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
// WAS ABLE TO SOLVE QUITE FAST BUT WROTE b instead of B and therefore there as error
// it took time to identify as i am not seeing the test cases.
