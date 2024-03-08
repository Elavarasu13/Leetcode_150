package Leetcode_150;

public class Jump {

	public static void main(String[] args) 
		{
		int nums[] = {2,3,1,1,4};
         
		Jump j = new Jump();
		boolean b=j.jumpgame(nums);
		System.out.println(b);
	
}

	private boolean jumpgame( int A[]) 
	{
		// TODO Auto-generated method stub
	//	for(int i = 0;i< nums.length;i = i+nums[i])
	//	{
	  //     while(nums[i] == 0)
	    //   {
	    	 //  return false;
	    //   }
	//	}
	//	return true;
		
		if(A.length <= 1)
        return true;
 
    int max = A[0]; //max stands for the largest index that can be reached.
 
    for(int i=0; i<A.length; i++){
        //if not enough to go to next
        if(max <= i && A[i] == 0) 
            return false;
 
        //update max    
        if(i + A[i] > max){
            max = i + A[i];
        }
 
        //max is enough to reach the end
        if(max >= A.length-1) 
            return true;
    }
 
    return false;    
}
}