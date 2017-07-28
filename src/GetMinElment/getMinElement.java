package GetMinElment;

import java.util.Arrays;
import java.util.Comparator;

public class getMinElement {
	public static String PrintMinNumber(int [] numbers) {
		int n=numbers.length;
		if(n==0||numbers==null)
			return "";
		Integer[] nums=new Integer[n];
		for(int i=0;i<n;i++)
		{
			nums[i]=numbers[i];
			
		}
		Arrays.sort(nums, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return (o1+""+o2).compareTo(o2+""+o1);
			}
		});
		
		
		String ss=new String();
		for(int i=0;i<n;i++)
		{
			ss+=nums[i];
			
		}
		return ss;
		
		/*String []str=new String[n];
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<n;i++)
		{
			str[i]=String.valueOf(numbers[i]);
		}
		Arrays.sort(str, new Comparator<String>(){

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return (o1+o2).compareTo(o2+o1);
			}
			
		});
		for(int j=0;j<n;j++)
		{
			sb.append(str[j]);
			
		}
		return sb.toString();*/	
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arry=new int[]{992,931,9,765};
		System.out.println(PrintMinNumber(arry));
	
	}
	
}
