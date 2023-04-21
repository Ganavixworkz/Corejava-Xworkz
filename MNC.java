class MNC
{
static  String[]  companies={"microsoft","wipro","infosys","ibm","google","oracle","hsbc","infotech","dell","accenture","tata","cordys","invensys","csc","cadence"};
public static  void  main(String  mnc[])
{
		System.out.println("main started");
getcompanies();
System.out.println("main ended");
}
public static void getcompanies()
{
System.out.println("calling getcompanies method");
System.out.println("MNC companies  are:");
for(int  i=0;i<companies.length;i++)
{
System.out.println(companies[i]);
}
System.out.println("end of companies method");
return;
}
}