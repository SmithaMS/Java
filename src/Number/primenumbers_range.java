package Number;

public class primenumbers_range {

	public static void main(String[] args) {
		int num1=1000;
		int num = 2,count = 2;
		boolean flag;
		
		for(;count<num1;count++)
		{
			flag = true;
			for(int i=2;i<num;i++)
			{
				                    
				if(num%i==0)
				{
					flag = false;
					break;
				}
			}
			if(flag)
			{
				System.out.print(num+" ");
				//count++;
			}
			num++;
		}
		
	}

}
