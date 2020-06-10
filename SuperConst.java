package superconst;


class Rectangle
{
    int length;
    int breadth;
    
    Rectangle()
    {
        length=breadth=1;
    }
    Rectangle(int l,int b)
    {
        length=l;
        breadth=b;
    }
   
}

class Cuboid extends Rectangle
{
    int height;
    
    Cuboid()
    {
        height=1;
    }
    
    Cuboid(int h)
    {
        height=h;
    }
    Cuboid(int l,int b,int h)
    {
        super(l,b);
        height=h;
    }
    
    int volume()
    {
        return length*breadth*height;
    }
}


public class SuperConst 
{
    public static void main(String[] args) 
    {

        Cuboid c=new Cuboid(5,3,10);
        System.out.println(c.volume());
    }    
}

















class Parent
{
    Parent()
    {
        System.out.println("Non-Param of Parent");
    }
    Parent(int x)
    {
        System.out.println("Param of Parent "+x);
    }
}

class Child extends Parent
{
    Child()
    {
        System.out.println("Non-Param of Child");
    }
    Child(int y)
    {
        System.out.println("Param of Child");
    }
    Child(int x,int y)
    {
        super(x);
        System.out.println("2 Param of Child "+y);
    }
}










