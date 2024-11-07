package test;

class MyException extends Exception{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
String str1;
MyException(String str2) {
str1=str2;
}
public String toString(){
return ("MyException Occurred: "+str1) ;
}
}
public class Example1 {
public static void main(String[] args)
{
try{
System.out.println("Starting of try block");
// I'm throwing the custom exception using throw
throw new MyException("This is My error Message");
}
catch(MyException e){
System.out.println("Catch Block") ;
System.out.println(e) ;
}
}
}
