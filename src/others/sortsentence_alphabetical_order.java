/*		OUTPUT
 * [Today, is, bright, sunny, day, here, in, Bangalore]
	[Bangalore, Today, bright, day, here, in, is, sunny]
 * */

package others;

import java.util.Arrays;

public class sortsentence_alphabetical_order {

	
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
			
				if(words[i].compareTo(words[i+1])>0)
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


