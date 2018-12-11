/*	Output:
  	[Google, Facebook, Tesla, Yahoo, Google, Facebook, Ecommerce]
	[Ecommerce, Facebook, Google, Tesla, Yahoo]
*/

package String;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class fetch_unique_value_sort {

	public static void main(String[] args) {
		String str[] = {"Google","Facebook","Tesla","Yahoo","Google","Facebook","Ecommerce"};
		System.out.println(Arrays.toString(str));
		//1st way
		Set hs = new TreeSet();
		for(String s : str)
			hs.add(s);
		System.out.println(hs);
	}

}
