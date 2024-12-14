  public class Try_Catch_Finally
  {
    public static void main(String args[])
    {
      //try-catch
      try{
        int d=90/0;
      }
      catch(ArithmeticException v)
      {
        System.out.println("Bad Request");
      }
      try{
        int d=90/0;
      }
      catch(ArithmeticException v)
      {
        System.out.println("Catch block is running");
      }
      finally
      {
        System.out.println("Finally is running");
      }
    }
  }
