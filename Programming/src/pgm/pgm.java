package pgm;

public class pgm {
	public static void main(String[] args)
	{	
		int space=3;
		int star=1;
		for(int i=0;i<=3;i++)
		{
			for(int j=0;j<space;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<star;k++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
			space--;
			star++;
		}
		
		System.out.println("*************");
		int row=5;
		for(int i=0;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j>1&j<3||i==j || j==row-i+1 ||i==row)
				{
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}

}
