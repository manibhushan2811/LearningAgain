import java.lang.*;
import java.util.Scanner;

public class RootsOfQuadraticEquation {
    public static void main(String[] args) {
        double a,b,c,d,x,y;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter value of a,b,c");
        a= sc.nextDouble();
        b= sc.nextDouble();
        c= sc.nextDouble();

        d= ((b*b)-(4*a*c));
        
        if(d>0){
            x=(-b+Math.sqrt(d))/((2*a));
            y=(-b-Math.sqrt(d))/(2*a);
            System.out.println("Roots are : "+x+ " and "+y);
            
        }
         if(d==0){
            x= (-b+Math.sqrt(d))/(2*a);
            y=x;
            System.out.println("Roots are : "+x+ " and "+y);
            
            
        }
         if(d<0){
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-d) / (2 * a);
            System.out.println("Roots are complex and imaginary: ");
            System.out.println(realPart + " + " + imaginaryPart + "i");
            System.out.println(realPart + " - " + imaginaryPart + "i");
            
            
        }
    }
}
