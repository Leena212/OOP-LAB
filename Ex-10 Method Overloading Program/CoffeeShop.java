//Q.Coffee Order System
import java.util.Scanner;
class CoffeeOrder {
    Scanner obj=new Scanner(System.in);
    void prepareCoffee() {
        System.out.println("Preparing regular coffee");
    }
    void prepareCoffee(String type) {
        System.out.print("Enter coffee type: ");
        type=obj.nextLine();
        System.out.println("Preparing "+type+" coffee");
    }
    void prepareCoffee(String type,int sugars) {
        System.out.print("Enter coffee type: ");
        type=obj.nextLine();
        System.out.print("Enter sugar amount: ");
        sugars=obj.nextInt();
        System.out.println("Preparing "+type+" coffee with "+sugars+" sugars");
    }
}
public class CoffeeShop {
    public static void main(String[] args) {
        CoffeeOrder order=new CoffeeOrder();
        order.prepareCoffee();
        order.prepareCoffee("");
        order.obj.nextLine(); // Clear buffer
        order.prepareCoffee("",0);
    }
}