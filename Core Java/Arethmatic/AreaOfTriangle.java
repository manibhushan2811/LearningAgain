import java.lang.*;
import java.util.Scanner;

public class AreaOfTriangle {
    
    public static void main(String[] args) {

// Area of Triangle using Base and Height

    //     float base, height,area;
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter Base ");
    //    base = sc.nextFloat();
    //     System.out.println("Enter height ");
    //    height = sc.nextFloat();

    //     area= (base*height)/2;
    //     System.out.println("area: : " +area);

// Area of triangle using 3 sides

            float a,b,c,s,area;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter value of a b c :");
            a=sc.nextFloat();
            b=sc.nextFloat();
            c=sc.nextFloat();

            s=(a+b+c)/2;
            area=(float) Math.sqrt((s*(s-a)*(s-b)*(s-c)));
            System.out.println("Area of Triangle : "+area);




    }
}
