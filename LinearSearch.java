
//Write a program that will find your key is found in the given array using linear search method
//numbers=[1,6,9,3,5,4,7]
//key=5
public class LinearSearch {
    static int [] nums;

    public static void main(String[] args) {
        nums = new int[]{1,6,9,3,5,4,7};
        int result = Linear_Search(nums, 5);
        if(result == -1)
        {
            System.out.print("Not present in the array!");
        }
        else
            System.out.print("Number found at index "+result);
    }

    private static int Linear_Search(int [] nums,int search)
    {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==search)
            {
                return i;

            }
        }
        return -1;

    }



}
