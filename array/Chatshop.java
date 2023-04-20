class ChatShop
{
static  String[]  chats={"gobi","golgappa","sev puri","panipuri","masala puri","dai puri","noodels","maggie","eggrrice","friedrice","crazychat","samosa","samosa  masala","momos","bajji"};
public static  void  main(String  chatshop[])
{
System.out.println("main started");
getchats();
System.out.println("main ended");
}
public static void getchats()
{
System.out.println("calling getchats method");
System.out.println("chats available:");
for(int i=0;i<chats.length;i++)
{
System.out.println(chats[i]);
}
System.out.println("end of chats method");
return;
}
}
