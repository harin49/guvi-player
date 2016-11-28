/*import java.util.*;

public class numFactorial
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int f=1;
		for(int i=2;i<=n;i++)
		{
			f=f*i;
		}

		System.out.println(f);
	}
}*/


import java.util.*;

public class numFactorial
{	
	public static int fact(int n)
	{	
		int a=n;
		int f = 1;
		if(a>0)
		{
			 f = a*fact(a-1);
		}

		return f;

	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(fact(n));
	}
}