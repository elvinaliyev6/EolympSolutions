
import java.util.Arrays;
import java.util.Scanner;


public class aa {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int[] arr=new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i]=s.charAt(i);
        }
        Arrays.sort(arr);
       
        for (int i = 0; i < arr.length; i++) {
            char c=(char) arr[i];
            System.out.print(c);
            
        }
    }
  
}
