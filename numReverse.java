import java.util.*;

public class numReverse
{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int rev = 0;
		int temp = 0;
		int last = 0;

		while(n>0)
		{
			last = n%10;
			rev = rev*10+last;
			n=n/10;
		}

		System.out.println(rev);
	}
}