class RiverTester
{
public static void main(String flow[])
{
River river = new River("Indus river","2900 km","jammu kashmir","union territory of chandigarh",5533);
System.out.println(river.name+ "\n" +river.km+ "\n" +river.state+ "\n" +river.region+ "\n" +river.velocity);

River river1 = new River("ganga","2525 km","gangothri","union territory of chandigarh",5533);
System.out.println(river1.name+ "\n" +river1.km+ "\n" +river1.state+ "\n" +river1.region+ "\n" +river1.velocity);

River river2 = new River("yamuna","2900 km","jammu kashmir","union territory of chandigarh",5533);
System.out.println(river2.name+ "\n" +river2.km+ "\n" +river2.state+ "\n" +river2.region+ "\n" +river2.velocity);

River river3 = new River("Brahmaputra","2900 km","jammu kashmir","union territory of chandigarh",5533);
System.out.println(river3.name+ "\n" +river3.km+ "\n" +river3.state+ "\n" +river3.region+ "\n" +river3.velocity);

River river4 = new River( "Mahanadi","2900 km","jammu kashmir","union territory of chandigarh",5533);
System.out.println(river4.name+ "\n" +river4.km+ "\n" +river4.state+ "\n" +river4.region+ "\n" +river4.velocity);
}
}