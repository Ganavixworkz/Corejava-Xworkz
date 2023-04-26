class Swiggy2Test
{
public  static void main(String swiggy[])
{
System.out.println("search method started");
String  itemName = "vada pav";
double  priceOfItem = Swiggy2.searchItem(itemName);
 double  priceWithQuantity = Swiggy2.searchItem(itemName  , 5);
 System.out.println(" the price of " + itemName + " is " +priceOfItem);
 System.out.println(" the price of " + itemName + " with quantity is " +priceWithQuantity);
System.out.println("search method ended");
}
}
