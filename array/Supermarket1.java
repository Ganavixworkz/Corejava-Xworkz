class SuperMarket1
{
static  String[]  groceries={"ghee","rice flour","oil","colgate","tea powder","tide","pasta","butter","cheese","honey","stock cubes","sugar","vinegar","oats","vegetables","fruits","cumin"};
public static  void  main(String  shows[])
{
	
	System.out.println("main started");
getgroceries();
System.out.println("main ended");
}
public static void getgroceries()
{
System.out.println("calling getpubs method");
System.out.println("groceries:");
for(int  i=0;i<groceries.length;i++)
{
System.out.println(groceries[i]);
}
System.out.println("end of groceries method");
return;
}
}
