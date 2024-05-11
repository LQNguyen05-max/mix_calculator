package com.mycompany.calculator;

/**
 * Le Nguyen
 * 4/2/2024
 * Simple All-in-One Calculator Project display a calculator, even and odd application, shopping discount, and Student Information
 * @author n2swa
 */

import javax.swing.JOptionPane;

public class Calculator {

    public static void main(String[] args) {
        // infinite loop
        while (true) {
            try {
                String initial, arithmetic;
                int choice, choose1;
                
                // Welcome Screen
                JOptionPane.showMessageDialog(null, "Wecome to LeApplication");
                
                // Screen with Options
                initial = JOptionPane.showInputDialog(null , "1. Arithmetic Operation\n2. Even or Odd\n3. Shopping Discount\n4. Student Grading\n5. Exit");
                
                // Taking the Input and Storing the choice
                choice = Integer.parseInt(initial);
                
                switch (choice) {
                    case 1:
                        arithmetic = JOptionPane.showInputDialog(null, "1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
                        choose1 = Integer.parseInt(arithmetic);
                        switch (choose1) {
                            case 1 -> {
                                String addA = JOptionPane.showInputDialog(null, "Input first number");
                                double add1 = Double.parseDouble(addA);
                                String addB = JOptionPane.showInputDialog(null, "Input second number");
                                double add2 = Double.parseDouble(addB);
                                double addSum = add1 + add2;
                                JOptionPane.showMessageDialog(null, "The answer is " + addSum);
                                break;
                        }
                            case 2 -> {
                                String subtractA = JOptionPane.showInputDialog(null, "Input first number");
                                double sub1 = Double.parseDouble(subtractA);
                                System.out.println(sub1);
                                String subtractB = JOptionPane.showInputDialog(null, "Input second number");
                                double sub2 = Double.parseDouble(subtractB);
                                System.out.println(sub2);
                                double subSum = sub1 - sub2;
                                JOptionPane.showMessageDialog(null, "The answer is " + subSum);
                                break;
                        }
                            case 3 -> {
                                String multiplyA = JOptionPane.showInputDialog(null, "Input first number");
                                double multiply1 = Double.parseDouble(multiplyA);
                                String multiplyB = JOptionPane.showInputDialog(null, "Input second number");
                                double multiply2 = Double.parseDouble(multiplyB);
                                double multiSum = multiply1 * multiply2;
                                JOptionPane.showMessageDialog(null, "The answer is " + multiSum);
                                break;
                        }
                            case 4 -> {
                                String divA = JOptionPane.showInputDialog(null, "Input first number");
                                double div1 = Double.parseDouble(divA);
                                String divB = JOptionPane.showInputDialog(null, "Input second number");
                                double div2 = Double.parseDouble(divB);
                                double divSum = div1 / div2;
                                JOptionPane.showMessageDialog(null, "The answer is " + divSum);
                                break;
                            }
                        }
                        break;
                    case 2:
                        String EvenOdd = JOptionPane.showInputDialog(null, "Type a number in to determine whether the number is even or odd:");
                        int check = Integer.parseInt(EvenOdd);
                        
                        // Numbah is Even
                        if (check % 2 == 0) {
                            JOptionPane.showMessageDialog(null, "The number " + check + " is even");
                            
                        }
                        // Numbah is Odd
                        else {
                            JOptionPane.showMessageDialog(null, "The number: " + check + " is odd");
                        }
                        break;
                    
                    // shopping section
                    case 3:
                        String shopping = JOptionPane.showInputDialog(null, "Enter your total amount");
                        double discount = Double.parseDouble(shopping);
                        
                        // Discount Given accordingly
                        if ((discount >= 500) && (discount <= 1000) ){
                            double finalAmount = discount * 5 / 100;
                            double price = discount - finalAmount;
                            JOptionPane.showMessageDialog(null, "You have a 5 % discount");
                            JOptionPane.showMessageDialog(null, "Your total shopping amount is $" + String.format("%.2f",price));
                        }
                        else if ((discount > 1000) && (discount <= 1500) ){
                            double finalAmount = discount * 10 / 100;
                            double price = discount - finalAmount;
                            JOptionPane.showMessageDialog(null, "You have a 10 % discount");
                            JOptionPane.showMessageDialog(null, "Your total shopping amount is $" + String.format("%.2f",price));
                        }
                        else if ((discount > 1500) && (discount < 2000) ){
                            double finalAmount = discount * 15 / 100;
                            double price = discount - finalAmount;
                            JOptionPane.showMessageDialog(null, "You have a 15 % discount");
                            JOptionPane.showMessageDialog(null, "Your total shopping amount is $" + String.format("%.2f",price));
                        }
                        else if (discount >= 2000){
                            double finalAmount = discount * 25 / 100;
                            double price = discount - finalAmount;
                            JOptionPane.showMessageDialog(null, "You have a 25 % discount");
                            JOptionPane.showMessageDialog(null, "Your total shopping amount is $" + String.format("%.2f",price));
                        }
                        else if (discount >= 0) {
                            JOptionPane.showMessageDialog(null, "You have a 0 % discount");
                            JOptionPane.showMessageDialog(null, "Your total shopping amount is $" + String.format("%.2f",discount));
                        }
                        else {
                            JOptionPane.showMessageDialog(null, "Value cannot be negative");
                        }
                        break;
                    
                        // Student Analysis 
                    case 4:
                        // receive name, age
                        String name = JOptionPane.showInputDialog(null, "Enter your name:");
                        String age = JOptionPane.showInputDialog(null, "Enter your age");
                        
                        int studentAge = Integer.parseInt(age);
                        if (studentAge >= 0) {
                            JOptionPane.showMessageDialog(null, "The student's name is " + name + " and their age is " + studentAge + " years old");
                        }
                        else {
                            JOptionPane.showMessageDialog(null, "Age cannot be a negative number");
                        }
                        break;                        
                    case 5:
                        JOptionPane.showMessageDialog(null, "Thank you for using LeApplication");
                        System.exit(0);
                        break;
                }
            }
            // Exception
            catch(NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Input error occured", "Error", JOptionPane.ERROR_MESSAGE);
                break;
            }
            // end the while loop
            break;
        }
    }
}
