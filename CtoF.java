package com.company;

import java.util.Scanner;

public class CtoF
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double fahrenheit = 0;
        double celsius = 0;
        boolean correct = false;
        String trash = "";
        do{
            System.out.print("What is the temperature in Celsius? ");

            if(in.hasNextDouble())
            {
                correct = true;
                celsius = in.nextInt();
                fahrenheit = ((celsius * 9 / 5) + 32);
                System.out.println("The temperature in fahrenheit is: " + fahrenheit);
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You have entered an incorrect input: " + trash);
                System.out.println("Please restart the program and respond with the the right input.");
            }
        }while(!correct);
    }

}
