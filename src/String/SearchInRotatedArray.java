package String;



class RotatedArray {
    public int search(int[] nums, int target)
    {
        for (int i=0 ; i<nums.length ;i++)
        {

            if(nums[i]==target)
                return i;


        }

        return -1;

    }
}
public class SearchInRotatedArray {



    public static void main(String[] args) {
        int[] a ={3,4,5,1,2};
        RotatedArray sol = new RotatedArray();
        System.out.println(sol.search(a,3));
    }

}
