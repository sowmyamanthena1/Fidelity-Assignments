package com.Assement;
import java.util.Scanner;

public class InsuranceCalculation{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insurance Number: ");
        String insuranceNo = scanner.nextLine();

        System.out.print("Insurance Name: ");
        String insuranceName = scanner.nextLine();

        System.out.print("Amount Covered: ");
        double amountCovered = scanner.nextDouble();

        System.out.println("Select:");
        System.out.println("1. Life Insurance");
        System.out.println("2. Motor Insurance");
        int option = scanner.nextInt();


        if (option == 1) {
            LifeInsurance lifeInsurance = new LifeInsurance();
            lifeInsurance.setInsuranceNo(insuranceNo);
            lifeInsurance.setInsuranceName(insuranceName);
            lifeInsurance.setAmountCovered(amountCovered);


            System.out.print("Policy Term: ");
            int policyTerm = scanner.nextInt();
            lifeInsurance.setPolicyTerm(policyTerm);

            System.out.print("Benefit Percent: ");
            float benefitPercent = scanner.nextFloat();
            lifeInsurance.setBenefitPercent(benefitPercent);
            double premium = addPolicy(lifeInsurance, option);
            System.out.println("Calculated Premium: " + premium);
        } else if (option == 2) {
            MotorInsurance motorInsurance = new MotorInsurance();
            motorInsurance.setInsuranceNo(insuranceNo);
            motorInsurance.setInsuranceName(insuranceName);
            motorInsurance.setAmountCovered(amountCovered);

            System.out.print("Depreciation Percent: ");
            float depPercent = scanner.nextFloat();
            motorInsurance.setDepPercent(depPercent);

            double premium = addPolicy(motorInsurance, option);
            System.out.println("Calculated Premium: " + premium);
        } else {
            System.out.println("Invalid option selected.");
        }

        scanner.close();
    }

    public static double addPolicy(Insurance ins, int opt) {
        if (opt == 1) {
            return ((LifeInsurance) ins).calculatePremium();
        } else {
            return ((MotorInsurance) ins).calculatePremium();
        }
    }
}

