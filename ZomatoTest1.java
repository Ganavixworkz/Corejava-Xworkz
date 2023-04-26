class ZomatoTest1
{
public  static void main(String zomato[])
{
System.out.println("search method started");
String  itemName="pav baji";
 double  priceForSingle = Zomato1.searchItem(itemName);
 double  priceWithQuantity = Zomato1.searchItem(itemName , 5);
 System.out.println(" the price of " + itemName + " is " +priceForSingle);
 System.out.println(" the price of " + itemName + " is " +priceWithQuantity);
System.out.println("search method ended");
}
}