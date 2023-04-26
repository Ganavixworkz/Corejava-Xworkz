class UberEats2
{
public static double searchItem(String itemName)
{
System.out.println("searchItem started");
double price = 0.00;
if("idly" == itemName)
{
System.out.println("thanks for searching" +itemName);
price = 50.00;
}
if("sambar rice" == itemName)
{
System.out.println("thanks for searching" +itemName);
price  = 70.00;
}
if("paneer palav" == itemName)
{
System.out.println("thanks for searching" +itemName);
price = 60.00;
}
if("mashroom palav" == itemName)
{
System.out.println("thanks for searching" +itemName);
price = 100.00;
}
if("chilli gobi" == itemName)
{
System.out.println("thanks for searching" +itemName);
price = 100.00;
}
if("parota" == itemName)
{
System.out.println("thanks for searching" +itemName);
price = 30.00;
}
if("mutton curry" == itemName)
{
System.out.println("thanks for searching" +itemName);
price = 200.00;
}
if("halwa" == itemName)
{
System.out.println("thanks for searching" +itemName);
price = 70.00;
}
if("egg palav" == itemName)
{
System.out.println(" thanks for searching " + itemName);
price = 60.00;
}
if("chicken kabab" == itemName)
{
System.out.println("thanks for searching" +itemName);
price = 100.00;
}
if("bel puri" == itemName)
{
System.out.println("thanks for searching" +itemName);
price = 30.00;
}
if("sandwitch" == itemName)
{
System.out.println("thanks for searching" +itemName);
price = 50.00;
}
if("bajji" == itemName)
{
System.out.println("thanks for searching" +itemName);
price =  60.00;
}
if("vada" == itemName)
{
System.out.println("thanks for searching" +itemName);
price =  30.00;
}
if("ved noodles" == itemName)
{
System.out.println("thanks for searching" +itemName);
price =  45.00;
}
if("veg momos" == itemName)
{
System.out.println("thanks for searching" +itemName);
price =  60.00;
}
{
System.out.println("searchItem ended");
return price;
}
}
public static double searchItem(String itemName , int quantity)
{
System.out.println("searchItem started");
double price = 0.00;
if("idly" == itemName)
{
System.out.println("thanks for searching" +itemName);
price = 50.00  * quantity;
}
if("sambar rice" == itemName)
{
System.out.println("thanks for searching" +itemName);
price  = 70.00  * quantity;
}
if("paneer palav" == itemName)
{
System.out.println("thanks for searching" +itemName);
price = 60.00 * quantity;
}
if("mashroom palav" == itemName)
{
System.out.println("thanks for searching" +itemName);
price = 100.00  * quantity;
}
if("chilli gobi" == itemName)
{
System.out.println("thanks for searching" +itemName);
price = 100.00 * quantity;
}
if("parota" == itemName)
{
System.out.println("thanks for searching" +itemName);
price = 30.00 * quantity;
}
if("mutton curry" == itemName)
{
System.out.println("thanks for searching" +itemName);
price = 200.00 * quantity;
}
if("halwa" == itemName)
{
System.out.println("thanks for searching" +itemName);
price = 70.00  * quantity;
}
if("egg palav" == itemName)
{
System.out.println(" thanks for searching " + itemName);
price = 60.00  * quantity;
}
if("chicken kabab" == itemName)
{
System.out.println("thanks for searching" +itemName);
price = 100.00 * quantity;
}
if("bel puri" == itemName)
{
System.out.println("thanks for searching" +itemName);
price = 30.00  * quantity;
}
if("sandwitch" == itemName)
{
System.out.println("thanks for searching" +itemName);
price = 50.00 * quantity;
}
if("bajji" == itemName)
{
System.out.println("thanks for searching" +itemName);
price =  60.00 * quantity;
}
if("vada" == itemName)
{
System.out.println("thanks for searching" +itemName);
price =  30.00 * quantity;
}
if("ved noodles" == itemName)
{
System.out.println("thanks for searching" +itemName);
price =  45.00 * quantity;
}
if("veg momos" == itemName)
{
System.out.println("thanks for searching" +itemName);
price =  60.00 * quantity;
}
{
System.out.println("searchItem ended");
return price;
}
}
}

