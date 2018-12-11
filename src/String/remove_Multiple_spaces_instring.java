/*	Output:
    Before: Hello    am           learning Java &    Selenium
	After: Hello am learning Java & Selenium 
*/

package String;

public class remove_Multiple_spaces_instring {

	public static void main(String[] args) {
		String str = "Hello    am           learning Java &    Selenium";
		String str1 = "";
		String words[] = str.split(" ");
		for(int i=0;i<words.length;i++)
		{
			if(words[i].length()>0)
			str1 = str1+words[i]+" ";
		}
		System.out.println("Before: "+str);
		System.out.println("After: "+str1);

	}

}
