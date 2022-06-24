import java.util.Scanner;
//scanner
/**
 * Created by iyasuwatts on 10/17/17.
 */

public class Main {

    public static void main(String[] args ){
        Scanner myName = new Scanner(System.in); //creates scanner object
        System.out.println("Enter name");

        String userName = myName.nextLine(); //reads user input
        System.out.println("My name is " + userName); //outputs user input

        if (userName.equals("Alice") || userName.equals("Bob")) {
            System.out.println("Greetings " + userName + "!");
        }
        else {
            System.out.println("");
        }
    }
}
