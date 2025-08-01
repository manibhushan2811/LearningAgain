
import java.lang.*;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        int value=1;
        for(int i=1; i<=n; i++){

                value*=i;
        }
        System.out.println(value);
    }
    
}
