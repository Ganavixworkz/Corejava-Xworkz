class FlipCart1Test
{
public  static void main(String flipCart1[])
{
System.out.println("search method started");
String  productName = "watch";
 double  price = FlipCart1.searchItem(productName);
 System.out.println(" the price of " + productName + " is " +price);
System.out.println("search method ended");
}
}