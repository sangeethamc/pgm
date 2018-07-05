package pgm;

public class pattren 
{
	public static void main(String[] args)
	{	

		for(int i=0;i<=7;i++)
		{
			for(int j=0;j<=i;j++)
			{
				if(j%2==0)
				{
				System.out.print("1");
			}else{
				System.out.print("0");
			}
		}
			System.out.println();
	}
		System.out.println("*****************");
	
		char ch='A';
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
		System.out.println("*****************");
		
		for(char ar='A';ar<='D';ar++)
		{
			for(char c='A';c<=ar;c++)
			{
				System.out.print(ar);
			}
			System.out.println();
		}
}
}

