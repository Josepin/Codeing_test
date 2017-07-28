package SpinMin;

import java.util.Scanner;

public class SpinMin {
	
	 public static  int minNumberInRotateArray(int [] array) {
		 	 

		 if(array.length==0)
				return 0;
			int left=0;
			int right=array.length-1;
			int mid=left;
		 while(left<=right){
			
			  mid=(left+right)>>1;
			 if(array[mid]==array[left]&&array[left]==array[right]){
				int  min=array[0];
				for(int i=1;i<array.length;i++)
				{
					if(min>array[i])
					{
						min=array[i];
					}
				}
				return min;	 
			 }else{
				 if(array[mid]>array[left])
					 left=mid;
				 else
					 right=mid;
			 }
			
		 }
		 return mid;
		 
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int []num=new int[5];
		int a;
		System.out.println("请输入数组");
		for(int i=0;i<num.length;i++)
		{
			num[i]=scanner.nextInt();
		}
		a=minNumberInRotateArray(num);
		System.out.println("a="+a);
		
		
	}

}
