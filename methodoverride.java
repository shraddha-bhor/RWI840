public class methodoverride extends A {

	public static void main(String[]args)
	{
        methodoverride a=new methodoverride();
		a.sing();
		a.run();
	}
     public void sing()
	{
		 System.out.println("singing");
	}
	public void run()
	{
		System.out.println("running");
	}
}
 abstract class A
   {
        abstract public void sing();
         public  void run()
     	{
    	}

}
