package FindSum;

import java.awt.List;
import java.util.ArrayList;


public class findSum {
public static ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {

	
	ArrayList<Integer> list=new ArrayList<Integer>();
	if(array==null||array.length<2)
		return list;
	for(int i=0,j=array.length-1;i<array.length;i++)
	{
		if(array[i]+array[j]==sum){
			list.add(array[i]);
			list.add(sum-array[i]);
			//System.out.println("i="+i+"min="+array[i]);
			//System.out.println(array[j]);
			return list;
		}
		
		if(array[i]+array[j]>sum)
				j--;
	
		
	}
	
//	System.out.println(list.get(0));
//	System.out.println(sum-list.get(0));
	
	
	return list;
	
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []array={1,2,4,7,11,16};
		ArrayList<Integer> list=new ArrayList<Integer>();
		list=FindNumbersWithSum(array,10);

		

	}
}
