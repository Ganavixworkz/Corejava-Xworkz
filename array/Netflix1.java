class Netflix1
{
static String KannadaMovies[]={"kgf","googly","mungaru male","yajamana","kranthi","kantara","veda","uppi","upendra","A"};
static String tamilMovies[]={"ps-1","vathi","vikram","varisu","master","sir"};
public static void main(String netfix[])
{
System.out.println("main started");
getKannadaMovies();
gettamilMovies();
System.out.println("main ended");
}
public static void getKannadaMovies()
{
System.out.println("calling getKannadaMovies method");
System.out.println("list of KannadaMovies are:");
for(int i=0;i<KannadaMovies.length;i++)
{
System.out.println(KannadaMovies[i]);
}
System.out.println("end of KannadaMovies method");
return;
}
public static void gettamilMovies()
{
System.out.println("calling getTamilMovies method");
System.out.println("list of tamilMovies are:");
for(int i=0;i<tamilMovies.length;i++)
{
System.out.println(tamilMovies[i]);
}
System.out.println("end of tamilMovies method");
return;
}
}

