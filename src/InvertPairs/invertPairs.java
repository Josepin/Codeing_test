package InvertPairs;

import java.util.Arrays;

public class invertPairs {

	public static int pairs(int[] data){
		if(data==null||data.length<1)
		{
			throw new IllegalArgumentException("Array are null");
		}
		int []copy=new int[data.length];
		System.arraycopy(data, 0, copy, 0, data.length);
		return inversePairsCore(data,copy,0,data.length-1);
		
	}
	
	public static int inversePairsCore(int[]data,int[] copy,int start,int end)
	{
		if(start==end)
		{
			copy[start]=data[start];
			return 0;
		}
		
		int mid=(end-start)/2;
		int left=inversePairsCore(copy,data, start, start+mid);
		int right=inversePairsCore(copy,data, start+mid+1, end);
		int i=start+mid;
		int j=end;
		int count=0;
		int k=end;
		while(i>=start&&j>=start+mid+1){
			if(data[i]>data[j])
			{
				copy[k--]=data[i--];
				count+=j-(start+mid);
			}
			else{
				copy[k--]=data[j--];
				
			}
		}
		while(i>=start){
			copy[k--]=data[i--];
		}
		while(j>=start+mid+1){
			copy[k--]=data[j--];
		}
		return count+left+right;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []array={364,637,341,406,747,995,234,971,571,219,993,407,416,366,315,301,601,650,418,355,460,505,360,965,516,648,727,667,465,849,455,181,486,149,588,233,144,174,557,67,746,550,474,162,268,142,463,221,882,576,604,739,288,569,256,936,275,401,497,82,935,983,583,523,697,478,147,795,380,973,958,115,773,870,259,655,446,863,735,784,3,671,433,630,425,930,64,266,235,187,284,665,874,80,45,848,38,811,267,575};
       int n=pairs(array);
		System.out.println(n);

	}
	
}
