package main;

import java.util.InputMismatchException;

public class Main {

    public static void osz() {

        try {
            double result = 13 / 0;
        }
        catch (Exception exception) {
            System.out.println("Tényleg nullával akarsz osztani?");
        }

    }

    public static void main(String[] args) {
	// write your code here

        osz();
        // ArithmeticExceptiont fogunk kapni.
        //5. feladat throw ->> helyet throws kell a paraméter után.
        //6. Nem jó exceptiont próbálunk elkapni ezért hiba lesz, esetleg a szülő Exceptionnel is catchet kellett volna és akkor mindenkiéppen kivédjük a hibát.

        Game game = new Game();

        try {
            boolean userWin = game.play();

            System.out.println("User win tha game? " + userWin);
        }

        catch (InputMismatchException e)
        {
            System.out.println("User did not enter a Number!");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Exception catched!");
        }

        finally {
            System.out.println("FINALLY: Program finished!");
        }


        System.out.println("Main method finished: Bye Bye!!");

    }
}
