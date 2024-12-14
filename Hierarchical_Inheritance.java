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
class C extends A
{
    public void S()
    {
        System.out.println("Hello all");
    }
}
public class Hierarchical_Inheritance
{
    public static void main(String args[])
    {
        B f=new B();
        f.p();
        f.r();
        C g=new C();
        g.p();
        g.S();
    }
}
