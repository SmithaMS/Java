/*Output:
 * [50, 40, 30, 20, 10]
50
40
30
20
10
*/

package Array;

import java.util.Arrays;

public class reverse_array {

	public static void main(String[] args) {
		int arr[] = new int []{10,20,30,40,50};
		int start_index =0;
		int end_index = arr.length-1;
		int temp=0;
		
		for(int i=0;i<2;i++)
		{
			temp = arr[start_index];
			arr[start_index]= arr[end_index];
			arr[end_index]= temp;
			
			start_index++;
			end_index--;
			
		}
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);

	}

}
