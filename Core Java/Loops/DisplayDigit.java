import java.lang.*;;

public class DisplayDigit {
    public static void main(String[] args) {
        int n=1098;
        int digit =0;
        while (n>=1) {
            int rem= n%10;
            digit++;
            System.out.println("Digit : "+rem);
            n=n/10;
            
        }
        System.out.println("Total Digit : " + digit);
    }
    
}
