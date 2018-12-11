// Output : [-1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

package Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class fetch_unique_value {

	public static void main(String[] args) {
		int arr[] = {9,0,0,1,1,1,2,1,0,3,4,5,5,5,4,6,7,8,-1};
		Set set = new TreeSet<>();
		for(int val:arr)
		{
			set.add(val);
			
		}
		System.out.println(set);
		
		
	/*				or
	 
		int arr1[] = new int[set.size()];
		int index =0;
		for(Object o:set)
		{
			arr1[index++] = ((Integer)o).intValue();
		}
		System.out.println(Arrays.toString(arr1));
	*/
	}

}
