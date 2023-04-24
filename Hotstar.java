class Hotstar
{
static  String[]  series={"the night manager","santhwanam","taza khabar","dear ishq","grahan","euphoria","the legend of hanuman","aar ya paar","mendua","criminal justice","special ops","koodevide","ajooni","dahan","shoorveer"};
public static  void  main(String  hotstar[])
{
	System.out.println("main started");
getseries();
System.out.println("main ended");
}
public static void getseries()
{
System.out.println("calling getseries method");
System.out.println("series  available:");
for(int  i=0;i<series.length;i++)
{
System.out.println(series[i]);
}
System.out.println("end of series method");
return;
}
}