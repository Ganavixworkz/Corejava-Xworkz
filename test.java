1) Explain java and javac
  java:
  java is a highlevel object oriented programming language.
  *java is a command used to run the program.

  javac:
  *javac is a command in java used to compile the sourcecode to bytecode.
  
2) Explain JDK,JVM,JRE

JVM : Java Virtual Machine
    Tasks of JVM:
*It loads the program
*Verifies the program
*Executes the program
 Provides run time environment.
JVM is dependent.
JVM is virtually absent.


JDK : Java Development Kit
     JDK = JRE + development tools
   developments tools like compiler,debugger ...
JDk is depended.
JdK is virtually present.

JRE: java runtime environment
*JRE is the minimum requirement to execute the code.
 JRE = JVM + set of libraries
JRE is dependent.
JRE virtually present.
 
-> Thier are two times:Compile time 
                   Run time
-> only byte code in java is independent.


3)limitations of array:

* we cannot store the different type of datatypes values in a array.

4)Explain class,object and signature of class

class : class is a Template or a blueprint which  includes  states and  behaviours,
 here  states refers  to  variables and behaviours  refers to  methods.
      class  doesnt  take  a space in memory.

signature  :  class  className{
                  
                 }  
 ex:          class Tea{
                   }

Object: object is  instance of class.To create a multiple copies of class we create object.
        object  takes a space  in the memory.
 
  syntax: ClassName referencevariaable = new constructor();
       ex: Tea  tea = new Tea();


5) .javafile and .classfile
 
  .javafile : used to convert sourcecode to byte code

  .classfile :used to store byte code

6)  Method signature:
                   Method  is  a block of codes that combines to perform some functionality.

    Declaration : accessspecifier returntype methodName = parameters();
    methodsignature includes: methodname and  parameters.i.e 
                                   methodName  =  parameters();
               methodName : It  can  be  any name starting  with lowercase.
               parameters : it includes datatypes and  its  values.

7)what  is  java
   java is a highlevel object oriented programming language.
   It  is easy  to  understand ,it  is  userfriendly.

8)java IDe's:
ecllips
notepad
intelj idea

9)variable  and  its  types:

  variables  : It  is  a  container  which  stores  the  reference  of  a  data.
 declaration: datatype variablename;
initialization: datatype variableame = value;

types : 
    1:local variables -the variables which we declare inside the body of the method.
                       we need to initialize the values mandatorily.
    2:static variables - the variables which we declare before the method in the class using static keyword.
    3:instance variables - the variales which we declare before the method without using static keyword. 
    4:parameterized variables - the variables declaring within the paranthesis of a method.

10)15 javakeywords:
  int
  short
  long
  double
  float
  char
  boolean
  this
  extends
  private
  public
  protected
  import


12)datatypes and its types:
  datatypes: it represents the type of the data to be stored.
  types:primitive datatypes
        non-primitive datatypes
   primitive:int,short,long,float,double,char,boolean
  non-primitive:string,classname,interface,array

13)dot operation:
   dot operation is used to access the members of one to another.

14)java features:
   It is simple,easy to understand.
   java is secure as it uses the virtual machine JVM to run called sandbox.
   java is platformindependend as it can run in any platforms.
   java is  a object oriented programming language as it is completly includes real world entities.
   java is robust.
   java is distributed,multithreaded,high perfomance.

15)base class of all the classess
  object

16)methodoverloading:
  In a class minimum of twomethods which have same methodname but differenc in parameters.
 difference in parameters:length of the parameter.
                           type of the parameter.


example:  class Add{
           
public static void main(String args[])
{
public static int addition(int a,int b){
int a =1;
int b= 2;
}
public static int addition(int c){
int c= a+b;
return c;
}
System.out.println("addition of 2 numbers is:");
}
}
       
          
          





  
                             

        



  

 









  