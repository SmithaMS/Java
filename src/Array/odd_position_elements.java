package Array;

public class odd_position_elements {

	public static void main(String[] args) {
		int arr[] = {10,70,30,41,50,60};
		for(int i=1;i<arr.length;i+=2)
		{
			System.out.println(arr[i]);
		}

	}

}

/*Output:
 
70
41
60

*/
 