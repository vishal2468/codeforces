import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeletionOfAdjacentAlpha800 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int t=scanner.nextInt();
        List<String> list=new ArrayList<>();
        for(int i=0;i<t;i++){
            String s=scanner.next();
            char c=scanner.next().charAt(0);
            int flag=0;
            for(int j =0;j<s.length();j++){
                if(s.charAt(j)==c&&(s.length()-j)%2==1){
                    flag=1;
                    break;
                }
            }
            if(flag==1) 
                list.add("YES"); 
            else 
                list.add("NO");
        }
        for(String s:list)
        System.out.println(s);
    }
}
