package com.Assignment3;

import java.util.Scanner;

public class CalculatorProgramMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalculatorProgram calc = new CalculatorProgram();
        System.out.println("Enter an operator (+,-,*,/): ");
        String operator = sc.nextLine();
        System.out.println("Enter the operands:");
        int operand1 = sc.nextInt();
        int operand2 = sc.nextInt();
        switch (operator) {
            case "+":
                int sum = calc.Addition(operand1, operand2);
                System.out.println("Result of " + operand1 + " + " + operand2 + " is " + sum);
                break;
                case "-":
                    int difference = calc.Subtraction(operand1, operand2);
                    System.out.println("Result of " + operand1 + " - " + operand2 + " is " + difference);
                    break;
                    case "*":
                        int multiplication = calc.Multiplication(operand1, operand2);
                        System.out.println("Result of " + operand1 + " * " + operand2 + " is " + multiplication);
                        break;
                        case "/":
                            if(operand2 == 0){
                                System.out.println("Division by zero is not allowed.");
                            } else {
                                double[] remainder = new double[1];
                                double quotient = calc.Division(operand1,operand2,remainder);
                                System.out.println("Result of " + operand1 + " / " + operand2 + " is " + (int)quotient);
                                System.out.println("Remainder = " + (int)remainder[0]);
                            }
                            break;
                            default:
                                System.out.println("Invalid Operator");
                                break;
        }
        sc.close();
    }
}
