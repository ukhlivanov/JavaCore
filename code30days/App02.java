package code30days;


import java.util.Scanner;

public class App02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();

        // Write your calculation code here.
        double a =  mealCost*tipPercent/100;
        double b = mealCost*taxPercent/100;

        mealCost = mealCost + a + b;
//        double tipPercentDol= tipPercent/100 * mealCost;
//        double taxPercentDol = taxPercent/100 * mealCost;

        // cast the result of the rounding operation to an int and save it as totalCost
        int totalCost = (int) Math.round(mealCost);

        // Print your result
        System.out.println("The total meal cost is " + totalCost + " dollars.");
    }

}
