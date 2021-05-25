package com.qa.scannerproject;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	public static Scanner myCalculation = new Scanner(System.in);
    public static void startCalc() {
    	boolean quit = false;
    	do {
        System.out.println("Please enter A for addition, S for subtraction, M for multiplication, or D for division.");
        String operator = myCalculation.nextLine();
        if(operator == "q") {
        	quit = true;
        	break;
        }
        System.out.println("Great! now choose your first number for calculation: ");
        double numberOne = Double.parseDouble(myCalculation.nextLine());
        System.out.println("Great! now choose your second number for calculation: ");
        double numberTwo = Double.parseDouble(myCalculation.nextLine());
        //System.out.println(numberOne + operator + numberTwo);
        
        switch(operator.toUpperCase()) {
        case "A":
        	System.out.println(numberOne + numberTwo);
        	break;
        case "S":
        	System.out.println(numberOne - numberTwo);
        	break;
        case "D":
        	System.out.println(numberOne / numberTwo);
        	break;
        case "M":
        	System.out.println(numberOne * numberTwo);
        	break;
        default:
        	System.out.println("Error doing calculation, invalid operator");
        	break;
        }
    } while (quit == false);
    }
    
    public static void main( String[] args )
    {	
    	startCalc();
    	myCalculation.close();
    }

}
