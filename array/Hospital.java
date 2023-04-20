class Hospital
{
static String doctors[]={"ganavi","aishu","veena","bonda","aruna","shilpa","roopa","geetha","veda","rakshitha","radha","veena","seeta","rani","lakshmi"};
public static void main(String hospital[])
{
System.out.println("main started");
getdoctors();
System.out.println("main ended");
}
public static void getdoctors()
{
System.out.println("calling getdoctors method");
System.out.println("doctors names:");
for(  int i=0;i<=doctors.length-1;i++)
{
System.out.println(doctors[i]);
}
System.out.println("end of doctors method");
return;
}
}
