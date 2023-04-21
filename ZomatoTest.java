class ZomatoTest
{
public  static void main(String zomato[])
{
System.out.println("search method started");
String  itemName = "gobi";
 double  price = Zomato.searchItem(itemName);
 System.out.println(" the price of " + itemName + " is " +price);
System.out.println("search method ended");
}
}
