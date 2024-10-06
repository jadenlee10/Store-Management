public class IceCreamShop {
  
  public String flavorName;    
  public double price;

  public IceCreamShop() {
    this("plain", 0.0);
  }


  public IceCreamShop(String flavorName, double price) {
    this.flavorName = flavorName;
    this.price = price;
  }


  public String getFlavor() {
    return flavorName;
  }

  public double getPrice() {
    return price;
  }

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

  public String toString(){
    return "Flavor: " +flavorName + "\nPrice: " + price;
  }
}
  