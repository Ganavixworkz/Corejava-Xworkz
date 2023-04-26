class FlipCart2Test
{
public  static void main(String flipCart1[])
{
System.out.println("search method started");
String  productName = "watch";
 double  priceOfItem = FlipCart2.searchItem(productName);
 double  priceWithQuantity = FlipCart2.searchItem(productName  ,2);
 System.out.println(" the price of " + productName + " is " +priceOfItem);
 System.out.println(" the price of " + productName + " with quantity  is " +priceWithQuantity);
System.out.println("search method ended");
}
}