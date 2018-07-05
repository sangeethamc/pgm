package pgm;

import java.util.Scanner;

public class Spiral {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("emter the no of linese");
	int lines=sc.nextInt();
	int arr[][]=new int[lines][lines];
	int startindex=0;
	int endindex=4;
	int mid=endindex/2;
	arr[mid][mid]=1;
	int rounds=mid;
	int number=25;
	for(int i=0;i<rounds;i++)
	{
		for(int j=startindex;j<=endindex;j++)
		{
			arr[startindex][j]=number--;
		}
		for(int k=startindex+1;k<=endindex;k++)
		{
			arr[k][endindex]=number--;
		}
			for(int m=endindex-1;m>=startindex;m--)
			{
				arr[endindex][m]=number--;
			}
			for(int n=endindex-1;n>=startindex+1;n--)
			{
				arr[n][startindex]=number--;
			}
			startindex++;
			endindex--;
			
	}
	for(int row=0;row<=4;row++)
	{
		for(int col=0;col<=4;col++)
		{
			if(arr[row][col]<10)
			{
				System.out.print(" ");
			}
			System.out.print(arr[row][col]+" ");
		}
		System.out.println("");
	}
}
}
