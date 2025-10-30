public class BankTransaction {

    
    public static double getRemainingLimit(Double dailyLimit, double amountWithdrawn) {
        
        if (dailyLimit == null) {
            System.out.println("No daily limit set. Returning 0.0");
            return 0.0;
        }

        double remaining = dailyLimit - amountWithdrawn;

    
        if (remaining < 0)
            remaining = 0.0;

        return remaining;
    }

    public static void main(String[] args) {
        Double limit1 = 10000.0;   
        double limit2 = 5000.0;    
        Double limit3 = null;      

        System.out.println("Remaining limit (Account 1): ₹" + getRemainingLimit(limit1, 2500.0));
        System.out.println("Remaining limit (Account 2): ₹" + getRemainingLimit(limit2, 4000.0));
        System.out.println("Remaining limit (Account 3): ₹" + getRemainingLimit(limit3, 1000.0));
    }
}
