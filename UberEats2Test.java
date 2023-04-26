 class UberEats2Test
{
public  static void main(String uberEats[])
{
System.out.println("search method started");
String  itemName = "veg momos";
 double  priceOfItem = UberEats2.searchItem(itemName);
 double  priceWithQuantity= UberEats2.searchItem(itemName , 3);
 System.out.println(" the price of " + itemName + " is " +priceOfItem);
  System.out.println(" the price of " + itemName + " with quantity is " +priceWithQuantity);
System.out.println("search method ended");
}
}
