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
class C extends B{
    public void S()
    {
        System.out.println("Hello all");
    }
}
public class Multilevel_Inheritance
{
    public static void main(String args[])
    {
        C h=new C();
        h.p();
        h.p();
        h.r();

    }
}
