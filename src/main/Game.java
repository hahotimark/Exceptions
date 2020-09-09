package main;

import java.util.InputMismatchException;
import java.lang.IllegalArgumentException;
import java.util.Random;
import java.util.Scanner;

public class Game {

    public boolean play() throws Exception // nem ír hibát ezek szerint ez a típusú hiba nem érinti
    {
        boolean win = false;


        /** Random value between 1 and 6 */
        int machineNumb = ((new Random()).nextInt(6) + 1);


        /** Read User number */
        Scanner in = new Scanner(System.in);
        System.out.print("Please add a number between 1 and 6: ");
        int userNumb = in.nextInt(); // can throw InputMismatchException
        in.close();



        /** User number Range check */
        if((userNumb < 1) || (userNumb > 6))
        {
            throw new Exception("User gave invalid number!");
        }


        /** Check winner */
        System.out.println("Machine number: " + machineNumb + ", User number: " + userNumb);
        if(userNumb == machineNumb)
        {
            /** WIN */
            win = true;
        }
        else
        {
            /** LOOSE */
            win = false;
        }


        return win;
    }

}
