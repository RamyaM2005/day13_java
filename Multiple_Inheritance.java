import java.util.*;
interface A{
public void r();
} 
interface B
{
    public void r1();
}
class C implements A,B{
public void r()
{
    System.out.println("Hello");
}
public void r1()
{
    System.out.println("Hii");
}
} 
public class Multiple_Inheritance
{
    public static void main(String args[])
    {
        C h1=new C();
        h1.r();
        h1.r1();

    }
}