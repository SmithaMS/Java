/*Output:
    [Today, is, bright, sunny, day, here, in, Bangalore]
	[is, in, day, here, Today, sunny, bright, Bangalore]

 */


package others;

import java.util.Arrays;

public class sortsentence_basedonlength_of_words {

		public static void main(String[] args) {
			String str = "Today is bright sunny day here in Bangalore";
			String words[] = str.split(" ");
			System.out.println(Arrays.toString(words));
			String temp="";
			boolean flag = true;
			while(flag)
			{
				flag = false;
			for(int i=0;i<words.length-1;i++)
			{
			
				if(words[i].length()>words[i+1].length())
				{
					temp = words[i];
					words[i] = words[i+1];
					words[i+1] = temp;
					flag = true;
				}
			}
			}
			System.out.println(Arrays.toString(words));
		}

	}



