/*Output :
  	HTIHSRAH AHTIMS
	HTIHSRAH AHTIMS
*/

package String;

public class reverse_string {

	public static void main(String[] args) {
		String str = "SMITHA HARSHITH";
		String str1 = "";
		for(int i=str.length()-1;i>=0;i-- )
		{
			str1 = str1+str.charAt(i);
		}
		System.out.println(str1);
		
		// Using reverse method
		String str2 = new StringBuffer(str).reverse().toString();
		System.out.println(str2);
	}
	

}
