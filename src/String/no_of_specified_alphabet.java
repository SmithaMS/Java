//Output : No of occurances are : 2

package String;

public class no_of_specified_alphabet {

	public static void main(String[] args) {
			String str = "SMITHA HARSHITH";
			
			//1st way
			int counter = 0;
   /*  		for(int i=0; i<str.length();i++)
			{
				if(str.charAt(i)=='A')
				counter++;
			}
			System.out.println(counter + " times");
	*/	
			//2nd way
			int index = 0;
			int i =0 ;
			while((index=str.indexOf('A', i))!=-1)
			{
				System.out.println(str.indexOf('A', i));
				counter++;
				i=index+1;
			}
			System.out.println("No of occurances are : "+counter);
	}

}
