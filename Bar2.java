class Bar2
{
static String[] alcohol={"Royal stag","Black label","black&white","100 piper's","budwiser","tuborg","signature","Teacher's","amrut","ballantine","kingfisher","oldmonk","black dog","bira","bro code"};
public static void main(String bar[]){
System.out.println("list of brands available:");
System.out.println("1:"+alcohol[0] + "\n"+ "2:"+alcohol[1] + "\n"+ "3:"+alcohol[2] + "\n"+ "4:"+alcohol[3] + "\n"+ "5:"+alcohol[4] + "\n"+
                   "6:"+alcohol[5] + "\n"+  "7:"+alcohol[6] + "\n"+ "8:"+alcohol[7] + "\n"+  "9:"+alcohol[8] + "\n"+ "10:"+alcohol[9] + "\n"+ 
				   "11:"+alcohol[10] + "\n"+ "12:"+alcohol[11] + "\n"+ "13:"+alcohol[12] + "\n"+ "14:"+alcohol[13] + "\n"+ "15:"+alcohol[14]);
				 System.out.println("list of brands available using here:");
				 for(int index=0;index<=alcohol.length-1;index++)
				  { 
			  System.out.println(alcohol[index]); }					  
				   }
}