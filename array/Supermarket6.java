class SuperMarket6
{
static  String[]  shirtsBrand={"ck","adidas","allen","levisben martin","diverse men","style ministry","ralph lauren","raymond","park avenue","us polo","john players","jack and jones","hanes","gap","hugo","parx","arrow"};
public static  void  main(String  market[])
{
	System.out.println("main started");
getshirtsBrand();
System.out.println("main ended");
}
public static void getshirtsBrand()
{
System.out.println("calling getshirtsBrand method");
System.out.println("shirtbrands available:");
for(int  i=0;i<shirtsBrand.length;i++)
{
System.out.println(shirtsBrand[i]);
}
System.out.println("end of shirtsbrands method");
return;
}
}