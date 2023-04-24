class CreditCard
{
static  String[]  cardNames={"sbi credit card","axis bank credit card","canara credit cards","barclays","business cards","citigroup","chase bank","rbl bank credit cards"};
public static  void  main(String  creditcard[])
{
System.out.println("main started");
getcardNames();
System.out.println("main ended");
}
public static void getcardNames()
{
System.out.println("calling getcardNames method");
System.out.println("credit card names:");
for(int  i=0;i<cardNames.length;i++)
{
System.out.println(cardNames[i]);
}
System.out.println("end of cardNames method");
return;
}
}
