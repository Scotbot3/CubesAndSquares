/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cubesandsquares;

/**
 *
 * @author ScBro3075
 */
import java.util.Scanner;

public class CubesandSquares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int choice;
        int number;
        int exponent;
        int i;
        int base;
        
        Scanner keyedinput = new Scanner(System.in);
        
        
        do
        {
        System.out.println("Welcome to the ultimate exponent tool!");
        System.out.println("Please pick a choice");
        System.out.println("1: Finds the value of a number square.");
        System.out.println("2: Finds the value of a number cubed.");
        System.out.println("3: Finds the value of a number to any exponent.");
        System.out.println("4: Exit");
        
        choice = keyedinput.nextInt();
        
        if (choice == 1)
        {
            System.out.println("Please Enter the number you want to square.");
            number = keyedinput.nextInt();
            number *= number;
            System.out.println("The answer is " + number);
        }
        
        if (choice == 2)
        {
            System.out.println("Please enter the number you want to cube.");
            number = keyedinput.nextInt();
            number = number * number * number;
            System.out.println("The answetr is " + number);
        }
        
        if (choice == 3)
        {
            System.out.println("Please enter your base.");
            number = keyedinput.nextInt();
            base = number;
            System.out.println("Please enter the exponent");
            exponent = keyedinput.nextInt();
            for (i = 1; i < exponent; i++)
            {
                number *= base;
            }
            System.out.println("The answer is " + number);
        }
        
        if (choice == 4)
        {
            System.out.println("Goodbye!");
        }
        
        }while (choice != 4);
        
        
        
        
        
        
        
    }
    
}
