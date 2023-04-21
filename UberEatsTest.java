class UberEatsTest
{
public  static void main(String uberEats[])
{
System.out.println("search method started");
String  itemName = "veg momos";
 double  price = UberEats.searchItem(itemName);
 System.out.println(" the price of " + itemName + " is " +price);
System.out.println("search method ended");
}
}
