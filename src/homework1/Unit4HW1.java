package homework1;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
public class Unit4HW1 {

    public static void main(String[] args) {
        guessingGame();
        tiredTurtle();
        notATamagotchi();
        int bob = 5;
        System.out.println(bob);
        bob = 8;


    }

    /**
     * Picks a random number between 1 and 100 and asks the user
     * to guess it. For each guess, the program should tell the user whether
     * the guess is too high, too low, or correct.
     *
     */
    public static void guessingGame(){
        //feel free to use the Random class
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int randInt = rand.nextInt(0,101);
        int guess=0;
        int tries =0;
        System.out.println(randInt);
        while(randInt!=guess) {
            System.out.print("Guess the number: ");
            guess = scan.nextInt();
            if(randInt<guess) {
                System.out.println("Too high! Try again.");
            } else if(randInt>guess) {
                System.out.println("Too low! Try again.");
            }
            tries++;
        }
        System.out.println("Congrats! It took you "+tries+" tries.");

    }

    /**
     * Tired Turtle
     * Asks the user how many steps they want the turtle to take in its
     * first move. Then it calculates and displays how many total steps
     * the turtle took until it stopped.
     *
     */
    public static void tiredTurtle(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Initial Turtle Steps: ");
        int steps = scan.nextInt();
        int count = 0;
        while(steps>0){
            steps/=2;
            count++;
            System.out.print(steps+" ");
        }
        System.out.println("\nTotal Steps: "+count);

    }



    /**
     * Write your own description
     */
    public static void notATamagotchi(){
        int hunger = 100;
        Scanner scan = new Scanner(System.in);
        int hours = 0;
        boolean happy = true;
        boolean fed = false;
        while(true){
            hours++;

            System.out.print("Hour "+hours+", Hunger Level: "+(hunger)+". Do you want to feed your tamagotchi? (Y / N)\n");
            String answer = scan.nextLine();
            if(answer.compareToIgnoreCase("N")==0) {
                fed = false;
            } else if(answer.compareToIgnoreCase("Y")==0) {
                fed = true;
                if(hunger>=75){
                    hunger+=(110-hunger);
                } else {
                    hunger+=25;
                }
            }
            if(hunger<=40) {
                System.out.println("Your pet is unhappy.");
                happy = false;
            } else if (hunger>40){
                happy = true;
            }
            hunger-=10;
            if(happy==false&&fed==false||hours>=10){
                System.out.print("Simulation Over -");
                if(happy==false&&fed==false){
                    System.out.println(" Why didn't you feed your tamagotchi?");
                } else{
                    System.out.println("Time is Up!");
                }
                break;
            }
        }
    }

}
