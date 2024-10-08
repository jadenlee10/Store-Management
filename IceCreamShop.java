public class IceCreamShop {
  //instance variables in the superclass
  private String flavorName;    
  private double price;
  private boolean isSour;
  
// sets the initial values for the variables
  public IceCreamShop() {
    flavorName = "None";
    price = 0.0;
    isSour = false;
  }

// parameterized constructor
  public IceCreamShop(String flavorName, double price, boolean isSour) {
    this.flavorName = flavorName;
    this.price = price;
    this.isSour = isSour;
  }

//access modifier that returns the variables.
  public String getFlavor() {
    return flavorName;
  }

  public double getPrice() {
    return price;
  }

  public boolean getIsSour() {
    return isSour;
  }

  //mutator method that sets the values of the instance variables
  public void setFlavor(String newFlavorName) {
    flavorName = newFlavorName;
  }

  public void setPrice(double newPrice) {
    if (newPrice < 0) {
      price = 0;
    }
    else {
      price = newPrice;
    }
  }
  public void setIsSour(boolean newIsSour) {
    isSour = newIsSour;
  }

  /*  
  The toString method that will be used in other subclasses by 
  using super method.
  */
  public String toString(){
    return "Flavor: " +flavorName + "\nPrice: " + price + "\nIs This Ice Cream Sour: " + isSour;
  }
}
  