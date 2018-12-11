/*Output:	654321
			654321
*/

package Number;

public class reverse_number {

	static int reverse(int i)
	{
		int reverse = 0;
		while(i>0)
		{
			int remainder = i%10;
			reverse = remainder+reverse*10;
			i=i/10;
		}
		return reverse;
		
	}
	public static void main(String[] args) {
		int i= 123456;
		
	System.out.println(reverse(i));
	
	//using string buffer
	i = Integer.parseInt((new StringBuffer(Integer.toString(i)).reverse().toString()));
	System.out.println(i);
	}

}
