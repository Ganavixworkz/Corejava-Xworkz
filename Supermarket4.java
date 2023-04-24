class SuperMarket4
{
static  String[]  perfume={"engage","the men","ks","dior","bvlgari","burberry","armai","lancome","hugo boss","juicy couture","jimmy choo plc","gucci","nina ricci","estee lauder"};
public static  void  main(String  market[])
{
	System.out.println("main started");
getperfume();
System.out.println("main ended");
}
public static void getperfume()
{
System.out.println("calling getperfume method");
System.out.println("perfumes available:");
for(int  i=0;i<perfume.length;i++)
{
System.out.println(perfume[i]);
}
System.out.println("end of perfume method");
return;
}
}