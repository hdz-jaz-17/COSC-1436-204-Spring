// This program calculates and displays a personal budget based on constants and variables.

public class BudgetCalculator {
    public static void main(String[] args) {
        
        final double SALARY = 3000.0;
        final double SAVINGS_PERCENT = 0.20; // 20%
        final double RENT_PERCENT = 0.30;   // 30%
        final double GROCERIES_PERCENT = 0.15; // 15%
        final double ENTERTAINMENT_PERCENT = 0.10; // 10%

        double monthlySalary = SALARY;
        double savedAmount = monthlySalary * SAVINGS_PERCENT;
        double rentAmount = monthlySalary * RENT_PERCENT;
        double groceriesAmount = monthlySalary * GROCERIES_PERCENT;
        double entertainmentAmount = monthlySalary * ENTERTAINMENT_PERCENT;
        double totalExpenses = rentAmount + groceriesAmount + entertainmentAmount;
        double remainingBalance = monthlySalary - totalExpenses;

        System.out.println("Monthly Salary: $" + monthlySalary);
        System.out.println("Amount Saved: $" + savedAmount);
        System.out.println("Amount Spent on Rent: $" + rentAmount);
        System.out.println("Amount Spent on Groceries: $" + groceriesAmount);
        System.out.println("Amount Spent on Entertainment: $" + entertainmentAmount);
        System.out.println("Total Expenses: $" + totalExpenses);
        System.out.println("Remaining Balance: $" + remainingBalance);
    }
}
