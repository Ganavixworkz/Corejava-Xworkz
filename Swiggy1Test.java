class Swiggy1Test
{
public  static void main(String swiggy[])
{
System.out.println("search method started");
String  itemName = "vada pav";
 double  price = Swiggy1.searchItem(itemName);
 System.out.println(" the price of " + itemName + " is " +price);
System.out.println("search method ended");
}
}
