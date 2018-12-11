//Output : [1, 5, 6, 7, 9, 8, 2, 0, 3, 4]

package Number;

import java.util.LinkedHashSet;
import java.util.Set;

public class unique_randomNumbers {

	public static void main(String[] args) {
		Set set = new LinkedHashSet<>();
		while(set.size()<10)
		{
			 int i = (int)(10*Math.random());
			 if(!set.contains(i))
				 set.add(i);
		}
		System.out.println(set);

	}

}
