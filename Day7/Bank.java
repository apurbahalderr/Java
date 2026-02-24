package seventh_class;

public class Bank {

    String bankName = "State Bank"; 
    static String branch = "Main Branch";  

    static class InterestCalculator {

        static double calculateSimpleInterest(double principal, double rate, double time) {
            return (principal * rate * time) / 100;
        }

        void showDetails() {

            // System.out.println(bankName);   // here we cannot access non-static members of the outer class without creating an instance of the outer class

            System.out.println("Branch: " + branch);
            Bank b = new Bank();
            System.out.println("Bank Name: " + b.bankName);
        }
    }

    public static void main(String[] args) {

        double si = InterestCalculator.calculateSimpleInterest(10000, 5, 2);
        System.out.println("Simple Interest: " + si);

        InterestCalculator ic = new InterestCalculator();
        ic.showDetails();
    }
}