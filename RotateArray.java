package Leetcode_150;

public class RotateArray {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,4,5,6,7};
		int n =3;
		for(int i= 0;i<n;i++)
		{
		int j ,temp;
		temp = nums[nums.length-1];

		for(j = nums.length-1;j>0;j--)
		{
			nums[j] = nums[j-1];
		}
		nums[0] = temp;
	}
		for(int i =0;i<nums.length;i++)
		{
			System.out.println(nums[i]);
		}

}
}