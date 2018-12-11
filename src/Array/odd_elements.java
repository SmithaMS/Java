package Array;

public class odd_elements {

	public static void main(String[] args) {
		int arr[] = {10,21,30,33,41,57};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
				System.out.println(arr[i]);
		}

	}

}

/*Output:

21
33
41
57

*/