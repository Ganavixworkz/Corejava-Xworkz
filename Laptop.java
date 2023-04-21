class Laptop
{
static String name="Dell";
static String processor="Intel i7";
static int hardDisc;
static int ssd;
static int ram=8;
static double price=72999.00;
public static void main(String a[])
{
	hardDisc = 1;
	ssd = 226;
System.out.println("The Configuration of Laptop; Name = "+name);
System.out.println("Processor = "+ processor);
System.out.println("Harddisc = "+ hardDisc+ "TB");
System.out.println("SSD = "+ ssd+ "GB");
System.out.println("RAM = "+ ram+ "GB");
System.out.println("Price = Rs."+ price);
}
}