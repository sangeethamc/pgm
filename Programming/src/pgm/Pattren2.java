package pgm;

public class Pattren2 {

	public static void main(String[] args)
	{	
		int no=1;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(no);
				no++;
				if(no>9)
				{
					no=1;
				}
			}
			System.out.println();
}
		System.out.println("************");
		
		
		
		for(int i=0;i<=6;i++)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(j+" ");	
				
			}
			System.out.println();
		}
		
		System.out.println("************");	
		
		for(int i=0;i<=6;i++)
		{
			for(int k=1;k<=i;k++)
			{
				System.out.print(k+" ");
			}
			for(int j=i-1;j>=1;j--)
			{
				
				System.out.print(j+" ");				
			}
			System.out.println();
	}	
		
}
}

