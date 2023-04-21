class FlipCartTest
{
public  static void main(String flipCart[])
{
System.out.println("search method started");
String  productName = "watch";
 double  price = FlipCart.searchItem(productName);
 System.out.println(" the price of " + productName + " is " +price);
System.out.println("search method ended");
}
}