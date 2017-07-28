package FindTarget;

public class FindTarget {
	
	
	public static boolean Find(int target,int [][] arry)
	{
    int row=0;
    int col=arry[0].length-1;
    while(row<arry.length&&col>0)
        {
        if(target==arry[row][col])
        {  return true;}
        else{
       
            if(target>arry[row][col])
                row++;
        	else
                col--;
        }
        
        
    }
    return false;
		 
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]arry=new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		System.out.println(Find(13,arry));
		
	}

}
