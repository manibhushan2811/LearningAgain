import java.lang.*;

public class Variable {
    public static void main(String[] args) {
        byte b=6;
        System.out.println("Value of b : " + b);
        Long i=5L;
        System.out.println("Value of i : "+i);
        int i1=55_22;
        System.out.println("Value of i1 : "+i1);

        byte b1=10;
        byte b2=0b1010;
        byte b3= 012;
        byte b4=0xA;

        System.out.println("b1 : "+b1 + " b2 : " + b2 + " b3 : " + b3 + " b4 : "+b4) ;


        int x1=5;
        System.out.println(Integer.toBinaryString(x1));

        int x=-5;
        System.out.println(Integer.toBinaryString(x));

    }
    
}
