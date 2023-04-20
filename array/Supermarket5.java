class SuperMarket5
{
static  String[]  soaps={"dove","liril","santoor","mysore sandal","lifebuoy","pearls","dettol","lux","cinthol","hamam","medimix","vivel","nivea","aveeno","ivory","irish spring","biotique","patanjali"};
public static  void  main(String  market[])
{
	System.out.println("main started");
getsoaps();
System.out.println("main ended");
}
public static void getsoaps()
{
System.out.println("calling getsoaps method");
System.out.println("soaps available:");
for(int  i=0;i<soaps.length;i++)
{
System.out.println(soaps[i]);
}
System.out.println("end of soaps method");
return;
}
}