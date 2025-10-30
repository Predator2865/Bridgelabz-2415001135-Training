public class ShoppingCart {
    public static void main(String[] args) {
        
        String[] itemPrices = {"250", "499", "99", "abc", "150"};
        
        int totalPrice = 0;

        for (String price : itemPrices) {
            try {
                
                int value = Integer.parseInt(price);
                totalPrice += value;
            } 
            catch (NumberFormatException e) {
                
                System.out.println("Invalid price detected: " + price + " (skipped)");
            }
        }

        // Display total price
        System.out.println("\nTotal Price of Valid Items = ₹" + totalPrice);
    }
}
