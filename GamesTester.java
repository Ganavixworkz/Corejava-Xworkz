class GamesTester
{
public static void main(String game[]){
Games games = new Games("Cricket",11,"ICC","outdoor",1909);
System.out.println( games.name+ "\n" + games.players + "\n " + games.founders + "\n" + games.type + "\n" + games.year );

Games games1 = new Games("Hockey",11,"ICC","outdoor",1999);
System.out.println( games1.name+ "\n" + games1.players + "\n " + games1.founders + "\n" + games1.type + "\n" + games1.year );

Games games2 = new Games("Carrom",4,"ICC","indoor",1904);
System.out.println( games2.name+ "\n" + games2.players + "\n " + games2.founders + "\n" + games2.type + "\n" + games2.year );

Games games3 = new Games("volleyBall",9,"ICC","outdoor",1909);
System.out.println( games3.name+ "\n" + games3.players + "\n " + games3.founders + "\n" + games3.type + "\n" + games3.year );

Games games4 = new Games("HandBall",5,"ICC","outdoor",1907);
System.out.println( games4.name+ "\n" + games4.players + "\n " + games4.founders + "\n" + games4.type + "\n" + games4.year );

Games games5 = new Games("footBall",11,"ICC","outdoor",1907);
System.out.println( games5.name+ "\n" + games5.players + "\n " + games5.founders + "\n" + games5.type + "\n" + games5.year );

Games games6 = new Games("Boxing",11,"ICC","outdoor",1905);
System.out.println( games6.name+ "\n" + games6.players + "\n " + games6.founders + "\n" + games6.type + "\n" + games6.year );

Games games7 = new Games("BasketBall",11,"ICC","outdoor",1906);
System.out.println( games7.name+ "\n" + games7.players + "\n " + games7.founders + "\n" + games7.type + "\n" + games7.year );

Games games8 = new Games("Tennis",11,"ICC","Indoor",1999);
System.out.println( games8.name+ "\n" + games8.players + "\n " + games8.founders + "\n" + games8.type + "\n" + games8.year );

Games games9 = new Games("Weightlifting",1,"ICC","Indoor",1909);
System.out.println( games9.name+ "\n" + games9.players + "\n " + games9.founders + "\n" + games9.type + "\n" + games9.year );

}
}