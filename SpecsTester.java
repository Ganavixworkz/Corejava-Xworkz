class SpecsTester
{
public static void main(String vision[])
{
 Specs specs = new Specs("Black","titan",2000,-0.1,1);
System.out.println(specs.color+ "\n" +specs.price+ "\n" +specs.brandName+ "\n" +specs.lensPower+ "\n" +specs.warranty);

Specs specs1 = new Specs("blue","fasttrack",3000,0.2,2);
System.out.println(specs1.color + "\n" + specs1.price +"\n" + specs1.brandName +"\n" + specs1.lensPower +"\n" + specs1.warranty);

Specs specs2 = new Specs("grey","gucci",1000,0.3,3);
System.out.println(specs2.color + "\n" + specs2.price +"\n" + specs2.brandName +"\n" + specs2.lensPower +"\n" + specs2.warranty);

Specs specs3 = new Specs("brown","lenscart",3040,0.4,2);
System.out.println(specs3.color + "\n" + specs3.price +"\n" + specs3.brandName +"\n" + specs3.lensPower +"\n" + specs3.warranty);

Specs specs4 = new Specs("green","carrera",2050,0.5,3);
System.out.println(specs4.color + "\n" + specs4.price +"\n" + specs4.brandName +"\n" + specs4.lensPower +"\n" + specs4.warranty);

Specs specs5 = new Specs("pink""ray-ban",2500,0.6,1);
System.out.println(specs5.color + "\n" + specs5.price +"\n" + specs5.brandName +"\n" + specs5.lensPower +"\n" + specs5.warranty);

Specs specs6 = new Specs("red","prada",3500,0.7,5);
System.out.println(specs6.color + "\n" + specs6.price +"\n" + specs6.brandName +"\n" + specs6.lensPower +"\n" + specs6.warranty);

Specs specs7 = new Specs("darkblue","coolwinks",1500,0.8,3);
System.out.println(specs7.color + "\n" + specs7.price + "\n" + specs7.brandName + "\n" + specs7.lensPower + "\n" + specs7.warranty);

Specs specs8 = new Specs("skyblue","vincent chase",3055,0.9,0);
System.out.println(specs8.color + "\n" + specs8.price + "\n" + specs8.brandName + "\n" + specs8.lensPower + "\n" + specs8.warranty);

Specs specs9 = new Specs("yellow","killer x",3020,1,1);
System.out.println(specs9.color + "\n" + specs9.price + "\n" + specs9.brandName + "\n" + specs9.lensPower + "\n" + specs9.warranty);

}
}