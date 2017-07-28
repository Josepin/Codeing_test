package findMore;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class findmoremindle {
	public static int findtarget(int []array){
		if(array.length==0)
			return 0;
		Map<Integer, Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<array.length;i++)
		{
			if(!map.containsKey(array[i])){
				map.put(array[i], 1);
			}else{
				int count=map.get(array[i]);
				map.put(array[i], ++count);
			}
		}
		Iterator iterator=map.entrySet().iterator();
		while(iterator.hasNext()){
			Map.Entry entry=(Map.Entry)iterator.next();
			Integer key=(Integer)entry.getKey();
			Integer val=(Integer)entry.getValue();
			if(val*2>(array.length))
					return key;
		}
		return 0;
		}
		
		
		/*int target=array[0];
		int count=1;
		int n=array.length;
		if(n==0)
			return 0;
		for(int i=1;i<array.length;i++)
		{
			if(array[i]==target)
			
				count++;
			
			else count--;
			if(count==0)
			{
				target=array[i];
				count=1;
			}
		}
		System.out.println("target:"+target);
		count=0;
		for(int j=0;j<array.length;j++)
		{
			if(array[j]==target)
				count++;
		}
		System.out.println("count:"+count);
		if(count*2>n)
			return target;
		return 0;
	}*/
//		int low=0;
//		int high=array.length;
//		if(high==0)
//			return 0;
//		quickSort(array,low,high-1);
//		for(int i=0;i<array.length;i++)
//		{
//			System.out.println(array[i]+"");
//		}
//		System.out.println("*****"+array[high/2]);
//		int target=array[high/2];
//		System.out.println("target"+target);
//		int count=0;
//		for(int i=0;i<array.length;i++)
//		{
//			if(array[i]==target)
//			count++;
//			
//		}
//		System.out.println("count="+count);
//		if(count*2>high)
//			return target;
//		return 0;
//		
//	}
//	public static void quickSort(int array[],int low,int high)
//	{
//		if(low<high)
//		{
//			int pivot=partition(array,low,high);
//			quickSort(array, low, pivot-1);
//			quickSort(array, pivot+1, high);
//			
//		}
//		
//	}
//	
//	public static int partition(int []array,int low,int high)
//	{
//		int pivot=array[low];
//		while(low<high)
//		{
//			while(low<high&&array[high]>=pivot) --high;
//			array[low]=array[high];
//			while(low<high&&array[low]<=pivot) ++low;
//			array[high]=array[low];
//			
//		}
//		array[low]=pivot;
//		return low;
//		
//		
//	}
//	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []array={1,2,2,2,3,2,5,2,4};

		int a=findtarget(array);
//		for(int i=0;i<array.length;i++)
//		{
//			System.out.println(array[i]);
//		}
		System.out.println("a="+a);

	}
}
