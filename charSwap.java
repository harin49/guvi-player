import java.util.*;

public class charSwap
{


	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string:");
		String str = sc.nextLine();
		char[] ch = new char[str.length()];
		ch = str.toCharArray(); 
		String strs1 = "";
		String strs2 = "";

		for(int i=0;i<=ch.length-2;i+=2)
		{
			strs1 = strs1+ch[i+1]+ch[i];
		}	

		if(ch.length%2!=0)
		{
			strs2 = strs1+ch[ch.length-1];
			System.out.println(strs2);	
		}

		System.out.println(strs1);
	}
}