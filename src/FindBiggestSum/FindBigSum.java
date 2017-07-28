package FindBiggestSum;

public class FindBigSum {
	 public static int FindGreatestSumOfSubArray(int[] array) {
		 
		 int len=array.length;
		 int maxSum=array[0];
		 int curSum=array[0];
		 for(int i=1;i<len;i++)
		 {
			 curSum+=array[i];
			 if(curSum>maxSum)
			 {
				 maxSum=curSum;
			 }
			 if(curSum<0)
			 {
				 curSum=0;
			 }
			 
		 }
		 return maxSum;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []array={-5,-2,-3,-1,-8,-7,-6,-9};
		int a=FindGreatestSumOfSubArray(array);
//		for(int i=0;i<array.length;i++)
//		{
//			System.out.println(array[i]);
//		}
		System.out.println("a="+a);
	}

}
