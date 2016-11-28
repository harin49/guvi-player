import java.util.*;

public class strReverse
{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] ch = new char[str.length()];
		ch = str.toCharArray();

		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.println(ch[i]);

		}
	}
}