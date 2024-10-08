public class Cake extends IceCreamShop {
//instance variables
  private boolean hasFrosting;
  private int numOfLayers;
//no argument constructor
  public Cake() {
    super("None", 0.0, false);
    hasFrosting = false;
    numOfLayers = 0;
  }

//parameterized constructor that gets instance variables from the super class
  public Cake(String flavorName, boolean hasFrosting, int numOfLayers, double price, boolean isSour) {
    super(flavorName, price, isSour);
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

  /* 
  This toString method calls the toString method from the super class and to adds the instance variables from this subclass.
  */
    public String toString() {
    return super.toString() + "\nDoes Your Cake have Frosting: " + hasFrosting + "\nHow Many Layers: " + numOfLayers;
  }
  
}