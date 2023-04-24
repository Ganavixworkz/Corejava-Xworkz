class Netflix
{
static  String[]  series={"stranger things","wednesday","1899","the  glory","dahmer","rana naidu","class","mai","khakee","she","tomorrow","cat","manifest","all of us are dead","dark desire","outer banks","the recruit"};
public static  void  main(String  shows[])
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