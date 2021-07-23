import java.util.Scanner;

/**
 * This is the driver class that will control all Account functions
 * 
 * @author Christopher Jones
 * @version 18 July 2021
 */
public class Bank 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("What is the name on the account?");
        String name = in.next();
        Account userAccount = new Account(name, 0.0);

        System.out.println(userAccount.toString());

        in.close();
    }
}
