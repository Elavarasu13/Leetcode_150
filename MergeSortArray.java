package Leetcode_150;

public class MergeSortArray {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		MergeSortArray merge = new MergeSortArray();
		int [] nums1 = {1,2,3,0,0,0};
		int [] nums2 = {2,5,6};
		int m =3;
		int n = 3;
	     merge.merge(nums1, m, nums2, n);
		for(int i=0;i<nums1.length;i++)
        {
        	System.out.println(nums1[i]);
        }

	}
	    public static void merge(int[] nums1, int m, int[] nums2, int n) 
	    {
	        int s1 = m-1 , s2 = n-1 ,  i = m+n-1;
	        while(s2 >= 0)
	        {
	            if(s1 >= 0 && nums1[s1] > nums2[s2])
	            {
	                nums1[i--] = nums1[s1--];
	            }
	            else{
	                nums1[i--] = nums2[s2--];
	            }
	        }
	    }

}
