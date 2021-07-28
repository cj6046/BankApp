import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

import jdk.tools.jlink.internal.SymLinkResourcePoolEntry;

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
        System.out.print("What is the name on the account?\n");
        String name = in.next();
        Account userAccount = new Account(name, 0.0);

        boolean done = false;
        while(!done) //Program exit condition
        {
            int choice = getChoice(in);
            if(choice == 4)
            {
                System.out.println("Goodbye!");
                done = true;
            }
            else if(choice == 1)
            {
                //Check balance
                System.out.println("Check balance selected.");
            }
            else if(choice == 2)
            {
                //Deposit
                System.out.println("Deposit selected.");
            }
            else if(choice == 3)
            {
                //Withdraw
                System.out.println("Withdraw selected.");
            }
        }

        in.close();
    }

    /**
     * This method prints the main menu 
     * and asks for user choice
     * and does input validation (not yet implemented)
     * @param in The Scanner object we are working with
     * @return The validated int of the user choice
     */
    public static int getChoice(Scanner in)
    {
        //Prints menu
        System.out.println();
        System.out.print(
            "What would you like to do?\n" + 
            "1: Check balance.\n" + 
            "2: Deposit\n" + 
            "3: Withdraw\n" + 
            "4: Exit program\n\n"
            );

        //Input validation for choice
        int userChoice = in.nextInt();

        return userChoice;
    }
}
