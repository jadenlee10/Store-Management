
public class Cake extends IceCreamShop {
//instance variables
  private boolean hasFrosting;
  private int numOfLayers;
//no argument constructor
  public Cake() {
    hasFrosting = false;
    numOfLayers = 0;
  }

//parameterized constructor that gets instance variables from the super class
  public Cake(String flavorName, boolean hasFrosting, int numOfLayers, double price) {
    super(flavorName, price);
    this.hasFrosting = hasFrosting;
    this.numOfLayers = numOfLayers;
  }


  //these return all of the variables in this class
  public boolean getHasFrosting() {
    return hasFrosting;
  }
  public int getNumOfLayers() {
    return numOfLayers;
  }
  
    public String toString() {
    return "Your Type of Cake: " + flavorName + "\nDoes Your Cake have Frosting: " + hasFrosting + "\nHow Many Layers: " + numOfLayers + "\nPrice of Your Cake: " + price + "$";
  }
  
}
  