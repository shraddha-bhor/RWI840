public class methodoverloading {

	public static void main(String[] args) 
	{
		
      A a=new A();
	  System.out.println(a.mul(2,3));
	  A.mul(2,3,4);
	}
}
class A
{
	public int mul(int a,int b)
	{
		return a*b;
	}
	public static void mul(int a,int b,int c)
	{
		System.out.println(a*b*c);
	}
}


