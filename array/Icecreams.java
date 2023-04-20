class IceCreams
{
static  String[]  brands={"amul","cornetto","blue bunny","mother dairy","arun","talnti","nestle","drayers","cream bell","kwalitty walls","vadilal","dairy queen","havmor","magnum","talenti","tillamook"};
public static  void  main(String  icecream[])
{
	System.out.println("main started");
getbrands();
System.out.println("main ended");
}
public static void getbrands()
{
System.out.println("calling getbrands method");
System.out.println("icecream brands available:");
for(int  i=0;i<brands.length;i++)
{
System.out.println(brands[i]);
}
System.out.println("end of brands method");
return;
}
}