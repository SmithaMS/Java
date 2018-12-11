/*Output:
 * Before reset: [10, 20, 20, 40]
After reset: [0, 0, 0, 0]
*/

package Array;

import java.util.Arrays;

public class reset_array {

	public static void main(String[] args) {
		int arr[] = {10,20,20,40};
		System.out.println("Before reset: "+Arrays.toString(arr));
		for(int i = 0;i<arr.length;i++)
		{
			arr[i]= 0;
		}
		
		System.out.println("After reset: "+Arrays.toString(arr));
	}

}
