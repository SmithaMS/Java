/*	Output:
 	19 :its a prime
 	9 : Is not a prime
 */

package Number;

public class prime_number {

	public static void main(String[] args) {
		int num = 9;
		boolean flag = false;
		for(int i=2;i<num/2;i++)
		{
			if(num%i==0)
			{
				flag = true;
				break;
			}
		}
		if(flag)
				System.out.println(+num+" : Is not a prime");
		else
				System.out.println(+num+" :its a prime");
		}

	}
