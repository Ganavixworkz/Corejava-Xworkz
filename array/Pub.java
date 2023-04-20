class Pub
{
static  String[]  pubs={"ABC","skyyy","toit","district 6","loft 38","fennys","the  biere  club","dhamaka","the  boozy griffin","piccolo pub","toit brewpub","le rock","dropouts","pelican","amazing blue  pub","3gs pub","big  barrel","1522 the  pub","levels  pub"};
public static  void  main(String  pub[])
{
	System.out.println("main started");
getpubs();
System.out.println("main ended");
}
public static void getpubs()
{
System.out.println("calling getpubs method");
System.out.println("pubs in  banglore:");
for(int i=0;i<pubs.length;i++)
{
System.out.println(pubs[i]);
}
System.out.println("end of pubs method");
return;
}
}