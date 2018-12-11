/*Output :
 
 ----before sorting----
[23, 17, 54, 12, 29]
---After sorting---
[12, 17, 23, 29, 54]
*/

package Number;

import java.util.Arrays;

public class bubble_sort {

	public static void main(String[] args) {
		int arr[] = new int []{23,17,54,12,29};
		System.out.println("----before sorting----");
		System.out.println(Arrays.toString(arr));
		
		int temp=0;
		boolean flag = true;
		while(flag)
		{
			flag = false;
			for(int i=0;i<arr.length-1;i++)
			{
				if(arr[i]>arr[i+1])
				{
					temp = arr[i];
					arr[i]= arr[i+1];
					arr[i+1]= temp;
					flag=true;
					
				}
			}
		}
		System.out.println("---After sorting---");
		System.out.println(Arrays.toString(arr));
	}

}
