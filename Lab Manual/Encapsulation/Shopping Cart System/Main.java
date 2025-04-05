import java.util.Scanner;
class Cart {
    private String[] items;
    private double[] prices;
    public void setItems(String[] items) { this.items = items; }
    public void setPrices(double[] prices) { this.prices = prices; }
    public double calculateTotal() {
        double total = 0;
        for(double price : prices) total += price;
        return total;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        Cart cart = new Cart();
        System.out.print("Enter number of items: ");
        int n = obj.nextInt();
        String[] items = new String[n];
        double[] prices = new double[n];
        System.out.println("Enter items and prices:");
        for(int i=0;i<n;i++) {
            items[i] = obj.next();
            prices[i] = obj.nextDouble();
        }
        cart.setItems(items);
        cart.setPrices(prices);
        System.out.println("Total cost: " + cart.calculateTotal());
    }
}