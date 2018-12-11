//Output : No of times the is 4 times

package String;

public class noOfOccurance_ofWord_inaString {

	public static void main(String[] args) {
		String str = "the bird is beautiful and the girl is watching the bird and boy is watching the birds";
		String word = "the";
		int i =0, index = 0 ,counter= 0 ;
		while((index = str.indexOf(word, i))!=-1)
		{
			counter++;
			i = index+word.length();
		}
		System.out.println("No of times " +word+  " is " +counter+ " times");
	}

}
