class Hospital2
{
public static void main(String hospital[])
{
 int doctorsId[]={11,22,33,44,55};
for(int i=0;i<doctorsId.length;i++)
{
if(doctorsId[i]==33)
{
System.out.println(" Id is found "  +doctorsId[i]);
break;
}
else
{
System.out.println(" Id is not found ");
}
}
}
}
