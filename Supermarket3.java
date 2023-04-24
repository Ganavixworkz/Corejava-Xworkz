class SuperMarket3
{
static  String[]  shampoos={"clinic plus","meera","sunsilk","chick","loreal","pantene","biotique","garnier","dove","himalaya","suave","nyle","patanjali","khadi","tresemme"};
public static  void  main(String  market[])
{
	System.out.println("main started");
getshampoos();
System.out.println("main ended");
}
public static void getshampoos()
{
System.out.println("calling getshampoos method");
System.out.println("shampoos  available:");
for(int  i=0;i<shampoos.length;i++)
{
System.out.println(shampoos[i]);
}
System.out.println("end of shampoos method");
return;
}
}