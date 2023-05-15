class RobotTester
{
public static void main(String robots[]){
Robot robot = new Robot("Black and silver","Industrial robot",600,16,8);
System.out.println(robot.color + "\n" + robot.type  + "\n " + robot.size + "\n" + robot.weight + "\n" + robot.height );

Robot robot1 = new Robot("Black and silver","cobot",600,16,9);
System.out.println(robot1.color + "\n" + robot1.type  + "\n " + robot1.size + "\n" + robot1.weight + "\n" + robot1.height );

Robot robot2 = new Robot("Black and silver","automation",700,17,10);;
System.out.println(robot2.color + "\n" + robot2.type  + "\n " + robot2.size + "\n" + robot2.weight + "\n" + robot2.height );

Robot robot3 = new Robot("Black and silver","Domestic robot",800,18,6);
System.out.println(robot3.color + "\n" + robot3.type  + "\n " + robot3.size + "\n" + robot3.weight + "\n" + robot3.height );

Robot robot4 = new Robot("Black and silver","Humanoids",500,14,8);
System.out.println(robot4.color + "\n" + robot4.type  + "\n " + robot4.size + "\n" + robot4.weight + "\n" + robot4.height );

Robot robot5 = new Robot("Black and white","universal robots",600,16,8);
System.out.println(robot5.color + "\n" + robot5.type  + "\n " + robot5.size + "\n" + robot5.weight + "\n" + robot5.height );

Robot robot6 = new Robot("Black and grey","medical robots",700,15,6);
System.out.println(robot6.color + "\n" + robot6.type  + "\n " + robot6.size + "\n" + robot6.weight + "\n" + robot6.height );

Robot robot7 = new Robot("Black and green","Android",800,12,7);
System.out.println(robot7.color + "\n" + robot7.type  + "\n " + robot7.size + "\n" + robot7.weight + "\n" + robot7.height );

Robot robot8 = new Robot("Black and silver","Entertainment robot",400,11,6);
System.out.println(robot8.color + "\n" + robot8.type  + "\n " + robot8.size + "\n" + robot8.weight + "\n" + robot8.height );

Robot robot9 = new Robot("Black and orange","Swarm robotics",400,13,10)
System.out.println(robot9.color + "\n" + robot9.type  + "\n " + robot9.size + "\n" + robot9.weight + "\n" + robot9.height );


}
}
