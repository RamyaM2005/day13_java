import java.util.*;
class A //A is a parent class
{
    public void p()
    {
    System.out.println("Hello Students");
    }
}
class B extends A
{
    public void r()
    {
        System.out.println("Hello Sir");
    }
}
public class Single_Inheritance
{
    public static void main(String args[])
    {
        A h=new A();
        h.p();
        B y=new B();
        y.p();
        y.r();

    }
}
