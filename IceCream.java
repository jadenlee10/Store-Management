public class IceCream extends IceCreamShop {
  private boolean hasCone;
  private boolean hasBowl;

  /*
  No argument constructor that sets the initial values 
  of the boolean, hasCone and hasBowl
  */
  public IceCream () {
    hasCone = false;
    hasBowl = false;
  }
  /*
  This parameterized constructor calls the superclass where flavorname and price lies
  and also uses this to set values for has cone and has bowl.
  */
  public IceCream(String flavorName, boolean hasCone, boolean hasBowl, double price) {
    super(flavorName, price);
    this.hasCone = hasCone;
    this.hasBowl = hasBowl;
  }
  /* 
  These methods both return the values for hasCone and
  hasBowl.
  */
  public boolean setHasCone(){
    return hasCone;
  }
  public boolean setHasBowl(){
    return hasBowl;
  }

  /* 
  This is a toString method that helps resolve the issue of it not working correctly into the console.
  */
  public String toString(){
    return "Flavor of Ice Cream: " + flavorName + "\nDoes Your Ice Cream have a Cone: "+hasCone+"\nDoes your Ice Cream have a Bowl: "+hasBowl+ "\nThe Price of Your Ice Cream: "+ price +"$"+"\n- - - - - - - - - - - - - - - - - - -";
  }

}







