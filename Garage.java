class Garage
{
static String employe[]={"ganavi","aishu","bonda","ashritha","shwetha","harshitha","tanu","teja","sneha","rosii","rani","rupa","hema","veena","roopa"};
public static void main(String garage[])
{
System.out.println("main started");
getemploye();
System.out.println("main ended");
}
public static void getemploye()
{
System.out.println("calling getemploye method");
System.out.println("list of employes are:");
for(int i=0;i<employe.length;i++)
{
System.out.println(employe[i]);
}
System.out.println("end of employe method");
return;
}
}

