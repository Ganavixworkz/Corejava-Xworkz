class College
{
static  String[]  departmentNames={"bca","bba","mba","b com","m com","bsc","mca","puc","pharmacy","mechanical","cs","civil","electronics","b pharma","m pharma"};
public static  void  main(String  college[])
{
System.out.println("main started");
getdepartmentNames();
System.out.println("main ended");
}
public static void getdepartmentNames()
{
System.out.println("calling getdepartmentNames method");
System.out.println("dapartment  names:");
for(int  i=0;i<departmentNames.length;i++)
{
System.out.println(departmentNames[i]);
}
System.out.println("end of departmentNames method");
return;
}
}
