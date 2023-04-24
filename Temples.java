class Temples
{
static  String[]  godnames={"sai baba","venkateshwara","shiva","ganapathi","hanuman","durga","saraswathi","lakshmi","chamundeshwari","annapoorna","mahakali","vishnu","rama","gangamma","anamma"};
public static  void  main(String  temple[])
{
	System.out.println("main started");
getgodnames();
System.out.println("main ended");
}
public static void getgodnames()
{
System.out.println("calling getgodnames method");
System.out.println("god names:");
for(int  i=0;i<godnames.length;i++)
{
System.out.println(godnames[i]);
}
System.out.println("end of godnames method");
return;
}
}