import java.util.Scanner;

public class IceCreamShopRunner {
  public static void main(String[] args) {

    IceCream flavor = new IceCream("Chocolate", true, false, 9.99, false);
    System.out.println(flavor);
    Cake taste = new Cake("Strawberry",true,1,10.00, true);
    System.out.println(taste);

    
  }
}