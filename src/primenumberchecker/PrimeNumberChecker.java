/*
 *      Author:     Will Pringle
 *      Date:       01/10/2017
 *      Purpose:    Determine if a number is prime or not prime
 */
package primenumberchecker;

//import java.util.Scanner
import java.util.Scanner;

/**
 * Class for PrimeNumberChecker
 * @author Will Pringle
 */
public class PrimeNumberChecker {

    /**
     * main method for program
     * @param args the command line arguments
     */
    public static void main(String[] args){
        System.out.println("Enter 0 if you wish for the program to end\n");// Tell user they can end the program by entering 0
        int inputNumber = 1;// declare and initialize inputNumber as an int of value 1 (1 is an arbitrary number)
        
        // while loop that runs so long as the userInput isn't 0
        while(inputNumber!=0){ //while inputNumber does not equal 0 the loop will loop
            System.out.println("Enter a prime number to determine if it is prime");//ask user for input
            Scanner sc = new Scanner(System.in); // create Scanner object sc (I don't think creating an object everytime its run is good)
            inputNumber=sc.nextInt(); // take in the next integer
            System.out.println("It is "+isPrime(inputNumber)+" to say "+inputNumber+" is prime"); // call the prime number method and print the result
        }
    }
    
    /**
     * isPrime determines whether or not a number is prime and returns a boolean.
     * @param number
     * @return 
     */
    public static boolean isPrime(int number){
        // for loop that runs through all number below the input number divded by two but above 1
        for(int i=2; i<number/2; i++){
            if(number%i==0){ // if the remainder of the user's input divided by the ith value is 0, the loop will cease
                return false; // return false as a prime number will only have a remainder of 0 if divided by itself or 1
            }
        }
        
        // second return statement if the remainder of number/i is never 0
        return true; // return true after the loop has ceased
    }
}
