// Output : 0 1 1 2 3 5 8 13 21 34 55 89 

package Number;

public class fibonacci_series {

	public static void main(String[] args) {
		int first = 0;
		int second = 1;
		int third = 0;
		System.out.print(first+" "+second+" ");
		while(first+second<=100)
		{
			third = first+second;
			System.out.print(third+" ");
			first = second;
			second = third;
			
		}

	}

}
