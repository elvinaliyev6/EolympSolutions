
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong(),result;
        if(n<0) n*=-1;
        if(n==0) result=0;
        else{
            result=1;
        }
         while(n>0){
             if(n%2==0) result*=(n%10);
             n/=10;
         }
         if(result==1)
             result=-1;
         
         System.out.println(result);
    }

}
