package test;
abstract class shape
{
int a=3,b=4;
abstract public void print_area();
}
class rectangle extends shape
{
 int area_rect;
@Override
public void print_area()
{
area_rect=a*b;
System.out.println("The area ofrectangle is:"+area_rect);
}
}
class triangle extends shape
{
int area_tri;
@Override
public void print_area()
{
area_tri=(int) (0.5*a*b);
System.out.println("The area oftriangle is:"+area_tri);
}
}

class circle extends shape
{
int area_circle;
@Override
public void print_area()
{
area_circle=(int) (3.14*a*a);
System.out.println("The area ofcircle is:"+area_circle);
}
}
public class Abstract {
public static void main(String[] args) {
rectangle r=new rectangle();
r.print_area();
triangle t=new triangle();
t.print_area();
circle r1=new circle();
r1.print_area();
}
}

