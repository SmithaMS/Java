//Output :- NUMBER: 12 is Adam

package Number;

public class adamsNumber {
	static int reverseNumber(int num)
	{
		int rev = 0;
		while(num>0)
		{
		rev = rev*10+num%10;
		num/=10;
		}
		return rev;
	}
	
	static int square(int num)
	{
		return (num*num);
	}
	
	static boolean checkAdamsNumber(int num)
	{
		int a = square(num);
		int b = square(reverseNumber(num));
		
		if(a==reverseNumber(b))
		return true;
		else
		return false;
		
	}

	public static void main(String[] args) {
		int num = 12;
		if (checkAdamsNumber(num))
			System.out.println("NUMBER: "+num+" is Adam");
		else
			System.out.println("NUMBER: "+num+" is not Adam");
	}


}
