package test;

interface Shapee
{
 void input();
 void area();
}
class Circlee implements Shapee
{
 int r = 0;
 double pi = 3.14, ar = 0;
 @Override
 public void input()
 {
 r = 5;
 }

 @Override
 public void area()
 {
 ar = pi * r * r;
 System.out.println("Area of circle:"+ar);
 }
}
class Rectanglee extends Circlee
{
 int l = 0, b = 0;
 double ar;
 public void input()
 {
 super.input();
 l = 6;
 b = 4;
 }
 public void area()
 {
 super.area();
 ar = l * b;
 System.out.println("Area of rectangle:"+ar);
 }
}
public class Interface
{
 public static void main(String[] args)
 {
 Rectanglee obj = new Rectanglee();
 obj.input();
 obj.area();
 }

}
