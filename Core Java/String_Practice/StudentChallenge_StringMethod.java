import java.lang.*;
import java.util.Scanner;

public class StudentChallenge_StringMethod {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter Gmail : ");
        String gmailId= sc.next();
        System.out.println(gmailId);
        System.out.println(gmailId.matches(".*@gmail.*"));

        int ind=gmailId.indexOf("@");
        int end= gmailId.indexOf(".");
        int l= gmailId.length();
        String userName= gmailId.substring(0,ind);
        System.out.println("Username : "+userName);

        String domain= gmailId.substring(ind+1,end);
        System.out.println("domain : "+domain);




    }
    
}
