package Ood;

import java.util.Scanner;

public class OodElement {
	  public  static void reOrderArray(int [] array) {

			for(int i=1;i<array.length;i++)
			{
				for(int j=i;j>0;j--)
				{
					if(array[j]%2==1&&array[j-1]%2==0)
					{
						int temp=array[j];
						array[j]=array[j-1];
						array[j-1]=temp;
					}
				}
				
			}
		  
		  //	        int len=array.length;
//	        int [] num=new int [len];
//	        int n=0;
//	        for(int i=0;i<len;i++)
//	        {  
//	        	if(array[i]%2!=0)
//	        	{
//	        		num[n++]=array[i];
//	        	}
//	        	
//	        }
//	        for(int i=0;i<len;i++)
//	        {  
//	        	if(array[i]%2==0)
//	        	{
//	        		num[n++]=array[i];
//	        	}
//	        	
//	        }
//	        for(int i=0;i<n;i++)
//	        {
//	        	array[i]=num[i];
//	        }
//	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int []num=new int[5];
		//int a;
		System.out.println("请输入数组");
		for(int i=0;i<num.length;i++)
		{
			num[i]=scanner.nextInt();
		}
		reOrderArray(num);
	}

}
