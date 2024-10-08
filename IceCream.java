public class IceCream extends IceCreamShop {
  private boolean hasCone;
  private boolean hasBowl;

  /*
  No argument constructor that sets the initial values 
  of the boolean, hasCone and hasBowl
  */
  public IceCream () {
    super("None", 0.0, false);
    hasCone = false;
    hasBowl = false;
  }
  /*
  This parameterized constructor calls the superclass where flavorname and price lies
  and also uses this to set values for has cone and has bowl.
  */
  public IceCream(String flavorName, boolean hasCone, boolean hasBowl, double price, boolean isSour) {
    super(flavorName, price, isSour);
    this.hasCone = hasCone;
    this.hasBowl = hasBowl;
  }
  /* 
  These methods both return the values for hasCone and
  hasBowl.
  */
  public boolean getHasCone(){
    return hasCone;
  }
  public boolean getHasBowl(){
    return hasBowl;
  }

  /* 
  This toString method calls the toString method from the super class and to adds the instance variables from this subclass.
  */
  public String toString(){
    return super.toString()+ "\nDoes Your Ice Cream have a Cone: "+hasCone+"\nDoes your Ice Cream have a Bowl: "+hasBowl+ "\n- - - - - - - - - - - - - - - - - - -";
  }

}







