package pgm;

public class Pattren
{
	public static void main(String[] args) {
		
	int space=3;
	int no=1;
	
	for(int i=1;i<=4;i++)
	{
		for(int j=1;j<=space;j++)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=no;k++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		no++;
		space--;
	}
	System.out.println("*********************");
	
	int space1=3;
	int no1=1;
	
	for(int i=1;i<=4;i++)
	{
		for(int j=1;j<=space1;j++)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=no1;k++)
		{
			System.out.print(k+" ");
		}
		System.out.println();
		no1++;
		space1--;
	}
	
	System.out.println("*********************");
	
	int space2=3;
	int no2=1;
	
	for(int i=1;i<=4;i++)
	{
		for(int j=1;j<=space2;j++)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=no2;k++)
		{
			System.out.print(k+"");
		}
			for(int l=no2-1;l>=1;l--)
		{
			System.out.print(l+"");
		
		}
		
		System.out.println();
		no2++;
		space2--;
	}
	
	System.out.println("*********************");

	int space3=0;
	int no3=4;
	
	for(int i=1;i<=4;i++)
	{
		for(int j=1;j<=space3;j++)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=no3;k++)
		{
			System.out.print(k+"");

		}
			for(int l=no3-1;l>=1;l--)
		{
			System.out.print(l+"");
		
		}
		
		System.out.println();
		space3++;
		no3--;
	}
System.out.println("*********************");
	
	int space4=3;
	int no4=4;
	
	for(int i=1;i<=4;i++)
	{
		for(int j=1;j<=space4;j++)
		{
			System.out.print(" ");
		}
		for(int k=no4;k<=4;k++)
		{
			System.out.print(k+"");
		}
			for(int l=4-1;l>=no4;l--)
		{
			System.out.print(l+"");
		
		}
		
		System.out.println();
		no4--;
		space4--;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
}
