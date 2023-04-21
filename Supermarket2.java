class SuperMarket2
{
static  String[]  chocolate={"snikers","dairy milk","munch","perk","kitkat","milky bar","fivestar","dark chocolate","temtaation","melody","mango","happident","coffee","kinderjoy"};
public static  void  main(String  market[])
{
	System.out.println("main started");
getchocholate();
System.out.println("main ended");
}
public static void getchocholate()
{
System.out.println("calling getchocholate method");
System.out.println("chocolates available:");
for(int  i=0;i<chocolate.length;i++)
{
System.out.println(chocolate[i]);
}
System.out.println("end of chocolate method");
return;
}
}