
import java.lang.*;

public class Swapping {
    public static void main(String[] args) {
        int a=10,b=12;
        a= a^b;
        b=a^b;
        a=a^b;
        System.out.println(a + " " +b);
    }
    
}
