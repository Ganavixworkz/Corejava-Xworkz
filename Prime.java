class Prime
{
static  String[]  shows={"farzi","the  boys","vadhandhi","devils","breath","the family man","guilty minds","seal team","the summer","mirzapur","may i help you","hostel daze","island","carnival row","station 19","hush hush","the flash","happy family"};
public static  void  main(String  prime[])
{
	System.out.println("main started");
getshows();
System.out.println("main ended");
}
public static void getshows()
{
System.out.println("calling getshows method");
System.out.println("shows  available:");
for(int  i=0;i<shows.length;i++)
{
System.out.println(shows[i]);
}
System.out.println("end of shows method");
return;
}
}