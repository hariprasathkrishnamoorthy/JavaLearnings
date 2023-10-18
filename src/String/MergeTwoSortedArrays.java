package String;


import java.util.Arrays;

class Merge {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double result=0;

        int a1 = nums1.length;
        // determines length of secondArray
        int b1 = nums2.length;

        // resultant array size
        int c1 = a1 + b1;

        // create the resultant array
        int[] nums3 = new int[c1];

        System.arraycopy(nums1, 0, nums3, 0, a1);
        System.arraycopy(nums2, 0, nums3, a1, b1);
        Arrays.sort(nums3);


        if(nums3.length%2==0)
        {
            result= (double)( nums3[(nums3.length/2)-1] + nums3[(nums3.length/2)])/2 ;
        }
        else
        {
            result=nums3[(nums3.length/2)] ;


        }


        return result;

    }
}

public class MergeTwoSortedArrays
{

    public static void main(String[] args) {
        Merge sol = new Merge();
        int[] a ={1,2,3,4,5};
        int[] b ={6,7,8,9,10};
        System.out.println(sol.findMedianSortedArrays(a,b));



    }


}
