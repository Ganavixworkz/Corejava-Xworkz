class Tour
{
static  String[]  places={"tirupati","gokarna","goa","pondichery","bali","talakad","chikmanglore","mysore","hampi","shiridi","shivana samudra","manali","darmasthala","hornadu","varnasi"};
public static  void  main(String  tour[])
{
	System.out.println("main started");
getplaces();
System.out.println("main ended");
}
public static void getplaces()
{
System.out.println("calling getplaces method");
System.out.println("tourist places:");
for(int  i=0;i<places.length;i++)
{
System.out.println(places[i]);
}
System.out.println("end of places method");
return;
}
}