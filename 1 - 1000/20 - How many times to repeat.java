
import java.util.Scanner;

public class Main {
    private static int sumOfNumbers(int x)
        {
            int cem = 0;
            while (x > 0)
            {
                cem = cem + x%10;
                x = x/10;
            }
            return cem;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int sum=0;
        while (n > 0) {
          n=n-sumOfNumbers(n);
          count++;
        }
        System.out.println(count);
    }
    
     
}
