/*	[4, 5, 6, 7, 8]
4
5
6
7
8
*/

package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class array_to_collection {

	public static void main(String[] args) {
		int arr[] = {4,5,6,7,8};
		System.out.println(Arrays.toString(arr));
		ArrayList lst = new ArrayList<>(Arrays.asList(arr));
		for(int ar : arr)
		{
			//lst.add(ar);
			System.out.println(ar);
		
		}
		
	}

}
