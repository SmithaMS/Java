/* WAP which takes 2 strings as input from the user(str1 and str2)
  and it should print 2 strings as output(op1 and op2)
  op1- should contains all the characters which are present in str1 but not in str2
  op2 -should contains all the characters which are present in str2 but not in str1
  */
 

package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class string_to_arraylist_output {

	public static void main(String[] args) {
		String str1 = "Smitha";
		String str2 = "Surabhi";
		
		//converting str1 to array of characters strToChararray1
		char[] strToChararray1= str1.toCharArray();
	     String charArray1 = Arrays.toString(strToChararray1);	
		
	     char[] strToChararray2= str2.toCharArray();
	     String charArray2 = Arrays.toString(strToChararray2);
		
		List lst1 = new ArrayList(Arrays.asList(charArray2));
				
		
		List lst2 = new ArrayList(Arrays.asList(charArray2));
		
		
		System.out.println(lst1.removeAll(lst2));
		System.out.println(lst1);

	}

}
